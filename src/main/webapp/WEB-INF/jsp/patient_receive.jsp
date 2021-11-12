<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<title>患者信息</title>
	  
	<link rel="stylesheet" href="css/backend-plugin.min.css">
	<link rel="stylesheet" href="css/backend.css">
	
	<style type="text/css">
		td{
			border-top: solid #e4e5e5;
			border-bottom: solid #e4e5e5;
			height: 20px;
			line-height: 10px;
			text-align: left;
			padding-left: 10px;
		}
		
		.button {
			width: 100px;  
			padding:8px;  
			background-color: #428bca;  
			border-color: #357ebd;  
			color: #fff;  
			-moz-border-radius: 10px;  
			-webkit-border-radius: 10px;  
			border-radius: 10px; /* future proofing */  
			-khtml-border-radius: 10px; /* for old Konqueror browsers */  
			text-align: center;  
			vertical-align: middle;  
			border: 1px solid transparent;  
			font-weight: 900;  
			font-size:125%  
		} 
	</style>
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
							<li class="sidebar-layout">
								<a href="/toreporter.do" class="svg-icon">
									<i class="">
										<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
											<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 6V4m0 2a2 2 0 100 4m0-4a2 2 0 110 4m-6 8a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4m6 6v10m6-2a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4"></path>						
										</svg>							
									</i>
									<span class="">&nbsp;&nbsp;风险地区上报</span>
								</a>
							</li>
							
							<br />
							
							<li class="active sidebar-layout">
								<a href="" class="svg-icon">
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
		            <div class="side-menu-bt-sidebar">
		                <svg xmlns="http://www.w3.org/2000/svg" class="text-secondary wrapper-menu" width="30" fill="none" viewbox="0 0 24 24" stroke="currentColor">
		                <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16M4 18h16"></path>
		                </svg>
		            </div>

					<!--退出登录-->
					<div class="navbar-collapse collapse show" id="navbarSupportedContent" style="">
						<ul class="navbar-nav ml-auto navbar-list align-items-center">							
							<li class="nav-item nav-icon dropdown">
								<a href="#" class="nav-item nav-icon dropdown-toggle pr-0 search-toggle" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
									<img src="img/doctor.png" class="img-fluid avatar-rounded" alt="user">
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
				</nav>
			</div> 
		</div>			
		</div>
		
		
		<div class="content-page">
			<div class="container-fluid">		
				<div class="table-responsive">
					<div id="DataTables_Table_0_wrapper" class="dataTables_wrapper dt-bootstrap4 no-footer">
						
						
						<div class="row">
							<div class="col-lg-12">                                
								<div class="row">
									<div class="col-lg-12">
										<div class="card card-block card-stretch">
											<div class="card-body p-0">                                
												<div class="table-responsive">
													<table class="table data-table mb-0">
														<thead class="table-color-heading">
															<tr>
																<th scope="col">
																	姓名
																</th>
																<th scope="col">
																	所在地区
																</th>
																<th scope="col">
																	核酸检测结果
																</th>
																<th scope="col">
																	检测医院
																</th>

															</tr>
														</thead>
														
														<tbody>
														<C:forEach items="${pa}" var="p">
															<tr class="white-space-no-wrap">												
																<td>
																	<span class="font-weight-bold">${p.name}</span>
																</td>
																
																<td>
																	${p.place}
																</td>
																
																<td>
																	${p.diagnosisresults}
															</td>
																<td>
																		${p.hospitalname}
																</td>


															</tr>		</C:forEach>
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
				
						

						
					</div>
				</div>
			</div>
		</div>
		
		
		</div>	
	</div>
	
	
	
	
	
	
	<script src="js/backend-bundle.min.js"></script>
	
	<script src="js/sidebar.js"></script>
	
	<script src="js/app.js"></script>
	
	<script src="js/reserve.js"></script>
	
	<script type="text/javascript" color="54,54,54" opacity='0.7' zIndex="-2" count="99" src="//cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
		
</body>
</html>