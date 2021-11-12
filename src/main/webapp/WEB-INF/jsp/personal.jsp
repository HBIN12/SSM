<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html class="no-js" lang="en" dir="ltr">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>疫情管理系统 </title>
    <!-- plugin css file  -->
    <link rel="stylesheet" href="static/css/responsive.dataTables.min.css">
    <link rel="stylesheet" href="static/css/dataTables.bootstrap5.min.css">
    <!-- project css file  -->
    <link rel="stylesheet" href="static/css/ihealth.style.min.css">
</head>
<body>

<div id="ihealth-layout" class="theme-tradewind">
    
    
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
                                        <a href="/topersonal.do" class="list-group-item list-group-item-action border-0 "><i class="icofont-ui-video-chat fs-5 me-3"></i>个人信息</a>
                                        <a href="javascript:;" class="list-group-item list-group-item-action border-0 "><i class="icofont-logout fs-6 me-3"></i>退出登录</a>
                                        
                                    </div>
                                </div>
                            </div>
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
        <div class="body d-flex py-3">
            <div class="card mb-3">
                <div class="card-header py-3 d-flex justify-content-between bg-transparent border-bottom-0">
                    <h6 class="mb-0 fw-bold ">个人信息填写</h6> 
                </div>
                <div class="card-body">
                    <form action="/insertuser.do" method="post">
                        <div class="row g-3 align-items-center">
                            <div class="col-md-6">
                                <label class="form-label">姓名</label>
                                <input type="text" class="form-control" id="firstname" required="" name="name">
                            </div>
                            <div class="col-md-6">
                                <label  class="form-label">身份证</label>
                                <input type="text" class="form-control" id="lastname" required="" name="idcard">
                            </div>
                            <div class="col-md-6">
                                <label class="form-label">手机号</label>
                                <input type="text" class="form-control" id="phonenumber" required="" name="number">
                            </div>
                            <div class="col-md-6">
                                <label  class="form-label">居住地</label>
                                <input type="text" class="form-control" id="emailaddress" required="" name="location">
                            </div>


                            <div class="col-md-6">
                                <label class="form-label">性别</label>
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-check">
                                            <input class="form-check-input" type="radio" name="sex" id="exampleRadios11" value="男" checked="">
                                            <label class="form-check-label" for="exampleRadios11">
                                             男
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-check">
                                            <input class="form-check-input" type="radio" name="sex" id="exampleRadios22" value="女">
                                            <label class="form-check-label" for="exampleRadios22">
                                               女
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            
                        </div>
                        <div class="col-md-6">
                               
                        </div>

                        <button type="submit" class="btn btn-primary mt-4" >保存</button>
                        <a href="/toindex.do"><button type="button" class="btn btn-primary mt-4" >返回</button></a>
                    </form>
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