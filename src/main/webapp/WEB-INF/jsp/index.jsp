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
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="<%=path%>/static/css/bootstrap.min.css">
    <link href="<%=path%>/static/daterangepicker/daterangepicker.css" type="text/css" media="all" rel="stylesheet">
    <link rel="stylesheet" href="<%=path%>/static/jquery-easyui-1.6.7/themes/default/easyui.css">
    <link rel="stylesheet" href="<%=path%>/static/jquery-easyui-1.6.7/themes/icon.css">
    <script type="text/javascript" src="<%=path%>/static/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="<%=path%>/static/daterangepicker/moment.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/daterangepicker/daterangepicker.js"></script>
    <script type="text/javascript" src="<%=path%>/static/numeral/numeral.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/bootstrap-tables/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/js/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/js/jquery.nicescroll.min.js"></script>
    <script type="text/javascript" src="<%=path%>/static/js/echarts.min.js"></script>
    <script src="http://gallery.echartsjs.com/dep/echarts/map/js/china.js"></script>
</head>
<body>

<p>yes</p>

</body>
</html>
