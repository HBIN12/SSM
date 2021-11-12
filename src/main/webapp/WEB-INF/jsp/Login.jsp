<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
  <head>
    <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <title>疫情防控系统</title>
      
      <link rel="stylesheet" href="css/backend-plugin.min.css">
      <link rel="stylesheet" href="css/backend.css">  </head>
  <body class=" ">

    
      <div class="wrapper">
    <section class="login-content">
         <div class="container h-100">
            <div class="row align-items-center justify-content-center h-100">
               <div class="col-md-5">
                  <div class="card p-3">
                     <div class="card-body">
                        <div class="auth-logo">
                           <img src="img/logo.png" class="img-fluid  rounded-normal  darkmode-logo" alt="logo">
                           <img src="img/logo-dark.png" class="img-fluid rounded-normal light-logo" alt="logo">
                        </div>
                        <h3 class="mb-3 font-weight-bold text-center">欢迎登录疫情防控系统</h3>
                        <div class="mb-5">
                            <p class="line-around text-secondary mb-0"><span class="line-around-1"></span></p>
                        </div>
                        <form action="/login.do" method="post" onsubmit="return check(this)">
                           <div class="row">
                              <div class="col-lg-12">
                                 <div class="form-group">
                                    <label class="text-secondary">账号</label>
                                    <input class="form-control" type="text" placeholder="请输入账号" name="id">
                                 </div>
                              </div>
                              <div class="col-lg-12 mt-2">
                                 <div class="form-group">
                                     <div class="d-flex justify-content-between align-items-center">
                                         <label class="text-secondary">密码</label>
                                     </div>
                                    <input class="form-control" type="password" placeholder="请输入密码" name="password">
                                 </div>
                              </div>
                               <div class="col-lg-12 mt-2">
                               <p><font color="red">${msg}</font></p>
                               </div>
                           </div>
                           <button type="submit" class="btn btn-primary btn-block mt-2">登录</button>
                           <div class="col-lg-12 mt-3">
                                <p class="mb-0 text-center">没有账号? <a href="/register.do">注册</a></p>
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
          // 判断登录账号和密码是否格式错误
          function check(form){
              var id = form.id.value;
              var password = form.password.value;
              if(id=="" || password==""){
                  alert('账号或密码不能为空');
                  return false;
              }
              else return true;}
      </script>
 </body>
</html>