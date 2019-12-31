var CKwidth = document.body.clientWidth;
if(CKwidth < 1342){
    CKwidth = 1342
}
$('.loginImgBox').css('height',CKwidth/1336*827);
$('.loginBoxTitle').css("line-height",$('.loginBoxTitle').height()+'px')
$('.LoginYzmSx').css("line-height",$('.LoginYzmSx').height()+'px')
$('.LoginFwqBtn').css("line-height",$('.LoginFwqBtn').height()+'px')
$('.LoginBtnBox .LoginLbtn,.LoginBtnBox .LoginRbtn').css("line-height",$('.LoginBtnBox .LoginLbtn').height()+'px')
$(window).resize(function() {
    var CKwidth = document.body.clientWidth;
    if(CKwidth<1342){
        CKwidth = 1342
    }
    $('.loginImgBox').css('height',CKwidth/1336*827);
});

$("body").click(function(){
    $('.loginUserName ul').fadeOut()
})
$('.LoginAutoA').click(function(){
    if($(this).find('img').attr('src') == 'static/images/hbjkLoginIco2_15.jpg'){
        $(this).find('img').attr('src','<%=path%>/static/images/hbjkLoginIco3_03.jpg')
    }else{
        $(this).find('img').attr('src','<%=path%>/static/images/hbjkLoginIco2_15.jpg')
    }
})