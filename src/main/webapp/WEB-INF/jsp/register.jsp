<%--
  Created by IntelliJ IDEA.
  User: 11359
  Date: 2021/10/17
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>注册界面</title>

    <link rel="stylesheet" href="css/backend-plugin.min.css">
    <link rel="stylesheet" href="css/backend.css">

</head>
<body class=" ">


<div class="wrapper">
    <section class="login-content">
        <div class="container h-100">
            <div class="row align-items-center justify-content-center h-100">
                <div class="col-md-5">
                    <div class="card p-3">
                        <div class="card-body">
                            <div class="auth-logo">
                                <img src="img/logo-dark.png" class="img-fluid rounded-normal light-logo" alt="logo">
                            </div>
                            <h3 class="mb-3 font-weight-bold text-center">注册</h3>
                            <div class="mb-5">
                                <p class="line-around text-secondary mb-0"><span class="line-around-1"></span></p>
                            </div>

                            <form  action="/register.do" method="post" onsubmit="return check(this)">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label class="text-secondary">账号</label>
                                            <input name="id" class="form-control" type="text" placeholder="请输入11位手机号">
                                        </div>
                                    </div>

                                    <div class="col-lg-12 mt-2">
                                        <div class="form-group">
                                            <label class="text-secondary">密码</label>
                                            <input name="password" class="form-control" type="password" placeholder="请输入6位以上密码">
                                        </div>
                                    </div>

                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label class="text-secondary">确认密码</label>
                                            <input name="repassword" class="form-control" type="password" placeholder="请确认密码">
                                        </div>
                                    </div>

                                    <div class="col-lg-12">
                                        <div class="form-group">
                                            <label class="text-secondary">激活码</label>
                                            <input class="form-control" type="text" placeholder="选填" name="code">
                                        </div>
                                    </div>

                                    <div class="col-lg-12 mt-2">
                                        <div class="form-check form-check-inline">
                                            <div class="custom-control custom-checkbox custom-control-inline mb-3">
                                                <input onclick="changebox()" type="checkbox" class="custom-control-input m-0" id="inlineCheckbox1">
                                                <label class="custom-control-label pl-2" for="inlineCheckbox1">我已阅读并同意《用户协议和隐私条款》。</label>
                                            </div>
                                        </div>
                                        <p><font color="red">${msg1}</font></p>
                                    </div>
                                </div>

                                <button id="register-btn" type="submit" class="btn btn-primary btn-block mt-2"  disabled="disabled">注册</button>

                                <div class="col-lg-12 mt-3">
                                    <p class="mb-0 text-center">已有账号? <a href="/login.do">登录</a></p>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</div>

<script type="text/javascript">
    var box=document.getElementById('inlineCheckbox1');
    function changebox(){
        if(box.checked){
            document.getElementById("register-btn").disabled=false;
        }
        else{
            document.getElementById("register-btn").disabled=true;
        }

    }

</script>

<script type="text/javascript">
    // 判断登录账号和密码是否格式错误
    function check(form){
        var id = form.id.value;
        var password = form.password.value;
        var repassword = form.repassword.value;
        if(id=="" || password==""){
            alert('账号或密码不能为空');
            return false;
        }
        else if(id.length!=11 || password.length<6){
            alert("账号或密码格式错误");
            return false;
        }
        else {
            if (password!=repassword){
                alert("两次输入的密码不一致");
                return false;
            }
            return true
        }
    }
</script>

</body>
</html>