<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>疫情管理系统 </title>
    <!-- plugin css file  -->
    <link rel="stylesheet" href="static/css/responsive.dataTables.min.css">
    <link rel="stylesheet" href="static/css/dataTables.bootstrap5.min.css">
    <!-- project css file  -->
    <link rel="stylesheet" href="static/css/ihealth.style.min.css">
</head>
<body>

<div id="ihealth-layout" class="theme-tradewind">
    
    <!-- sidebar -->
    <div class="sidebar px-4 py-4 py-md-5 me-0">
        <div class="d-flex flex-column h-100">
            <a href="" class="mb-0 brand-icon">
                <span class="logo-icon">
                    <i class="icofont-heart-beat fs-2"></i>
                </span>
                <span class="logo-text">疫情管理</span>
            </a>
            <!-- Menu: main ul -->

            <ul class="menu-list flex-grow-1 mt-3">
                
                <li><a class="m-link" href="/toindex.do"><i class="icofont-ui-home fs-5"></i> <span>疫情咨询</span></a></li>
                <!-- Menu: Sub menu ul -->
                    
                
                <li><a class="m-link active" href="/topersonalstatue.do"><i class="icofont-ui-add"></i> <span>个人健康状况</span></a></li>

                <li><a class="m-link" href="/toyuyuehesuan.do"><i class="icofont-injection-syringe"></i> <span>预约核酸检测</span></a></li>
                <li><a class="m-link" href="/toyimiao.do"><i class="icofont-aids"></i> <span>预约疫苗接种</span></a></li>
                <li><a class="m-link" href="/topayment.do"><i class="icofont-money-bag"></i> <span>预约中心</span></a></li>
                
                <li><a class="m-link" href="/tomerngyarea.do"><i class="icofont-exclamation-square"></i> <span>风险地区</span></a></li>
                <li><a class="m-link" href="/tojinjishangbao.do"><i class="icofont-hospital fs-5"></i> <span>紧急上报</span></a></li>
            
                
            </ul>
            
            <!-- Menu: menu collepce btn -->
            <button type="button" class="btn btn-link sidebar-mini-btn text-light">
                <span class="ms-2"><i class="icofont-bubble-right"></i></span>
            </button>
        </div>
    </div>

    <!-- main body area -->
    <div class="main px-lg-4 px-md-4">

        <!-- Body: Header -->
        <div class="header">
            <nav class="navbar py-4">
                <div class="container-xxl">
    
                    <!-- header rightbar icon -->
                    <div class="h-right d-flex align-items-center mr-5 mr-lg-0 order-1">
                        <div class="dropdown user-profile ml-2 ml-sm-3 d-flex align-items-center zindex-popover">
                            
                            <a class="nav-link dropdown-toggle pulse p-0" href="#" role="button" data-bs-toggle="dropdown" data-bs-display="static">
                                <img class="avatar lg rounded-circle img-thumbnail" src="static/picture/profile_av.png" alt="profile">
                            </a>
                            <div class="dropdown-menu rounded-lg shadow border-0 dropdown-animation dropdown-menu-end p-0 m-0">
                                <div class="card border-0 w280">
                                    <div class="card-body pb-0">
                                        <div class="d-flex py-1">
                                            <img class="avatar rounded-circle" src="static/picture/profile_av.png" alt="profile">
                                            <div class="flex-fill ms-3">
                                                <p class="mb-0"><span class="font-weight-bold">John	Quinn</span></p>
                                            </div>
                                        </div>
                                        
                                        <div><hr class="dropdown-divider border-dark"></div>
                                    </div>
                                    <div class="list-group m-2 ">
                                        <a href="/topersonal.do" class="list-group-item list-group-item-action border-0 "><i class="icofont-ui-video-chat fs-5 me-3"></i>完善个人信息</a>
                                        <a href="/logout.do" class="list-group-item list-group-item-action border-0 "><i class="icofont-logout fs-6 me-3"></i>退出登录</a>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="setting ms-2">
                            <a href="#" data-bs-toggle="modal" data-bs-target="#Settingmodal"><i class="icofont-gear-alt fs-5"></i></a>
                        </div>
                    </div>
    
                    <!-- menu toggler -->
                    <button class="navbar-toggler p-0 border-0 menu-toggle order-3" type="button" data-bs-toggle="collapse" data-bs-target="#mainHeader">
                        <span class="fa fa-bars"></span>
                    </button>
    
                    <!-- main menu Search-->
                    <div class="order-0 col-lg-4 col-md-4 col-sm-12 col-12 mb-3 mb-md-0 ">
                        
                    </div>
    
                </div>
            </nav>
        </div>    

        <!-- Body: Body -->
        <div class="body d-flex py-3" >
            <div class="card mb-3">
                <div class="card-header py-3 d-flex justify-content-between bg-transparent border-bottom-0">
                    <h6 class="mb-0 fw-bold ">个人健康状况</h6> 
                </div>
                <div class="card-body">
                    
                        <div class="row g-3 align-items-center">
                            <div class="col-md-6">
                                <label class="form-label">名字</label>
                                <td>${name}</td>
                            </div>
                            
                            <div class="col-md-6">
                                <label class="form-label">体温</label>
                                <td>36.3</td>
                            </div>
                            <div class="col-md-6">
                                <label class="form-label">现居地</label>
                                <td>${location}</td>
                            </div>
                            
                            
                            <div class="col-md-6">

                            </div>

                            <div class="container-xxl">
                                
                                <h6 class="mb-0 fw-bold ">核酸检测结果</h6> 
                                
                                    <table  class="table table-hover align-middle mb-0" style="width:100%">
                                        <thead>
                                            <tr>
                                                <th>检测地点</th>
                                                <th>检测时间</th>
                                                <th>检测结果</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${list1}" var="result1">
                                            <tr>
                                                <td>${result1.hospitalname}</td>
                                                <td><fmt:formatDate value="${result1.time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                                <td><span class="badge bg-warning">${result1.result}</span></td>
                                            </tr>
                                            </c:forEach>
                                            
                                        </tbody>
                                    </table>   
                            </div>

                            <div class="col-md-6">

                            </div>

                            <div class="container-xxl">
                                
                                <h6 class="mb-0 fw-bold ">疫苗接种情况</h6> 
                                
                                    <table  class="table table-hover align-middle mb-0" style="width:100%">
                                        <thead>
                                            <tr>
                                                <th>接种疫苗类型</th>
                                                <th>接种地点</th>
                                                <th>接种时间</th>
                                                            
                                                    </tr>

                                        </thead>

                                        <tbody>
                                            <c:forEach items="${list2}" var="result2">
                                            <tr>
                                                <td>${result2.type}</td>
                                                <td>${result2.hospitalname}</td>
                                                <td><span><fmt:formatDate value="${result2.time}" pattern="yyyy-MM-dd HH:mm:ss"/></span></td>
                                            </tr>
                                            </c:forEach>
                                        </tbody>


                                    </table>   
                        </div> 

                        <div class="col-md-6">

                        </div>

                        <div class="container-xxl">
                            
                            <h6 class="mb-0 fw-bold ">病情上报情况</h6> 
                            
                                <table id="myProjectTable" class="table table-hover align-middle mb-0" style="width:100%">
                                    <thead>
                                        <tr>

                                            <th>上报地点</th>
                                            <th>上报时间</th>
                                            <th>诊断结果</th>
                                                        
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${list4}" var="result4">
                                        <tr>
                                            <td><a href="javascript:;">${result4.place}</a></td>
                                            <td><fmt:formatDate value="${result4.time}" pattern="yyyy-MM-dd"/></td>
                                            <td><span class="badge bg-lavender-purple">${result4.diagnosisresults}</span></td>
                                        </tr>
                                        </c:forEach>
                                        
                                    </tbody>
                                </table>   
                    </div>  
                </div>      
            </div>
        </div>      
      
        <!-- Modal Custom Settings-->
        <div class="modal fade right" id="Settingmodal" tabindex="-1" aria-hidden="true">
            <div class="modal-dialog  modal-sm">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Custom Settings</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body custom_setting">
                        <!-- Settings: Color -->
                        <div class="setting-theme pb-3">
                            <h6 class="card-title mb-2 fs-6 d-flex align-items-center"><i class="icofont-color-bucket fs-4 me-2 text-primary"></i>Template Color Settings</h6>
                            <ul class="list-unstyled row row-cols-3 g-2 choose-skin mb-2 mt-2">
                                <li data-theme="indigo"><div class="indigo"></div></li>
                                <li data-theme="tradewind" class="active"><div class="tradewind"></div></li>
                                <li data-theme="monalisa"><div class="monalisa"></div></li>
                                <li data-theme="blue"><div class="blue"></div></li>
                                <li data-theme="cyan"><div class="cyan"></div></li>
                                <li data-theme="green"><div class="green"></div></li>
                                <li data-theme="orange"><div class="orange"></div></li>
                                <li data-theme="blush"><div class="blush"></div></li>
                                <li data-theme="red"><div class="red"></div></li>
                            </ul>
                        </div>
                        <div class="sidebar-gradient py-3">
                            <h6 class="card-title mb-2 fs-6 d-flex align-items-center"><i class="icofont-paint fs-4 me-2 text-primary"></i>Sidebar Gradient</h6>
                            <div class="form-check form-switch gradient-switch pt-2 mb-2">
                                <input class="form-check-input" type="checkbox" id="CheckGradient">
                                <label class="form-check-label" for="CheckGradient">Enable Gradient! ( Sidebar )</label>
                            </div>
                        </div>
                        <!-- Settings: Template dynamics -->
                        <div class="dynamic-block py-3">
                            <ul class="list-unstyled choose-skin mb-2 mt-1">
                                <li data-theme="dynamic"><div class="dynamic"><i class="icofont-paint me-2"></i> Click to Dyanmic Setting</div></li>
                            </ul>
                            <div class="dt-setting">
                                <ul class="list-group list-unstyled mt-1">
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label>Primary Color</label>
                                        <button id="primaryColorPicker" class="btn bg-primary avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label>Secondary Color</label>
                                        <button id="secondaryColorPicker" class="btn bg-secondary avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label class="text-muted">Chart Color 1</label>
                                        <button id="chartColorPicker1" class="btn chart-color1 avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label class="text-muted">Chart Color 2</label>
                                        <button id="chartColorPicker2" class="btn chart-color2 avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label class="text-muted">Chart Color 3</label>
                                        <button id="chartColorPicker3" class="btn chart-color3 avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label class="text-muted">Chart Color 4</label>
                                        <button id="chartColorPicker4" class="btn chart-color4 avatar xs border-0 rounded-0"></button>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between align-items-center py-1 px-2">
                                        <label class="text-muted">Chart Color 5</label>
                                        <button id="chartColorPicker5" class="btn chart-color5 avatar xs border-0 rounded-0"></button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <!-- Settings: Font -->
                        <div class="setting-font py-3">
                            <h6 class="card-title mb-2 fs-6 d-flex align-items-center"><i class="icofont-font fs-4 me-2 text-primary"></i> Font Settings</h6>
                            <ul class="list-group font_setting mt-1">
                                <li class="list-group-item py-1 px-2">
                                    <div class="form-check mb-0">
                                        <input class="form-check-input" type="radio" name="font" id="font-poppins" value="font-poppins">
                                        <label class="form-check-label" for="font-poppins">
                                            Poppins Google Font
                                        </label>
                                    </div>
                                </li>
                                <li class="list-group-item py-1 px-2">
                                    <div class="form-check mb-0">
                                        <input class="form-check-input" type="radio" name="font" id="font-opensans" value="font-opensans" checked="">
                                        <label class="form-check-label" for="font-opensans">
                                            Open Sans Google Font
                                        </label>
                                    </div>
                                </li>
                                <li class="list-group-item py-1 px-2">
                                    <div class="form-check mb-0">
                                        <input class="form-check-input" type="radio" name="font" id="font-montserrat" value="font-montserrat">
                                        <label class="form-check-label" for="font-montserrat">
                                            Montserrat Google Font
                                        </label>
                                    </div>
                                </li>
                                <li class="list-group-item py-1 px-2">
                                    <div class="form-check mb-0">
                                        <input class="form-check-input" type="radio" name="font" id="font-mukta" value="font-mukta">
                                        <label class="form-check-label" for="font-mukta">
                                            Mukta Google Font
                                        </label>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <!-- Settings: Light/dark -->
                        <div class="setting-mode py-3">
                            <h6 class="card-title mb-2 fs-6 d-flex align-items-center"><i class="icofont-layout fs-4 me-2 text-primary"></i>Contrast Layout</h6>
                            <ul class="list-group list-unstyled mb-0 mt-1">
                                <li class="list-group-item d-flex align-items-center py-1 px-2">
                                    <div class="form-check form-switch theme-switch mb-0">
                                        <input class="form-check-input" type="checkbox" id="theme-switch">
                                        <label class="form-check-label" for="theme-switch">Enable Dark Mode!</label>
                                    </div>
                                </li>
                                <li class="list-group-item d-flex align-items-center py-1 px-2">
                                    <div class="form-check form-switch theme-high-contrast mb-0">
                                        <input class="form-check-input" type="checkbox" id="theme-high-contrast">
                                        <label class="form-check-label" for="theme-high-contrast">Enable High Contrast</label>
                                    </div>
                                </li>
                                <li class="list-group-item d-flex align-items-center py-1 px-2">
                                    <div class="form-check form-switch theme-rtl mb-0">
                                        <input class="form-check-input" type="checkbox" id="theme-rtl">
                                        <label class="form-check-label" for="theme-rtl">Enable RTL Mode!</label>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="modal-footer justify-content-start">
                        <button type="button" class="btn btn-white border lift" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary lift">Save Changes</button>
                    </div>
                </div>
            </div>
        </div>    
    </div>
  
</div>

<!-- Jquery Core Js -->
<script src="static/js/libscripts.bundle.js"></script>

<!-- Plugin Js -->
<script src="static/js/apexcharts.bundle.js"></script>
<script src="static/js/jquery-ui.min.js"></script>
<script src="static/js/owl.carousel.js"></script>
<script src="static/js/dataTables.bundle.js"></script>      

<!-- Jquery Page Js -->
<script src="static/js/template.js"></script>
<script src="static/js/index.js"></script>
 <script>
      $('#myDataTable')
      .addClass( 'nowrap' )
      .dataTable( {
          responsive: true,
          columnDefs: [
              { targets: [-1, -3], className: 'dt-body-right' }
          ]
      });
 </script>
</body>
</html> 