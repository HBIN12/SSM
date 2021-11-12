<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>更新医院信息</title>
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script type="text/javascript"></script>
	</head>
	<body>
	<div class="container">
		<br/>
		<br/>
<form class="form-horizontal" role="form" action="/updatehospital.do" method="post">
	<input type="hidden" name="hospitalnumber" value="${hospital.hospitalnumber}">
  <div class="form-group">
    <label  class="col-sm-2 control-label">医院编号</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="rehospitalnumber" value="${hospital.hospitalnumber}" >
    </div>
  </div>
  <div class="form-group">
    <label  class="col-sm-2 control-label">医院名称</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="hospitalname" value="${hospital.hospitalname}">
    </div>
  </div>
  <div class="form-group">
	  <label  class="col-sm-2 control-label">邀请码</label>
	  <div class="col-sm-10">
	    <input type="text" class="form-control" name="code" value="${hospital.code}">
	  </div>
	  </div>
	
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">提交</button>
	   <a href="/tohospitallist.do"><button type="button" class="btn btn-default">返回</button></a>
    </div>
  </div>
</form>
	 </div>
	</body>
	
</html>
