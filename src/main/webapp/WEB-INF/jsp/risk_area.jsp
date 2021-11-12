<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>风险地区上报</title>
  
	<link rel="stylesheet" href="css/backend-plugin.min.css">
	<link rel="stylesheet" href="css/backend.css">
	<link rel="stylesheet" type="text/css" href="css/hzw-city-picker.css"/>
	
	<style>
		.div{
			padding-top: 100px;;
		}

		.select {
			width: 515px;
			appearance: none;
			-webkit-appearance: none;
			-moz-appearance: none;
			border: 1px solid #e1e1e1;
			border-radius: 4px;
			height: 2.8em;
			padding: 0 24px 0 8px;
			font-family: inherit;
			color: #666;
			cursor: pointer;
			position: relative;
			background: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAMAAADXqc3KAAAASFBMVEUAAAD////Nzc3Nzc3V1dXNzc3MzMzMzMzMzMzNzc3Ozs7j4+PMzMzMzMzMzMzPz8/MzMzNzc3Ozs7Ozs7MzMzNzc3Nzc3Nzc1mbvnCAAAAGHRSTlMAAymOBrtVs9RlPgnPltxPlWwvRJzBt+CSuXutAAAAM0lEQVR4nGMYBbgALycjiGIUZEaTEBLl4WJgEOZgZcLQwybOLsbHj800bhEBFqo7cfACACvdARau8cpxAAAAAElFTkSuQmCC') no-repeat right center;
		}
	</style>
	
	<script type="text/javascript" src="js/backend-bundle.min.js"></script>
	<script type="text/javascript" src="js/sidebar.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
	<script type="text/javascript">
		// 判断是登录账号和密码是否为空
		function check(form){
			var name = form.name.value;
			var area = form.area.value;
			var condition = form.condition.value;

			if(name==""){
				alert('姓名不能为空');
				return false;
			}
			if(area==""){
				alert('风险地区不能为空');
				return false;
			}
			if(condition==""){
				alert('风险情况不能为空');
				return false;
			}
			return true;
		}
	</script>
	
</head>
   
<body>
    <div class="wrapper">
        <div class="iq-sidebar  sidebar-default">
    		<div class="iq-sidebar-logo d-flex align-items-end justify-content-between">
    			<a class="header-logo">					
    			    <span>信息上报人员</span>            
    			</a>					
    		</div>
			
        <br/> 
    	  
        <div class="data-scrollbar" data-scroll="1" data-scrollbar="true" tabindex="-1" style="overflow: hidden;outline: none;">
			<div class="scroll-content">
				<nav class="iq-sidebar-menu">
					<ul id="iq-sidebar-toggle" class="side-menu">													
						<li class="active sidebar-layout">
							<a href="" class="svg-icon">
								<i class="">
									<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
										<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 6V4m0 2a2 2 0 100 4m0-4a2 2 0 110 4m-6 8a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4m6 6v10m6-2a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4"></path>						
									</svg>							
								</i>
								<span class="">&nbsp;&nbsp;风险地区上报</span>
							</a>
						</li>
						
						<br />
						
						<li class="sidebar-layout">
							<a href="/topatient_receive.do" class="svg-icon">
								<i class="">
									<svg class="svg-icon" id="iq-user-1-1" xmlns="http://www.w3.org/2000/svg" fill="none" viewbox="0 0 24 24" stroke="currentColor">
										<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M5.121 17.804A13.937 13.937 0 0112 16c2.5 0 4.847.655 6.879 1.804M15 10a3 3 0 11-6 0 3 3 0 016 0zm6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
									</svg>								
								</i>
								<span class="">&nbsp;&nbsp;患者信息</span>
							</a>
						</li>																															 
					</ul>
				</nav>
			</div>
    	</div>		
    	</div>
		
		<div class="iq-top-navbar">
		    <div class="iq-navbar-custom">
		        <nav class="navbar navbar-expand-lg navbar-light p-0">
					
					<!--左侧导航栏菜单收缩按钮-->
		            <div class="side-menu-bt-sidebar">
		                <svg xmlns="http://www.w3.org/2000/svg" class="text-secondary wrapper-menu" width="30" fill="none" viewbox="0 0 24 24" stroke="currentColor">
		                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16M4 18h16"></path>
		                </svg>
		            </div>
					
					<div class="d-flex align-items-center">
						
						<!--退出登录-->
						<div class="navbar-collapse collapse show" id="navbarSupportedContent" style="">
							<ul class="navbar-nav ml-auto navbar-list align-items-center">							
								<li class="nav-item nav-icon dropdown">
									<a href="#" class="nav-item nav-icon dropdown-toggle pr-0 search-toggle" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
										<img src="img/info.png" class="img-fluid avatar-rounded" alt="user">
									</a>
									
									<ul class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">										
										<li class="dropdown-item  d-flex svg-icon border-top">
											<svg class="svg-icon mr-0 text-secondary" id="h-05-p" width="20" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor">
												<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M17 16l4-4m0 0l-4-4m4 4H7m6 4v1a3 3 0 01-3 3H6a3 3 0 01-3-3V7a3 3 0 013-3h4a3 3 0 013 3v1"></path>
											</svg>
											<a href="/logout.do">退出登录</a>
										</li>
									</ul>
								</li>
							</ul>                     
						</div>
											  
											  
					</div>
		        </nav>
		    </div>					 			
		</div>
		
		
		<section class="div">
		    <div class="container h-100">
		        <div class="row align-items-center justify-content-center h-100">
					<div class="col-md-5">
						
							<h3 class="mb-3 font-weight-bold text-center">信息上报</h3>

							<form onsubmit="return check(this)" method="post" action="/insertriskregion.do">
								<div class="row">		  
									<div class="col-lg-12 mt-2">
										<div class="form-group">
											<div class="d-flex justify-content-between align-items-center">
												<label class="text-secondary">姓名</label>
											</div>
											<input name="reportingperson" class="form-control" type="text" placeholder="请输入上报人姓名" onfocus="this.placeholder=' '" onblur="this.placeholder='请输入上报人姓名'">
										</div>
									</div>
													  
									<div class="col-lg-12 mt-2">
										<div class="form-group">
											<div class="d-flex justify-content-between align-items-center">
												<label class="text-secondary">风险地区</label>
											</div>
											<input name="region" id="cityChoice" class="form-control" type="text" placeholder="请选择风险地区名称" onfocus="this.placeholder=' '" onblur="this.placeholder='请选择风险地区名称'">
										</div>
									</div>
									
									<div class="col-lg-12 mt-2">
										<div class="form-group">
											<div class="d-flex justify-content-between align-items-center">
												<label class="text-secondary">风险情况</label>
											</div>
											<select class="select" name="risksituation">
												<option>请选择</option>
												<option>低风险</option>
												<option>中风险</option>
												<option>高风险</option>
											</select>
										</div>
									</div>
									<div class="col-lg-12 mt-2">
										<div class="form-group">
											<div class="d-flex justify-content-between align-items-center">
												<label class="text-secondary"><font color="red">${msg}</font></label>
											</div>
										</div>
									</div>
								</div>
								<button type="submit" class="btn btn-primary btn-block mt-2">提交</button>
		                    </form>
					</div>
		        </div>
			</div>
		</section>
		
		
    </div>   

	<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/city-data.js"></script>
	<script type="text/javascript" src="js/hzw-city-picker.min.js"></script>
	<script>
	    var cityPicker = new HzwCityPicker({
	        data: data,
	        target: 'cityChoice',
	        valType: 'k-v',
	        hideCityInput: {
	            name: 'city',
	            id: 'city'
	        },
	        hideProvinceInput: {
	            name: 'province',
	            id: 'province'
	        }
	    });
	
	    cityPicker.init();
	</script>

	<script type="text/javascript" color="54,54,54" opacity='0.7' zIndex="-2" count="99" src="//cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</body>
</html>