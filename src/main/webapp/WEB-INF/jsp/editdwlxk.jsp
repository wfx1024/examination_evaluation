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
    <script type="text/javascript" charset="utf-8" src="<%=path%>/static/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=path%>/static/ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="<%=path%>/static/ueditor/lang/zh-cn/zh-cn.js"></script>
    <style type="text/css">
        div{
            width:100%;
        }
    </style>
</head>
<body>
<div style="width:1024px;height:50px; margin: 0 auto;">
    <div class="layui-form-item">
        <label class="layui-form-label">单位名称：</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" value="重庆大学出版社有限公司" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系人：</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" value="唐丽" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">手机号：</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" value="18182205985" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">邮箱：</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" value="cqdxcbs@163.com" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">地区：</label>
        <div class="layui-input-block">
            <input type="text" name="title" required  lay-verify="required" value="重庆" autocomplete="off" class="layui-input">
        </div>
    </div>
   <%-- <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">保存修改</button>
        </div>
    </div>--%>
</div>

</body>
</html>