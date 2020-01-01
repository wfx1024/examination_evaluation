<%--
Created by IntelliJ IDEA.
User: WFX
Date: 2018/11/25
Time: 16:15
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>编辑页</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <link rel="stylesheet" href="<%=path%>/static/layui/css/layui.css">
</head>
<body>
<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-form layui-card-header layuiadmin-card-header-auto" lay-filter="form-search">
            <div class="layui-form-item">
                <label class="layui-form-label">通知方式</label>
                <div class="layui-input-block">
                    <input type="checkbox" checked name="like[write]" title="短信">
                    <input type="checkbox" checked name="like[write]" title="邮件">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-form-text">
                    <textarea name="desc" placeholder="输入要发送的短信内容" class="layui-textarea"></textarea>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="<%=path%>/static/layuiadmin/layui/layui.js" charset="utf-8"></script>
<script>
    layui.config({
        base: '<%=path%>/static/layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['layer', 'index', 'form', 'table', 'laydate'], function() {
            var $ = layui.$  //JQuery
                , layer = layui.layer
                , form = layui.form
                , table = layui.table
                , laydate = layui.laydate;
        });
</script>
</html>