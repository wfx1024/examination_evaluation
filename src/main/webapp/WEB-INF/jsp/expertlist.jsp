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
    <jsp:param name="title" value="全国教材专家库"/>
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
                    <label class="layui-form-label">专家姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_ENAME" name="IR_ENAME" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">职务</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_EDUTY" name="IR_EDUTY" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">省份</label>
                    <div class="layui-input-inline">
                        <select id="IR_EPROVINCE" name="IR_EPROVINCE">
                            <option value="">请选择</option>
                        </select>
                    </div>
                </div>


                <div class="layui-inline">
                    <label class="layui-form-label">学科</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_ESUBJECT" name="IR_ESUBJECT" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">工作单位</label>
                    <div class="layui-input-inline">
                        <input type="text" id="IR_EWORKUNIT" name="IR_EWORKUNIT" placeholder="请输入" autocomplete="off" class="layui-input">
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
                <button class="layui-btn layuiadmin-btn-list" data-type="abc">新建</button>
                <button class="layui-btn layuiadmin-btn-list" data-type="statistics">数据统计分析</button>
            </div>
            <table id="tbl-news-list" lay-filter="tbl-news-list"></table>
            <script type="text/html" id="toolbar-news-list">
                <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="compile"><i class="layui-icon layui-icon-edit"></i>编辑</a>
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
}).use(['layer', 'index', 'form', 'table', 'laydate','upload'], function(){
    var $ = layui.$  //JQuery
        ,layer = layui.layer
        ,form = layui.form
        ,table = layui.table
        ,laydate = layui.laydate;

    //查询参数

// <div class="layui-inline">
//         <label class="layui-form-label">省份</label>
//         <div class="layui-input-inline">
//         <select id="IR_EPROVINCE" name="IR_EPROVINCE">
//         <option value="">请选择</option>
//         </select>
//         </div>
//         </div>
    var IR_ENAME = $.trim($("#IR_ENAME").val());
    var IR_EDUTY = $.trim($("#IR_EDUTY").val());
    var IR_EPROVINCE = $.trim($("#IR_EPROVINCE").val());
    var IR_ESUBJECT = $.trim($("#IR_ESUBJECT").val());
    var IR_EWORKUNIT = $.trim($("#IR_EWORKUNIT").val());
    var queryParams = {
        "IR_ENAME" : IR_ENAME,
        "IR_EDUTY" : IR_EDUTY,
        "IR_EPROVINCE" : IR_EPROVINCE,
        "IR_ESUBJECT" : IR_ESUBJECT,
        "IR_EWORKUNIT" : IR_EWORKUNIT
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
    //专家列表
    table.render({
        elem: '#tbl-news-list'
        ,url: '<%=path%>/experts/list'
        ,where: queryParams
        ,cols: [[
            {type: 'checkbox', fixed: 'left'}
            ,{field: 'iR_EID', width: 100, title: 'ID'}
            ,{field: 'iR_ENAME', width: 120, title: '专家姓名'}
            ,{field: 'iR_ESUBJECT', width: 120, title: '学科'}
            ,{field: 'iR_EWORKUNIT1', width: 150, title: '工作单位'}
            ,{field: 'iR_EDUTY1', width: 120, title: '职务'}
            ,{field: 'iR_EPROVINCE', width: 120, title: '所在省', minWidth: 100}
            ,{field: 'iR_EPHONE1', width: 150, title: '手机号',sort: true}
            ,{title: '操作', minWidth: 70, align: 'centeir', fixed: 'right', toolbar: '#toolbar-news-list'}
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
            layer.confirm('确定删除此专家【'+data.iR_ENAME+'】？', function(index){
                var IR_EID = [];
                IR_EID.push(data.iR_EID);
                $.ajax({
                    type: "POST",
                    timeout: 5000,
                    dataType: "json",
                    url: "<%=path%>/experts/delete",
                    data: {"expertIDs":IR_EID},
                    success: function(d){
                        if(d.code=="0"){
                            layer.msg('专家信息删除成功！', {icon: 1});
                            table.reload('tbl-news-list');
                        }else{
                            layer.msg('专家信息删除失败：'+d.msg, {icon: 2});
                        }
                    },
                    error: function(XMLHttpRequest,textStatus,errorThrown){
                        layer.msg('专家信息删除失败：'+textStatus, {icon: 2});
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
                ,content:  data.iR_EID
                ,maxmin: true
                ,area: ['500px', '350px']
                ,btn: ['确定', '取消']
                ,yes: function(index, layero){
                    layer.msg("保存成功");
                    layer.close(frame);
                }
            });
            //layer.full(frame);
        }else if(obj.event === 'compile'){
            var frame = layer.open({
                type: 2
                ,title: '编辑'
                ,content:  '<%=path%>/edit'
                ,maxmin: true
                ,area: ['480px', '500px']
                ,btn: ['确定', '取消']
                ,yes: function(index, layero){
                    layer.msg("保存成功");
                    layer.close(frame);
                }
            });
            //layer.full(frame);
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
            layer.confirm('确定删除所选的【'+checkData.length+'】个专家信息？', function(index) {
                var IR_EIDs = [];
                $.each(checkData, function(i, v){
                    IR_EIDs.push(v.iR_EID);
                });
                $.ajax({
                    type: "POST",
                    timeout: 5000,
                    dataType: "json",
                    url: "<%=path%>/experts/delete",
                    data: {"expertIDs":IR_EIDs},
                    success: function(d){
                        if(d.code=="0"){
                            layer.msg('专家信息删除成功！', {icon: 1});
                            table.reload('tbl-news-list');
                        }else{
                            layer.msg('专家信息删除失败：'+d.msg, {icon: 2});
                        }
                    },
                    error: function(XMLHttpRequest,textStatus,errorThrown){
                        layer.msg('专家信息删除失败：'+textStatus, {icon: 2});
                    },
                    complete: function(){
                        layer.close(index);

                    }
                });
            });
        },
        abc: function(){
            var data = null;
            var frame = layer.open({
                type: 2
                ,title: '新建'
                ,content:  "<%=path%>/create"
                ,maxmin: true
                ,area: ['480px', '500px']
                ,btn: ['确定', '取消']
                ,yes: function(index, layero){
                    layer.msg("保存成功");
                    layer.close(frame);
                }
            });
            // layer.full(frame);
        },
        statistics: function(){
            var data = null;
            var frame = layer.open({
                type: 2
                ,title: '数据统计分析'
                ,content:  "<%=path%>/statistics"
                ,maxmin: true
                ,area: ['480px', '500px']
                ,btn: ['确定', '取消']
                ,yes: function(index, layero){
                    layer.msg("保存成功");
                    layer.close(frame);
                }
            });
            layer.full(frame);
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
            url: "<%=path%>/experts/areaList",
            data: params,
            success: function(d){
                if(d.code=="0"){
                    var select = $("#IR_EPROVINCE");
                    $.each(d.data, function (i, v) {
                        select.append("<option value='"+v+"'>"+v+"</option>");
                    });
                    form.render("select", "form-search");
                }else{
                    layer.msg('省份信息信息获取失败！', {icon: 2});
                }
            },
            error: function(XMLHttpRequest,textStatus,errorThrown){
                layer.msg('省份信息获取失败！', {icon: 2});
            },
            complete: function(){
            }
        });
    }

    $(function(){
        initPage();
    });

    //选完文件后不自动上传
    upload = layui.upload;
    upload.render({
        elem: '#test8'
        ,url: '/upload/'
        ,accept: 'file'
        ,auto: false
        //,multiple: true
        ,bindAction: '#test9'
        ,done: function(res){
            console.log(res)
        }
    });

});
</script>

<script>

    //点击新建事件
    function create(){
        window.location.href="<%=path%>/create";
    }
</script>
</body>
</html>
