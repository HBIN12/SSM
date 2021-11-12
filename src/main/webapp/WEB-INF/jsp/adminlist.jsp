<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>疫情防控系统管理员界面</title>
		  <link rel="stylesheet" href="css/bootstrap.min.css">
		  <script src="js/jquery.js"></script>
		  <script src="js/bootstrap.min.js"></script>
		  <script type="text/javascript"></script>
		 

	</head>
	<body>
		<div class="container">
			  <div class="row">
			      <div class="col-lg-11"></div>
			      <div class="col-lg-1"><a href="/logout.do"><button type="button" class="btn btn-info">退出登录</button></a></div>
			   </div>
			<h1>管理员界面</h1>
			<ul class="nav nav-pills">
			  <li class="active"><a href="#">账号信息管理</a></li>
			  <li><a href="/tohospitallist.do">医院信息管理</a></li>
			</ul>
			<table class="table">
			 <br/>
			  <thead>
			    <tr>
			      <th>账号</th>
			      <th>密码</th>
			      <th>角色</th>
				  <th> </th></tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${logins}" var="login">
			    <tr>
			      <td>${login.id}</td>
			      <td>${login.password}</td>
			      <td>${login.role}</td>
					<td>
						<a href="/preupdatelogin.do?id=${login.id}&password=${login.password}&role=${login.role}"><button type="button" class="btn btn-danger btn-sm" >修改</button></a>
						<a href="/delectlogin.do?id=${login.id}"><button type="button" class="btn btn-danger btn-sm" >删除</button></a>
					</td>
				  </tr>
			  </c:forEach>
				  
					<tr>
					<form role="from" action="/insertlogin.do" method="post">
			      <td><input type="text" class="form-control" name="id"></td>
			      <td><input type="text" class="form-control" name="password"></td>
				   
				     
			      <td><select class="form-control" name="role">
					  <option hidden></option>
					  <option>user</option>
					  <option>staff</option>
					  <option>reporter</option>
					 <option>admin</option>
						</select>
						</td>
				  <td><button type="submit" class="btn btn-primary btn-sm">添加</button>
</td> </form>
				   </tr>
				 
			  </tbody>
			</table>
		</div>	
	
	</body>

	
</html>
