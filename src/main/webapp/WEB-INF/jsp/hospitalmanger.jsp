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
		 

	</head>
	<body>
		<div class="container">
			  <div class="row">
			      <div class="col-lg-11"></div>
				  <div class="col-lg-1"><a href="/logout.do"><button type="button" class="btn btn-info">退出登录</button></a></div>
			   </div>
			<h1>管理员界面</h1>
			<ul class="nav nav-pills">
			  <li><a href="/toadminlist.do">账号信息管理</a></li>
			  <li class="active"><a href="#">医院信息管理</a></li>
			</ul>
			<table class="table">
			 <br/>
			  <thead>
			    <tr>
			      <th>医院编号</th>
			      <th>医院名称</th>
			      <th>邀请码</th>
				  <th> </th></tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${hospitals}" var="hospital">
			    <tr>
			      <td>${hospital.hospitalnumber}</td>
			      <td>${hospital.hospitalname}</td>
			      <td>${hospital.code}</td>
					<td><a href="/preupdatehospital.do?hospitalnumber=${hospital.hospitalnumber}&hospitalname=${hospital.hospitalname}&code=${hospital.code}"><button type="button" class="btn btn-danger btn-sm" >修改</button></a>&nbsp;&nbsp;<a href="/delecthospital.do?hospitalnumber=${hospital.hospitalnumber}"><button type="button" class="btn btn-danger btn-sm">删除</button></a></td>
				  </tr>
			  </c:forEach>
					<form role="from" action="/inserthospital.do" method="post">
			      <td><input type="text" class="form-control" name="hospitalnumber"></td>
			      <td><input type="text" class="form-control" name="hospitalname"></td>
				   
				     
			      <td><input type="text" class="form-control" name="code">
						</td>
						<td><button type="submit" class="btn btn-primary btn-sm">添加</button>
</td> </form>
				   </tr>
				 
			  </tbody>
			</table>
		</div>	
	
	</body>

	
</html>
