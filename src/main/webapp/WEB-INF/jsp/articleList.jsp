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
    <jsp:param name="title" value="文章动态"/>
</jsp:include>
</head>
<style>
.layui-btn-site{background-color:#B5B5B5}
</style>
<body>

<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-form layui-card-header layuiadmin-card-header-auto" lay-filter="form-search">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">标题</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_URLTITLE" name="IR_URLTITLE" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">来源</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_SITENAME" name="IR_SITENAME" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">省份</label>
                    <div class="layui-input-inline">
                        <select id="IR_GROUPNAME" name="IR_GROUPNAME">
                            <option value="">请选择</option>
                        </select>
                    </div>
                </div>

                <div class="layui-inline">
                    <label class="layui-form-label">发布时间</label>
                    <div class="layui-input-inline">
                        <input type="text" id="beginCreateTime" name="beginCreateTime" placeholder="开始时间" autocomplete="off" class="layui-input" readonly>
                    </div>
                    <div class="layui-form-mid layui-word-aux">-</div>
                    <div class="layui-input-inline">
                        <input type="text" id="endCreateTime" name="endCreateTime" placeholder="结束时间" autocomplete="off" class="layui-input" readonly>
                    </div>
                </div>
                <div class="layui-inline">
                    <button class="layui-btn layuiadmin-btn-list" lay-submit lay-filter="btn-search">
                        <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
                    </button>
                </div>
            </div>
        </div>

        <div class="layui-card-body">
            <div style="padding-bottom: 10px;">
                <button class="layui-btn layuiadmin-btn-list" data-type="batchdel">删除</button>
            </div>
            <table id="tbl-news-list" lay-filter="tbl-news-list"></table>
            <script type="text/html" id="toolbar-news-list">
                <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="edit"><i class="layui-icon layui-icon-edit"></i>查看</a>
                <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon layui-icon-delete"></i>删除</a>
            </script>
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
    var IR_URLTITLE = $.trim($("#IR_URLTITLE").val());
    var IR_SITENAME = $.trim($("#IR_SITENAME").val());
    var IR_GROUPNAME = $.trim($("#IR_GROUPNAME").val());
    var beginCreateTime = $.trim($("#beginCreateTime").val());
    var endCreateTime = $.trim($("#endCreateTime").val());
    var queryParams = {
        "IR_URLTITLE" : IR_URLTITLE,
        "IR_SITENAME" : IR_SITENAME,
        "IR_GROUPNAME" : IR_GROUPNAME,
        "beginCreateTime" : beginCreateTime,
        "endCreateTime" : endCreateTime
    };
    //日历控件
    laydate.render({
        elem: '#beginCreateTime'
        ,type: 'date'
    });
    laydate.render({
        elem: '#endCreateTime'
        ,type: 'date'
    });
    //用户列表
    table.render({
        elem: '#tbl-news-list'
        ,url: '<%=path%>/news/list'
        ,where: queryParams
        ,cols: [[
            {type: 'checkbox', fixed: 'left'}
            ,{field: 'iR_URLTITLE', width: 400, title: '标题'}
            ,{field: 'iR_SITENAME', width: 200, title: '来源', minWidth: 100}
            ,{field: 'iR_URLTIME', width: 200, title: '发布时间',sort: true}
            ,{field: 'iR_GROUPNAME', width: 150, title: '地域'}
            ,{title: '操作', minWidth: 40, align: 'center', fixed: 'right', toolbar: '#toolbar-news-list'}
        ]]
        ,page: true
        ,limit: 15
        ,limits: [10, 15, 20, 25, 30]
        ,text: {
            none: '未查询到匹配的记录' //默认：无数据。注：该属性为 layui 2.2.5 开始新增
        }
    });
    //监听工具条
    table.on('tool(tbl-news-list)', function(obj){
        var data = obj.data;
        if(obj.event === 'del'){
            layer.confirm('确定删除此动态【'+data.iR_URLTITLE+'】？', function(index){
                var iR_HKEYs = [];
                iR_HKEYs.push(data.iR_HKEY);
                $.ajax({
                    type: "POST",
                    timeout: 5000,
                    dataType: "json",
                    url: "<%=path%>/news/delete",
                    data: {"newsIds":iR_HKEYs},
                    success: function(d){
                        if(d.code=="0"){
                            layer.msg('动态信息删除成功！', {icon: 1});
                            table.reload('tbl-news-list');
                        }else{
                            layer.msg('动态信息删除失败：'+d.msg, {icon: 2});
                        }
                    },
                    error: function(XMLHttpRequest,textStatus,errorThrown){
                        layer.msg('动态信息删除失败：'+textStatus, {icon: 2});
                    },
                    complete: function(){
                        layer.close(index);
                    }
                });
            });
        }else if(obj.event === 'edit'){
            var frame = layer.open({
                type: 2
                ,title: '查看'
                ,content:  '<%=path%>/article/articleDetail'
                ,maxmin: true
                ,area: ['500px', '350px']
            });
            layer.full(frame);
        }
    });
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
            where: field,
            page :{
                curr:1
            }
        });
    });

    var active = {
        batchdel: function(){
            var checkStatus = table.checkStatus('tbl-news-list')
                ,checkData = checkStatus.data; //得到选中的数据
            if(checkData.length === 0){
                return layer.msg('请选择数据');
            }
            layer.confirm('确定删除所选的【'+checkData.length+'】个政策？', function(index) {
                var iR_HKEYs = [];
                $.each(checkData, function(i, v){
                    iR_HKEYs.push(v.iR_HKEY);
                });
                $.ajax({
                    type: "POST",
                    timeout: 5000,
                    dataType: "json",
                    url: "<%=path%>/news/delete",
                    data: {"newsIds":iR_HKEYs},
                    success: function(d){
                        if(d.code=="0"){
                            layer.msg('政策信息删除成功！', {icon: 1});
                            table.reload('tbl-news-list');
                        }else{
                            layer.msg('政策信息删除失败：'+d.msg, {icon: 2});
                        }
                    },
                    error: function(XMLHttpRequest,textStatus,errorThrown){
                        layer.msg('政策信息删除失败：'+textStatus, {icon: 2});
                    },
                    complete: function(){
                        layer.close(index);
                    }
                });
            });
        }
    };

    $('.layui-btn.layuiadmin-btn-list').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

    var initPage = function(){
        //初始化下拉框
        var params = {};
        $.ajax({
            type: "POST",
            // timeout: 3000,
            dataType: "json",
            url: "<%=path%>/news/areaList",
            data: params,
            success: function(d){
                if(d.code=="0"){
                    var select = $("#IR_GROUPNAME");
                    $.each(d.data, function (i, v) {
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
