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
    <label class="layui-form-label">标题：</label>  &nbsp;&nbsp;<input type="text" value="化学选择题解析" name="IR_SRCNAME" placeholder="请输入" autocomplete="off">
    &nbsp;&nbsp;<label class="layui-form-label">来源：</label>  &nbsp;&nbsp;<input type="text" value="人大附中" name="IR_SRCNAME" placeholder="请输入" autocomplete="off">
    &nbsp;&nbsp;<label class="layui-form-label">作者：</label>  &nbsp;&nbsp;<input type="text" value="肖老师" name="IR_SRCNAME" placeholder="请输入" autocomplete="off">

</div>
<div id="editor" type="text/plain" style="width:1024px;height:500px; margin: 0 auto;"></div>
<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
    var ue = UE.getEditor('editor');

    var html = '   <div class="listcontent"> <div style="text-align: left; line-height: 150%; vertical-align: bottom" align="left"><span style="color: black">1.下列有关四种基本反应类型与氧化还原反应关系的说法中正确的是</span></div> <div style="text-align: left; line-height: 150%; vertical-align: bottom" align="left"><span style="color: black">A. 置换反应一定是氧化还原反应&nbsp;&nbsp;&nbsp; B. 分解反应一定不是氧化还原反应</span></div> <div style="text-align: left; line-height: 150%; vertical-align: bottom" align="left"><span style="color: black">C. 化合反应一定是氧化还原反应&nbsp;&nbsp;&nbsp; D. 复分解反应不一定是氧化还原反应</span></div> <div style="line-height: 150%; vertical-align: bottom"><span style="color: black">【答案】A</span></div> <div style="line-height: 150%; vertical-align: bottom"><span style="color: black">【解析】</span></div> <div style="line-height: 150%; vertical-align: bottom"><span style="color: black">试题分析：A、置换反应是单质与化合物反应生成另一种单质和化合物，所以一定是氧化还原反应，正确；B、分解反应可能是氧化还原反应，如过氧化氢的分解，错误；C、化合反应不一定是氧化还原反应，如氧化钠与水反应生成氢氧化钠的反应，不是氧化还原反应，错误；D、复分解反应一定不是氧化还原反应，只是阴、阳离子的相互交换，错误，答案选A。</span></div> <div style="text-align: left; line-height: 150%; vertical-align: bottom" align="left"><span style="color: black">考点：考查氧化还原反应与四种基本反应类型的关系</span></div></div>     ';

    function setContent(isAppendTo) {
        UE.getEditor('editor').setContent(html, isAppendTo);

    }
    setTimeout(function () {
        setContent(true);
    },1000);

</script>
</body>
</html>