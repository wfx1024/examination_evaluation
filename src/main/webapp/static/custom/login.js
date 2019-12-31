
function reloadValidateCode(){
    $("#validateCodeImg").attr("src",path+"/validateCode?data="+ Math.floor(Math.random()*24));
}
var b =true;
function btn() {
    if($("#userName").val().length<=0){
        $(".input_Account").show();
        return;
    }else {
        $(".input_Account").hide();
    }
    if($("#password").val().length<=0){
        $(".input_Password").show();
        return;
    }else {
        $(".input_Password").hide();
    }
    var account = $("#userName").val();
    var password = $("#password").val();
    var RememberMe ;
    if($("[name='RememberMe']")[0].checked){
        RememberMe = true;
    }else {
        RememberMe = false;
    }
    // var rememberMe = $("[name='rememberMe']").val();
    var validationCode = $("[name='validationCode']").val();
    $.ajax({
        url: path+"/key-pair",
        type: "POST",
        dataType:"json",
        async: false,
        success: function (data) {
            var modulus;
            var exponent;
            $.each(data, function (key, values) {
                if (key == "modulus") {
                    modulus = values
                }
                if (key == "exponent") {
                    exponent = values
                }
            });
            if (password.length != 256) {
                var publicKey = RSAUtils.getKeyPair(exponent, '', modulus);
                password = RSAUtils.encryptedString(publicKey, password)
            }
            if (!b)return;
            b=false;
            $.ajax({
                url: path+"/login",
                // data:$(".form").serialize(),
                data: {
                    loginName: account,
                    loginPwd: password,
                    validationCode: validationCode,
                    RememberMe:RememberMe
                },
                type: "post",
                dataType: "json",
                async:false,
                success: function (data) {
                    if (data.retCode == "200") {
                        location.href = path+"/index";
                    } else {
                        alert(data.retMsg);
                        reloadValidateCode();
                        $("[name='validationCode']").val("");
                        b = true;
                    }
                },
                error:function (e) {
                    b = true;
                }
            })
        }
    });
}

function on_btn(evt) {
    evt = (evt) ? evt : ((window.event) ? window.event : ""); //兼容IE和Firefox获得keyBoardEvent对象
    var key = evt.keyCode?evt.keyCode:evt.which;//兼容IE和Firefox获得keyBoardEvent对象的键值 
    if (key == 13) {
        if (!$("#btn").prop("disabled")) {
            btn();
        }
    }
}

$(".LoginRbtn").click(function(){
    $(".loginForm")[0].reset();
})