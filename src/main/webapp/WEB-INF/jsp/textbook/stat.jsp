<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../common/bootHead.jsp">
    <jsp:param name="title" value="改革动态分析"/>
</jsp:include>
</head>
<script type="text/javascript" src="<%=path%>/static/js/echarts.min.js"></script>
<script src="http://gallery.echartsjs.com/dep/echarts/map/js/china.js"></script>
<style>
.layui-btn-site{background-color:#B5B5B5}
</style>
<body>

<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-form layui-card-header layuiadmin-card-header-auto" lay-filter="form-search">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">统计依据</label>
                    <div class="layui-input-inline">
                        <select id="type" name="type">
                            <option value="">请选择</option>
                            <option value="1" <c:if  test="${type == 1}">selected</c:if> >语种</option>
                            <option value="2"  <c:if  test="${type == 2}">selected</c:if> >分类</option>
                        </select>
                    </div>
                </div>
                <div class="layui-inline">
                    <button class="layui-btn layuiadmin-btn-list" lay-submit lay-filter="btn-search">
                        <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
                    </button>
                </div>
            </div>
        </div>
        <div id="container" style="width: 80%;height: 600px; margin: 0 auto;">

        </div>
        <div class="layui-card-body">
            <table id="tbl-news-list" lay-filter="tbl-news-list"></table>
        </div>
    </div>
</div>

<jsp:include page="../common/bootFoot.jsp"></jsp:include>
<script>
layui.config({
    base: '<%=path%>/static/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['layer', 'index', 'form', 'table', 'laydate'], function(){
    var $ = layui.$  //JQuery
        ,layer = layui.layer
        ,form = layui.form
        ,table = layui.table
        ,laydate = layui.laydate;

    //查询参数
    var year = '2019';
    var queryParams = {
        "year" : year
    };
    //列表
    table.render({
        elem: '#tbl-news-list'
        ,url: '<%=path%>/textbook/stat'
        ,where: queryParams
        ,cols: [[
            ,{field: 'value',  title: '数量',sort: true}
            ,{field: 'name',  title: '语种/分类',sort: true}
        ]]
        ,text: {
            none: '未查询到匹配的记录' //默认：无数据。注：该属性为 layui 2.2.5 开始新增
        }
        ,done: function (res, curr, count) {
            var data = res.data;
            var year=[];
            var area=[];
            var num=[];
            if(data.length>0){
                for (var i=0;i<data.length;i++){
                    if(i==0){
                        year.push(data[i].years+"年");
                    }
                    area.push(data[i].name);
                    num.push(data[i].value);
                }
                drawLine(year,area,data);
            }
        }
    });

function drawLine(year,area,data) {
    var dom = document.getElementById("container");
    //dom.innerHTML="";
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    app.title = '全国大中小教材统计';

    option = {
        title : {
            text: '教材分类数据量',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: area
        },
        series : [
            {
                name: '数据量',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:data,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
}
    

    // 按钮自动隐藏，监听事件失效处理
    $(document).off('mousedown','.layui-table-grid-down').on('mousedown','.layui-table-grid-down',function(event){
        table._tableTrCurrr = $(this).closest('td');
    });
    $(document).off('click','.layui-table-tips-main [lay-event]').on('click','.layui-table-tips-main [lay-event]',function(event) {
        var tableTrCurrr = table._tableTrCurrr;
        if(!tableTrCurrr){
            return;
        }
        var index = $(this).closest('.layui-table-tips').attr('times');
        // 关闭当前tip框
        layer.close(index);
        table._tableTrCurrr.find('[lay-event="'+$(this).attr('lay-event')+'"]').first().click();
    });

    //监听搜索
    form.on('submit(btn-search)', function(data){
        var field = data.field;
        // 查询参数去空格
        $.each(field, function(k, v) {
            field[k] = $.trim(v);
        });
        //执行重载
        table.reload('tbl-news-list', {
            where: field
            ,done: function (res, curr, count) {
                var data = res.data;
                var year=[];
                var area=[];
                var num=[];
                if(data.length>0){
                    for (var i=0;i<data.length;i++){
                        if(i==0){
                            year.push(data[i].years+"年");
                        }
                        area.push(data[i].name);
                        num.push(data[i].value);
                    }
                    drawLine(year,area,data);
                }
            }
        });
    });


});
</script>

</body>
</html>
