<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="<%=path%>/static/css/HbJk.css" />
    <link rel="stylesheet" href="<%=path%>/static/css/blue.css" />
    <link href="<%=path%>/static/css/select2.css" rel="stylesheet" />
    <script type="text/javascript" src="<%=path%>/static/js/jquery-1.11.2.min.js"></script>
    <%--<script src="<%=path%>/static/js/select2.js"></script>--%>
    <script type="text/javascript" src="<%=path%>/static/js/icheck.min.js"></script>
    <style type="text/css">
        .input_Account{
            font-size: 10px; color: red; display: none;
        }
        .input_Password{
            font-size: 10px; color: red; display: none;
        }
    </style>
</head>
<body onkeydown="on_btn(event)">
<form class="loginForm">
<div class="loginImgBox">
    <div class="loginBox">
        <div class="loginCBox">
            <div class="loginBoxTitle">
                <img src="<%=path%>/static/images/hbjkLoginIco_03.jpg" alt="" />
                <span class="loginBoxTitleS">登录</span>Login
            </div>

            <p class="loginTxt">用户名</p>
            <div class="loginUserName">
                <input type="text" id="userName" placeholder="请输入账号" />
            </div>
            <p class="input_Account">请输入账号</p>
            <p class="loginTxt">密码</p>
            <input type="password" id="password" placeholder="请输入密码" />
            <p class="input_Password">请输入密码</p>
            <p class="loginTxt">验证码</p>
            <div class="LoginYzmBox">
                <input type="text" name="validationCode"/>
                <img class="LoginYzmImg" src="<%=path%>/validateCode" alt="" onclick="reloadValidateCode()" id="validateCodeImg"/>
                <a class="LoginYzmSx" onclick="reloadValidateCode()">
                    <img src="<%=path%>/static/images/hbjkLoginIco2_10.png" alt="" /> 刷新
                </a>
            </div>
            <div class="LoginAutoBox" >
                <a class="LoginAutoA" style="visibility: hidden;">
                    <input type="checkbox" name="RememberMe" value=""/>
                    自动登录
                </a>
                <span>如忘记密码请联系管理员</span>
            </div>
            <div class="LoginBtnBox">
                <a href="javaScript:void(0)" class="LoginLbtn" id="btn" onclick="btn()">登 录</a>
                <a href="javaScript:void(0)"  class="LoginRbtn">取 消</a>
            </div>
        </div>
    </div>
</div>
</form>
<div class="loginStatement">Copyright ©生态环境部网站群监控平台</div>
<script>
    var path="<%=path%>";
</script>
</body>
<script src="<%=path%>/static/js/Rsa/security.js"></script>
<script src="<%=path%>/static/custom/login-common.js"></script>
<script src="<%=path%>/static/custom/login.js"></script>
</html>
