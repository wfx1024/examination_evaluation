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
    <jsp:param name="title" value="全国教材专家编辑"/>
</jsp:include>
</head>

<body>
<form class="layui-form" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">专家姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" value="王刚" autocomplete="off" class="layui-input">
        </div>
    </div> <div class="layui-form-item">
        <label class="layui-form-label">学科</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" value="社科" autocomplete="off" class="layui-input">
        </div>
    </div> <div class="layui-form-item">
        <label class="layui-form-label">工作单位</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" value="北京师范大学" autocomplete="off" class="layui-input">
        </div>
    </div> <div class="layui-form-item">
        <label class="layui-form-label">职务</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" value="教授" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">所在省</label>
        <div class="layui-input-inline">
            <select name="quiz1">
                <option value="">请选择省</option>
                <option value="浙江" >浙江省</option>
                <option value="你的工号" selected="">北京市</option>
                <option value="你最喜欢的老师">福建省</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">手机号</label>
        <div class="layui-input-inline">
            <input type="tel" name="phone" value="18811687888" lay-verify="required|phone" autocomplete="off" class="layui-input">
        </div>
    </div>
    </div>
</form>


<script src="<%=path%>/static/layuiadmin/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });



        //表单赋值
        layui.$('#LAY-component-form-setval').on('click', function(){
            form.val('example', {
                "username": "贤心" // "name": "value"
                ,"password": "123456"
                ,"interest": 1
                ,"like[write]": true //复选框选中状态
                ,"close": true //开关状态
                ,"sex": "女"
                ,"desc": "我爱 layui"
            });
        });

        //表单取值
        layui.$('#LAY-component-form-getval').on('click', function(){
            var data = form.val('example');
            alert(JSON.stringify(data));
        });

    });
</script>

</body>
</html>
