<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<title>疫苗接种情况</title>
	  
	<link rel="stylesheet" href="css/backend-plugin.min.css">
	<link rel="stylesheet" href="css/backend.css">
	
	<script src="js/backend-bundle.min.js"></script>
	<script src="js/sidebar.js"></script>
	<script src="js/app.js"></script>
	<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
	
	
	<style type="text/css">
		.datatable td{
			border-top: solid #e4e5e5;
			border-bottom: solid #e4e5e5;
			height: 20px;
			line-height: 10px;
			text-align: left;
			padding-left: 10px;
		}
		
		input{
			border-radius:4px; 
			border:1px solid #c8cccf;
			outline:0; 
			padding-left: 10px;
			display:block; 
			cursor: pointer;	
			box-shadow: 2px 2px 5px 1px #ccc;  
		}
		
		.button {
			width: 50px;  
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
			font-size:70%  
		}
		
		.select {
			width: 100px;
			appearance: none;
			-webkit-appearance: none;
			-moz-appearance: none;
			border: 1px solid #e1e1e1;
			border-radius: 4px;
			height: 2.2em;
			padding: 0 24px 0 8px;
			font-family: inherit;
			color: #666;
			cursor: pointer;
			position: relative;
			background: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAMAAADXqc3KAAAASFBMVEUAAAD////Nzc3Nzc3V1dXNzc3MzMzMzMzMzMzNzc3Ozs7j4+PMzMzMzMzMzMzPz8/MzMzNzc3Ozs7Ozs7MzMzNzc3Nzc3Nzc1mbvnCAAAAGHRSTlMAAymOBrtVs9RlPgnPltxPlWwvRJzBt+CSuXutAAAAM0lEQVR4nGMYBbgALycjiGIUZEaTEBLl4WJgEOZgZcLQwybOLsbHj800bhEBFqo7cfACACvdARau8cpxAAAAAElFTkSuQmCC') no-repeat right center;
		}
	</style>
</head>
	
<body>
    <div class="wrapper">
        <div class="iq-sidebar  sidebar-default">
			<div class="iq-sidebar-logo d-flex align-items-end justify-content-between">      								
				<a class="header-logo">					
				    <span>医护人员</span>            
				</a>					
			</div>
			
			<br/> 
    	  
			<div class="data-scrollbar" data-scroll="1">
				<nav class="iq-sidebar-menu">
					<ul id="iq-sidebar-toggle" class="side-menu">    
						<li class="sidebar-layout">
							<a href="toa_reserve.do" class="svg-icon ">
								<i class="">
									<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
										<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M17 20h5v-2a3 3 0 00-5.356-1.857M17 20H7m10 0v-2c0-.656-.126-1.283-.356-1.857M7 20H2v-2a3 3 0 015.356-1.857M7 20v-2c0-.656.126-1.283.356-1.857m0 0a5.002 5.002 0 019.288 0M15 7a3 3 0 11-6 0 3 3 0 016 0zm6 3a2 2 0 11-4 0 2 2 0 014 0zM7 10a2 2 0 11-4 0 2 2 0 014 0z"></path>
									</svg>
								</i>
								<span class="ml-2">预约审核</span>
							</a>
						</li>
						  
						<br/>
																								

																				  
						<li class="sidebar-layout">
							<a href="toa_condition.do" class="svg-icon">
								<i class="">
									<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
										<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M7 7h.01M7 3h5c.512 0 1.024.195 1.414.586l7 7a2 2 0 010 2.828l-7 7a2 2 0 01-2.828 0l-7-7A1.994 1.994 0 013 12V7a4 4 0 014-4z"></path>
									</svg>
								</i>
								<span class="">&nbsp;&nbsp;核酸检测情况</span>
							</a>
						</li>
						  
						<br/>
																					
						<li class="active sidebar-layout">
							<a href="" class="svg-icon">
								<i class="">
									<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
										<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 6V4m0 2a2 2 0 100 4m0-4a2 2 0 110 4m-6 8a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4m6 6v10m6-2a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4"></path>						
									</svg>							
								</i>
								<span class="">&nbsp;&nbsp;疫苗接种情况</span>
							</a>
						</li>
						
						<br/>
																					
						<li class=" sidebar-layout">
							<a href="topatient_submit.do" class="svg-icon">
								<i class="">
									<svg xmlns="http://www.w3.org/2000/svg" width="18" fill="none" viewbox="0 0 24 24" stroke="currentColor">
									    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M19.428 15.428a2 2 0 00-1.022-.547l-2.387-.477a6 6 0 00-3.86.517l-.318.158a6 6 0 01-3.86.517L6.05 15.21a2 2 0 00-1.806.547M8 4h8l-1 1v5.172a2 2 0 00.586 1.414l5 5c1.26 1.26.367 3.414-1.415 3.414H4.828c-1.782 0-2.674-2.154-1.414-3.414l5-5A2 2 0 009 10.172V5L8 4z"></path>
									</svg>							
								</i>
								<span class="">&nbsp;&nbsp;病人信息上报</span>
							</a>
						</li>																															 
					</ul>
				</nav>
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
					
					<div class="d-flex align-items-center">

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
					</div>
		        </nav>
		    </div>			
		</div>
		
		
		<div class="content-page">
			<div class="container-fluid">

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

																身份证号
															</th>
															<th scope="col">

																接种时间
															</th>
															<th scope="col">

																接种类型
															</th>
															<th scope="col">
																操作
															</th>

														</tr>
													</thead>
													
													<tbody>
													<c:forEach items="${vaccr}" var="vacc">
														<tr class="white-space-no-wrap">												
															<td>
																${vacc.name}
															</td>
															
															<td>
																${vacc.idcard}
															</td>
															
															<td>
																<fmt:formatDate value="${vacc.time}" pattern="yyyy-MM-dd HH:mm:ss"/>
															</td>
															
															<td>
																${vacc.type}
															</td>


														</c:forEach>
													<tr class="white-space-no-wrap">
														<form action="/insertvaccinationresult.do" method="post">

															<td>
																<input type="text" name="name" required="">
															</td>

															<td>
																<input type="text" name="idcard" required="">
															</td>

															<td>
																<input type="datetime-local" name="time" required="">
															</td>
															<td>
																<select name="type">
																	<option hidden></option>
																	<option>科兴第一针</option>
																	<option>科兴第二针</option>
																	<option>生物第一针</option>
																	<option>生物第二针</option>
																</select>
															</td>
															<td>
																<button type="submit" class="button">添加</button>
															</td>

														</form>
													</tr>

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
	
	<script type="text/javascript" src="js/time.js"></script>
	<script type="text/javascript" src="js/birthday.js"></script>
	
	<script type="text/javascript" color="54,54,54" opacity='0.7' zIndex="-2" count="99" src="//cdn.bootcss.com/canvas-nest.js/1.0.1/canvas-nest.min.js"></script>
</body>
</html>