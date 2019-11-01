
/**

 * Created by wjh on 2017/4/5.

 */



function escapeHtml(string) {

    var entityMap = {

        "&": "&",

        "<": "<",

        ">": ">",

        '"': '"',

        "'": ''',

            "/": '/'

};

    return String(string).replace(/[&<>"'\/]/g, function (s) {

        return entityMap[s];

    });

}



//设置访问路径

$.ajaxSetup({});

// 百度地图API功能

var x = 0;

var y = 0;

var markers = [];

var pointlist = null;

var mk;



var map = new BMap.Map("allmap");

var point = new BMap.Point();

map.centerAndZoom(point, 12);



function myFun(result) {

    //获取当前所在城市名并定位初始位置为当前所在城市

    var cityName = result.name;

    map.setCenter(cityName);

    map.enableScrollWheelZoom();   //启用滚轮放大缩小，默认禁用

    map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用

    $('#cityName').val(cityName);

    $('#title').html(cityName);

    // 创建地址解析器实例

    var myGeo = new BMap.Geocoder();

    // 将地址解析结果显示在地图上,并调整地图视野

    myGeo.getPoint(cityName, function (point) {

        if (point) {

            map.centerAndZoom(point, 12);

            /*map.addOverlay(new BMap.Marker(point));*/

            x = point.lng;

            y = point.lat;



        } else {

            alert("您选择地址没有解析到结果!");

        }

    });

}

var myCity = new BMap.LocalCity();

myCity.get(myFun);

//设置地图风格 去除百度logo在css.css .BMap_cpyCtrl

map.setMapStyle({style: 'grayscale'});

//热点图

var points = [];

function Point(lng, lat, count) {

    this.lng = lng,

        this.lat = lat,

        this.count = count

}

var rectangles = [];

function Rectangle(lng, lat) {

    this.lng = lng,

        this.lat = lat

}

var lng = 0;

var lat = 0;

var count = 0;

if (!isSupportCanvas()) {

    alert('热力图目前只支持有canvas支持的浏览器,您所使用的浏览器不能使用热力图功能~')

}



function openHeatmap() {

    function addMarker(point) {

        var marker = new BMap.Marker(point);

        map.addOverlay(marker);

    }



    //传入当前查询的城市的经纬度

    var alldata = {x: parseInt(x), y: parseInt(y), rectangle: rectangles};

    var data = JSON.stringify(alldata);

    $.ajax({

        type: 'post',

        url: 'heatmap',

        data: {data: data},

        datatype: "json",

        headers: {

            'X-CSRF-TOKEN': $('meta[name="_token"]').attr('content')

        },

        success: function (data) {

            var opts = {

                width: 250,     // 信息窗口宽度

                height: 80,     // 信息窗口高度

                title: "PM值", // 信息窗口标题

                enableMessage: true//设置允许信息窗发送短息

            };

            for (var i = 0; i < data.length; i++) {

                var point = new Point(lng, lat, count);

                var content = data[i].pm;

                point['lng'] = data[i].x;

                point['lat'] = data[i].y;

                point['count'] = data[i].pm;

                points[i] = point;

                pointlist = new BMap.Point(data[i].x, data[i].y);



                /* alert(1);

                 addClickHandler(content,pointlist);

                 alert(2);*/

                markers.push(new BMap.Marker(pointlist));

            }







            var markerClusterer = new BMapLib.MarkerClusterer(map, {markers: markers});

            //设置热力点的半径

            heatmapOverlay = new BMapLib.HeatmapOverlay({"radius": 1});

            map.addOverlay(heatmapOverlay);//加载资源点

            heatmapOverlay.setDataSet({data: points, max: 100});//是否显示热力图



        },

        error: function (data, json, errorThrown) {

            var errorsHtml = '';

            errorsHtml += '<li>连接数据失败，请重试！</li>';

            toastr.error(errorsHtml, "Error：    ");

        }

    });

    /*  heatmapOverlay.show();*/

    heatmapOverlay.hide();

}

function closeHeatmap() {

    heatmapOverlay.hide();

}

function addClickHandler(content,pointlist){

    pointlist.addEventListener("click",function(e){

        openInfo(content,e)}

    );

}

function openInfo(content,e){

    var p = e.target;

    var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);

    var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象

    map.openInfoWindow(infoWindow,point); //开启信息窗口

}

//设置热力点颜色

function setGradient() {

    var gradient = {};

    var colors = document.querySelectorAll("input[type='color']");

    colors = [].slice.call(colors, 0);

    colors.forEach(function (ele) {

        gradient[ele.getAttribute("data-key")] = ele.value;

    });

    heatmapOverlay.setOptions({"gradient": gradient});

}

//判断浏览区是否支持canvas

function isSupportCanvas() {

    var elem = document.createElement('canvas');

    return !!(elem.getContext && elem.getContext('2d'));

}

function theLocation() {

    var city = document.getElementById("cityName").value;

    if (city != "") {

        map.centerAndZoom(city, 12);      // 用城市名设置地图中心点

    }

    // 创建地址解析器实例

    var myGeo = new BMap.Geocoder();

    // 将地址解析结果显示在地图上,并调整地图视野

    myGeo.getPoint(city, function (point) {

        if (point) {

            map.centerAndZoom(point, 12);

            x = point.lng;

            y = point.lat;

        } else {

            alert("您选择地址没有解析到结果!");

        }

    });

}





var overlays = [];

//回调获得覆盖物信息

var rectanglekey = 0;

var overlaycomplete = function (e) {

    overlays.push(e.overlay);

    var result = "";

    result = "<p>";

    result += e.drawingMode + ":" + '</br>';

    if (e.drawingMode == BMAP_DRAWING_POLYLINE || e.drawingMode == BMAP_DRAWING_POLYGON || e.drawingMode == BMAP_DRAWING_RECTANGLE) {



        for (var i = 0; i < 4; i++) {

            var rectang = new Rectangle(lng, lat);

            result += 'x' + e.overlay.getPath()[i].lng + 'y' + e.overlay.getPath()[i].lat + '</br>';

            rectang['lng'] = e.overlay.getPath()[i].lng;

            rectang['lat'] = e.overlay.getPath()[i].lat;

            rectangles[i] = rectang;

            rectanglekey++;

        }

    }

    result += "</p>";

    $('#info').append(result);



};





//实例化鼠标绘制工具

var drawingManager = new BMapLib.DrawingManager(map, {

    isOpen: false, //是否开启绘制模式

    enableDrawingTool: true, //是否显示工具栏

    drawingToolOptions: {

        anchor: BMAP_ANCHOR_TOP_RIGHT, //位置

        offset: new BMap.Size(5, 5), //偏离值

        scale: 0.8, //工具栏缩放比例

        drawingModes: [BMAP_DRAWING_RECTANGLE],

    },

    rectangleOptions: styleOptions, //圆的样式



});

var styleOptions = {

    strokeColor: "red",    //边线颜色。

    fillColor: "red",      //填充颜色。当参数为空时，圆形将没有填充效果。

    strokeWeight: 3,       //边线的宽度，以像素为单位。

    strokeOpacity: 0.8,    //边线透明度，取值范围0 - 1。

    fillOpacity: 0,      //填充的透明度，取值范围0 - 1。

    strokeStyle: 'solid' //边线的样式，solid或dashed。

}



//添加鼠标绘制工具监听事件，用于获取绘制结果

drawingManager.addEventListener('overlaycomplete', overlaycomplete);



function clearAll() {

    for (var i = 0; i < overlays.length; i++) {

        map.removeOverlay(overlays[i]);

    }

    $('#info').empty();

    rectanglekey = 0;

    overlays.length = 0

    markers = [];

    pointlist = null;

}
