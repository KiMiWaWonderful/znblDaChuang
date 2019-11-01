$(function() {

  var websocket = null;
  var roleName = ['反方四辩', '反方三辩', '反方二辩', '反方一辩', 'null', '正方一辩', '正方二辩', '正方三辩', '正方四辩'];
  var sc = null;
  var first = false; //用first变量判断其是否第一次点击成为辩手
  var userId = 1000;
  var roleId = 9;
  var roomId = 10000;
  var userName = "KiMiWaWonderful";
  var avatarSrc = "http://placehold.it/40x40";
  var $center = $(".chatleft>.center");
  var $userLi = null;
  var $img = $("<img src = '" + avatarSrc + "'>");
  var $span = $("<span>" + userName + "</span>");
  var selectableId = null;
  var responderId = null;
  var questionerId = null;
  var timer0 = null;
  var dat1 = new Date();
  var startTime = 0;
  var endTime = 0;
  var msg = {
    round: 0,
    num: 0,
    choice: 0,
    ID: 0,
    PosReTime: 300,
    NegReTime: 300,
    judgement: 0
  };

  $(".loading").fadeOut(1000);

  var finishbtn = $(".finishbtn");
  var sendbtn = $(".sendbtn");
  var textarea = $("#textarea");
  var chatmsg = $(".chatMsg");
  var nullmsg = $("#nullMsg");
  var failmsg = $("#failMsg");
  var forbiddenmsg = $("#forbiddenMsg");
  var modal = $(".modal");
  var modalform = $("#modal-form");
  var modalbtn = $("#confirmBtn");
  var reg = /^[" "]*$/;
  nullmsg.hide();
  failmsg.hide();
  forbiddenmsg.hide();
  //判断当前浏览器是否支持WebSocket
  if('WebSocket' in window) {
    // 这个路径就是连接服务器的，与@ServerEndpoint("/websocket")一致
    websocket = new WebSocket("ws://192.168.0.158:8080/websocket/" + userId + "/" + userName + "/" + roleId + "/" + roomId);
  } else {
    alert('Your browser not support websocket');
  }

  //连接发生错误的回调方法
  websocket.onerror = function() {
    console.log("cannot connect");
    failmsg.show();
  };

  //连接成功建立的回调方法
  websocket.onopen = function() {
    console.log("websocket opened");
    failmsg.hide();
  };

  websocket.onclose = function() {
    console.log("WebSocket连接关闭");
    failmsg.show();
  };

  //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
  window.onbeforeunload = function() {
    websocket.close();
    failmsg.show();
  };

  function addMsg(msg, msgclass, lor, name) {
    var $li = $("<li></li>");
    var $msgdiv = $("<div></div>");
    var $contentdiv = $("<div></div>");
    var $name = $("<p></p >");
    var $msg = $("<p></p >");

    $("<img>").addClass(msgclass).css({
        "border-radius": "20px",
        "vertical-align": "top"
      }).attr("src", "http://placehold.it/40x40")
      .appendTo($msgdiv);

    $contentdiv.addClass("content").addClass(msgclass).addClass("clearfix");

    $name.addClass("namecard").addClass(lor).text(name).appendTo($contentdiv);

    $msg.addClass("msgcard").addClass(msgclass).text(msg).appendTo($contentdiv);

    $contentdiv.appendTo($msgdiv);
    $msgdiv.addClass(msgclass).appendTo($li);
    $li.appendTo(chatmsg);

    var $msgView = $(".chatright>.center");
    var $msgs = $(".center>ul");

    $msgView.stop().animate({
      scrollTop: $msgs.height() - $msgView.height() + 40
    }, 300);
  }

  //结束发言的按钮绑定
  finishbtn.click(function() {
    //清除延时调用，以避免不必要的代码执行
    clearTimeout(timer0);
    $("#buzzer").remove();
    endTime = dat1.getTime();
    //更新剩余时间
    msg[roleId > 0 ? "PosReTime" : "NegReTime"] -= (endTime - startTime) / 1000;
    textarea.prop("disabled", true);
    msg.judgement = 1;
    msg.ID = roleId;
    websocket.send(JSON.stringify(msg));
  })

  //发送信息的按钮绑定
  sendbtn.click(function() {

    if(reg.test(textarea.val())) {
      if(textarea.attr("disabled")) {
        forbiddenmsg.show().delay(1500).fadeOut();
        return;
      }

      nullmsg.show().delay(1500).fadeOut();
      textarea.val("");
      return;
    }

    websocket.send(textarea.val());
    addMsg(textarea.val(), "msgright", "right", userName);
    textarea.val("");
  });

  //选择回答者的按钮响应
  modalbtn.click(function() {
    responderId = modalform.find(":checked").attr("value");
    msg.choice = responderId;
    websocket.send(JSON.stringify(msg));
  })

  //测试用代码,开始第一阶段的按钮
  $('#test').click(function() {
    msg.round = 1;
    msg.num = 0;
    console.log(JSON.stringify(msg));
    $center.find("[id=role" + roleId + "]").append("<button class = 'btn btn-primary btn-sm' id='buzzer' style='margin:10px'>抢答</button>");
    $(".footer .finishbtn").css("display", "block");
  })

  $(websocket).on("message", function(e) {
    console.log(e);
    if(e.originalEvent.data) {
      var data = JSON.parse(e.originalEvent.data);
      $(".num").text(data.num);
      if(data.id != userId && data.id != 10544) {
        addMsg(data.msg, "msgleft", "left", data.name);
      } else if(data.id == 10544) {
        $(".userList>li").empty().append($("<div><i class='fa fa-plus-circle'></i></div>")).addClass("unselected");
        for(var key in data.msg) {
          $("#role" + data.msg[key].roleId).empty().append($("<span>" + data.msg[key].name + "</span>").prepend($("<img src = '" + avatarSrc + "'>")));
          $("#role" + data.msg[key].roleId).removeClass("unselected");
        }
      }

      if(data.message) {
        sc = data.message;
        switch(sc.round) {
          case 1:
            //更新num和round
            msg.round = sc.round;
            msg.num = sc.num++;
            //只有对应辩手能够发言
            if(roleId != sc.ID) {
              textarea.prop("disabled", true);
            } else {
              textarea.prop("disabled", false);
              //发言结束后的操作
              setTimeout(function() {
                addMsg("还有30秒结束发言", "msgleft", "left", "系统消息");
                setTimeout(function() {
                  addMsg("Times up!", "msgleft", "left", "系统消息");
                  textarea.prop("disabled", true);
                  if(msg.num == 2) { //第一阶段结束,开始第二阶段
                    msg.round = 2;
                    msg.num = 0;
                    msg.choice = 0;
                    websocket.send(JSON.stringify(msg));
                  } else {
                    websocket.send(JSON.stringify(msg));
                  }
                }, 30000)
              }, sc.time * 1000 - 30000);
            }
            break;
          case 2:
            //更新num和round
            msg.round = sc.round;
            msg.num = sc.num++;
            selectableId = sc.IDs;
            textarea.attr("disabled", true)
            //选择阶段,只有对应辩手在选择阶段才能够选择对手回答
            if(!sc.time) {
              if(roleId == sc.choice) {
                let labels = modalform.find("label");
                $(labels[0]).text(roleName[selectableId[0]]).attr("value", selectableId[0]);
                $(labels[1]).text(roleName[selectableId[1]]).attr("value", selectableId[1]);
                modal.show();
              } else {
                //更新本地提问者id
                questionerId = sc.choice;
              }
            } else {
              if(roleId != sc.choice) {
                textarea.prop("disabled", true);
              } else {
                textarea.prop("disabled", false);
                //发言结束后的操作
                setTimeout(function() {
                  textarea.prop("disabled", true);
                  if(sc.time == 10)
                    msg.next = responderId;
                  else
                    msg.next = questionerId;
                  if(msg.num == 28) { //第二阶段结束,开始第三阶段
                    msg.round = 3;
                    msg.num = 0;
                    websocket.send(JSON.stringify(msg));
                  } else {
                    websocket.send(JSON.stringify(msg));
                  }
                }, sc.time * 1000);
              }
            }
            break;
          case 3:
            //更新num和round
            msg.round = sc.round;
            msg.num = sc.num++;
            //只有对应辩手能够发言
            if(!roleId == sc.ID) {
              textarea.prop("disabled", true);
            } else {
              textarea.prop("disabled", false);
              //发言结束后的操作
              setTimeout(function() {
                addMsg("还有十秒结束小结", "msgleft", "left", "系统消息");
                setTimeout(function() {
                  addMsg("Times up!", "msgleft", "left", "系统消息");
                  textarea.prop("disabled", true);
                  if(msg.num == 2) { //第三阶段结束,开始第四阶段
                    msg.round = 4;
                    msg.judgement = 1;
                    msg.ID = roleId;
                    websocket.send(JSON.stringify(msg));
                  } else {
                    websocket.send(JSON.stringify(msg));
                  }
                }, 10000);
              }, sc.time * 1000 - 10000);
            }
            break;
          case 4:
            //更新round
            msg.round = sc.round;
            //所有人禁止发言
            textarea.prop("disabled", true);
            //更新正反双方剩余时间
            msg.PosReTime = sc.PosReTime;
            msg.NegReTime = sc.NegReTime;
            if(sc.signal) {
              if(sc.ID && roleId > 0) {
                //添加抢答按钮
                $center.find("[id=role" + roleId + "]").append("<button class = 'btn btn-primary btn-sm' id='buzzer' style='margin:10px'>抢答</button>");
              }
              if(!sc.ID && roleId < 0) {
                //添加抢答按钮
                $center.find("[id=role" + roleId + "]").append("<button class = 'btn btn-primary btn-sm' id='buzzer' style='margin:10px'>抢答</button>");
              }
            } else {
              //只有对应辩手能够发言
              if(roleId == sc.ID) {
                textarea.prop("disabled", false);
                //显示结束发言按钮
                $(".footer .finishbtn").css("display", "block");
                startTime = Date.getTime();
                //发言结束后的操作
                timer0 = setTimeout(function() {
                  textarea.prop("disabled", true);
                  //时间已经被用完，将剩余时间更新为零
                  msg[roleId > 0 ? "PosReTime" : "NegReTime"] = 0;
                  msg.judgement = 1;
                  msg.ID = roleId;
                  websocket.send(JSON.stringify(msg));
                }, msg[roleId > 0 ? "PosReTime" : "NegReTime"] * 1000);
              } else {
                $("#buzzer").remove();
              }
            }
          case 5:
            //更新num和round
            msg.round = sc.round;
            msg.num = sc.num++;
            //只有对应辩手能够发言
            if(!roleId == sc.ID) {
              textarea.prop("disabled", true);
            } else {
              textarea.prop("disabled", false);
              //发言结束后的操作
              setTimeout(function() {
                addMsg("还有三十秒结束总结", "msgleft", "left", "系统消息");
                textarea.prop("disabled", true);
                setTimeout(function() {
                  addMsg("Times up!", "msgleft", "left", "系统消息");
                  websocket.send(JSON.stringify(msg));
                }, 30000);
              }, sc.time * 1000 - 30000);
            }
        }
      }
    }

    /*    $("#role"+roleId).empty().append($span.prepend($img));
        $("#role"+roleId).removeClass("unselected");*/
  });

  //绑定键盘事件，按下回车发送消息
  textarea.keydown(function(e) {
    if(e.keyCode == "13") {
      sendbtn.click();
      return false;
    }
  });

  //为切换辩手身份绑定单击响应委托
  $center.delegate(".unselected", "click", function(event) {
    var $target = $(event.target);
    //确保$target获取到li
    while(!$target.data("role"))
      $target = $target.parent();
    //获取自定义属性角色ID
    roleId = $target.data("role");
    websocket.close();
    websocket = new WebSocket("ws://192.168.0.158:8080/websocket/" + userId + "/" + userName + "/" + roleId + "/" + roomId);
    console.log(websocket);
    //  $(websocket).on("message", function(e) {
    //    console.log(e.data);
    //    var data = JSON.parse(e.data);
    //    console.log(data);
    //    console.log(data.msg.length);
    //    $(".num").text(data.num);
    //    if(data.id != userId && data.id != 10544) {
    //      addMsg(data.msg, "msgleft", "left", data.name);
    //    } else if(data.id == 10544) {
    //      $(".userList>li").empty().append($("<div><i class=\"fa fa-plus-circle\"></i></div>")).addClass("unselected");
    //      for(var key in data.msg) {
    //        console.log(data.msg[key].id);
    //        $("#role" + data.msg[key].roleId).empty().append($("<span>" + data.msg[key].name + "</span>").prepend($("<img src = '" + avatarSrc + "'>")));
    //        $("#role" + data.msg[key].roleId).removeClass("unselected");
    //      }
    //    }
    //  });

    setTimeout(function() {
      failmsg.hide();
    }, 110);
    if(!first) {
      $target.empty().append($span.prepend($img));
      $target.removeClass("unselected");
      $userLi = $target;
      first = true;
    } else {
      let temp = $target.children();
      $target.empty().append($userLi.children());
      $userLi.append(temp);
      $userLi.toggleClass("unselected");
      $target.toggleClass("unselected");
      $userLi = $target;
    }
  });

  //为抢答按钮绑定单击响应委托
  $center.delegate("#buzzer", "click", function(event) {
    var $target = $(event.target);
    //抢答按钮的响应
    if($target.attr('id') == "buzzer") {
      msg.judgement = 0;
      msg.ID = roleId;
      websocket.send(JSON.stringify(msg));

    }
  });

  var $morebtn = $(".chatright>.top>i");
  var $moreList = $("#more");
  var $exit = $(".exit");
  var $more = $(".more");

  $morebtn.click(function(e) {
    e.stopPropagation();
    if($moreList.css("display") == "none") {
      $moreList.show("fast");
    } else {
      $moreList.hide("fast");
    }
  });

  $(document).click(function() {
    $moreList.hide("fast");
  });

  $exit.click(function(e) {
    e.stopPropagation();
    var cExit = confirm("你确定要退出吗？");
    if(cExit) {
      websocket.close();
      window.history.go(-1); //回到上一页
    }
  });

  $more.click(function(e) {
    e.stopPropagation();
  });

});