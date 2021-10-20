<%--
  Created by IntelliJ IDEA.
  User: 11359
  Date: 2021/10/17
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        // 判断是登录账号和密码是否为空
        function check(from){
            var id = from.id.value;
            var password =from.password.value;
            if(id=="" || password==""){
                alert('账号或密码不能为空');
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form action="login.do" method="post" onsubmit="return check(this);">
账号：<input type="text" name="id" ><br>
密码：<input type="password" name="password"><br>
    <input type="submit" value="登录" ><br>
    <input type="reset" value="重置">
    <br>
</form>
    <span id="message">${msg}</span>


<form action="register.do">
    <input type="submit" value="注册">
</form>
</body>
</html>
