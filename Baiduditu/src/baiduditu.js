<script>

    var lon = 110.309;
    var lat = 21.158;
    var map = new BMap.Map("allmap",{enableMapClick:false});
    map.centerAndZoom(new BMap.Point(lon,lat),100);
    map.enableScrollWheelZoom(true);
    theLocation(lon,lat);
    // 用经纬度设置地图中心点
    function theLocation(longitude,latitude)
    {
        {
            map.clearOverlays();
        var new_point = new BMap.Point(longitude,latitude);
        var marker = new BMap.Marker(new_point);  // 创建标注
        map.addOverlay(marker);              // 将标注添加到地图中
        map.panTo(new_point);
    }
    }




    function G(id) {
    return document.getElementById(id);
}
    var ac = new BMap.Autocomplete(    //建立一个自动完成的对象
    {"input" : "suggestId"
        ,"location" : map
    });
    var myValue;
    ac.addEventListener("onconfirm", function(e) {    //鼠标点击下拉列表后的事件
    var _value = e.item.value;
    myValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    G("searchResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myValue;

    setPlace();
});
    function setPlace(){
    //  map.clearOverlays();    //清除地图上所有覆盖物
    function myFun(){
        var pp = local.getResults().getPoi(0).point;    //获取第一个智能搜索的结果
        map.centerAndZoom(pp, 100);
        //     map.addOverlay(new BMap.Marker(pp));    //添加标注
    }
    var local = new BMap.LocalSearch(map, { //智能搜索
    onSearchComplete: myFun
});
    local.search(myValue);
}




    //鼠标绘制完成回调方法   获取各个点的经纬度
    var overlays = [];
    var overlaycomplete = function(e)
    {
        overlays.push(e.overlay);
        var path = e.overlay.getPath();//Array<Point> 返回多边型的点数组
        for(var i=0;i<path.length;i++)
    {
        alert("lng:"+path[i].lng+"\nlat:"+path[i].lat);
    }
    }
    var styleOptions =
    {
        strokeColor:"red",    //边线颜色。
        fillColor:"red",      //填充颜色。当参数为空时，圆形将没有填充效果。
        strokeWeight: 3,       //边线的宽度，以像素为单位。
        strokeOpacity: 0.6,       //边线透明度，取值范围0 - 1。
        fillOpacity: 0.3,      //填充的透明度，取值范围0 - 1。
        strokeStyle: 'solid' //边线的样式，solid或dashed。
    }
    //实例化鼠标绘制工具
    var drawingManager = new BMapLib.DrawingManager(map, {
    isOpen: false, //是否开启绘制模式
    enableDrawingTool: true, //是否显示工具栏
    drawingMode:BMAP_DRAWING_POLYGON,//绘制模式  多边形
    drawingToolOptions: {
    anchor: BMAP_ANCHOR_TOP_RIGHT, //位置
    offset: new BMap.Size(5, 5), //偏离值
    drawingModes:[
    BMAP_DRAWING_POLYGON
    ]
},
    polygonOptions: styleOptions //多边形的样式
});

    //添加鼠标绘制工具监听事件，用于获取绘制结果
    drawingManager.addEventListener('overlaycomplete', overlaycomplete);
    function clearAll() {
    for(var i = 0; i < overlays.length; i++){
    map.removeOverlay(overlays[i]);
}
    overlays.length = 0;
}
    function getPoint()
    {
        for(var j = 0;j<overlays.length;j++)
    {
        var path = overlays[j].getPath();//Array<Point> 返回多边型的点数组
        for(var i=0;i<path.length;i++)
    {
        alert("lng:"+path[i].lng+"\nlat:"+path[i].lat);
    }
    }
    }




    function judge()
    {
        var point = new BMap.Point(lon,lat);    // 创建点坐标
        for(var j = 0;j<overlays.length;j++)
    {
        var polygon = overlays[j];

        var content = channel.objects.content;
        var text = "fsdfsd";
        if (!text)
    {
        return;
    }
        content.receiveText(text);

        if(BMapLib.GeoUtils.isPointInPolygon(point,polygon))
    {
        alert("在多边形里面");
        return;
    }
    }
        alert("不在多边形里面");
    }


    window.onload = function()
    {
        new QWebChannel(qt.webChannelTransport, function(channel)
            {
                //make dialog object accessible globally
                var content = channel.objects.content;
                document.getElementById("send").onclick = function()
                {
                    var input = document.getElementById("input");
                    var text = input.value;
                    if (!text)
                    {
                        return;
                    }
                    input.value = "";
                    content.receiveText(text);
                }
            }
        );
    }
</script>