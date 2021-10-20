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
    <title>Title</title>
    <script>
        // 判断是登录账号和密码是否为空
        function check(from){
            var id = from.id.value;
            var password = from.password.value;
            var repassword=from.repassword.value;
            if(id.length!=11 || password.length<6){
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
</head>
<body>
<form action="/register.do" method="post" onsubmit="return check(this);">
    账号：<input type="text" name="id" placeholder="手机号码"><br>
    密码：<input type="password" name="password" placeholder="密码长度应多于6位"><br>
    确认密码：<input type="password" name="repassword"><br>
    激活码：<input type="text" name="code" placeholder="选填">
    <input type="submit" value="注册"><br>
    <input type="reset" value="重置">
    <br>
</form>
<span >${msg1}</span>

</body>
</html>
