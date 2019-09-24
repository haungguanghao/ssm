function subLogin() {
    var user = {};
    user.userName = $('#username').val();
    user.userPassword = $('#password').val();
    console.log(user)
    $.post({
        url: '/ssm/user/dologin',
        data: user,
        success: function (data) {
            if(data.success){
                alert("登录成功");
            }else{
                alert("登录失败 " + data.errMsg);
            }
        }
    });
}