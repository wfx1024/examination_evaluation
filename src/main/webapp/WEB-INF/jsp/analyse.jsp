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
<jsp:include page="common/bootHead.jsp">
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
                    <label class="layui-form-label">年份</label>
                    <div class="layui-input-inline">
                        <select id="year" name="year">
                            <option value="">请选择</option>
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

<jsp:include page="common/bootFoot.jsp"></jsp:include>
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
    var year = ${years[0]};
    var queryParams = {
        "year" : year
    };
    //列表
    table.render({
        elem: '#tbl-news-list'
        ,url: '<%=path%>/analyse/list'
        ,where: queryParams
        ,cols: [[
            ,{field: 'IR_GROUPNAME', width: 400, title: '地域'}
            ,{field: 'num', width: 200, title: '数量',sort: true}
            ,{field: 'years', width: 200, title: '发布年份',sort: true}
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
                    area.push(data[i].IR_GROUPNAME);
                    num.push(data[i].num);
                }
                drawLine(year,area,num);
            }
        }
    });

function drawLine(year,area,lastdata) {
    var dom = document.getElementById("container");
    //dom.innerHTML="";
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    app.title = '中国各省改革政策数据量';

    option = {
        color: ['#3398DB'],
        title: {
            text: '各省改革政策数据量',
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            data: year
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: {
            type: 'value',
            boundaryGap: [0, 0.01]
        },
        yAxis: {
            type: 'category',
            data: area
        },
        series: [
            {
                name: year[0],
                type: 'bar',
                data:lastdata
            }
        ]
    };
    ;
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
                        area.push(data[i].IR_GROUPNAME);
                        num.push(data[i].num);
                    }
                    drawLine(year,area,num);
                }
            }
        });
    });

    var initPage = function(){
        //初始化下拉框
        var params = {};
        $.ajax({
            type: "POST",
            // timeout: 3000,
            dataType: "json",
            url: "<%=path%>/analyse/yearList",
            data: params,
            success: function(d){
                if(d.code=="0"){
                    var select = $("#year");
                    $.each(d.data, function (i, v) {
                        if(i==0){
                            select.append("<option value='"+v+"' selected>"+v+"</option>");
                            return true;
                        }
                        select.append("<option value='"+v+"'>"+v+"</option>");
                    });
                    form.render("select", "form-search");
                }else{
                    layer.msg('角色信息获取失败！', {icon: 2});
                }
            },
            error: function(XMLHttpRequest,textStatus,errorThrown){
                layer.msg('角色信息获取失败！', {icon: 2});
            },
            complete: function(){
            }
        });
    }

    $(function(){
        initPage();
    });

});
</script>

</body>
</html>
