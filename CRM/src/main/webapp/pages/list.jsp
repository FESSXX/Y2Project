<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: 25603
  Date: 2020/6/4
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh">

<head>
	<!-- 页面meta -->
	<meta charset="utf-8" >
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	
	
	
	
	<title>CRM客户管理系统</title>
	<meta name="description" content="AdminLTE2定制版">
	<meta name="keywords" content="AdminLTE2定制版">
	
	
	
	
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.6 -->
	<!-- Font Awesome -->
	<!-- Ionicons -->
	<!-- iCheck -->
	<!-- Morris chart -->
	<!-- jvectormap -->
	<!-- Date Picker -->
	<!-- Daterange picker -->
	<!-- Bootstrap time Picker -->
	<!--<link rel="stylesheet" href="../../../plugins/timepicker/bootstrap-timepicker.min.css">-->
	<!-- bootstrap wysihtml5 - text editor -->
	<!--数据表格-->
	<!-- 表格树 -->
	<!-- select2 -->
	<!-- Bootstrap Color Picker -->
	<!-- bootstrap wysihtml5 - text editor -->
	<!--bootstrap-markdown-->
	<!-- Theme style -->
	<!-- AdminLTE Skins. Choose a skin from the css/skins
	   folder instead of downloading all of them to reduce the load. -->
	<!-- Ion Slider -->
	<!-- ion slider Nice -->
	<!-- bootstrap slider -->
	<!-- bootstrap-datetimepicker -->
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	
	
	
	
	
	
	
	
	<!-- jQuery 2.2.3 -->
	<!-- jQuery UI 1.11.4 -->
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<!-- Bootstrap 3.3.6 -->
	<!-- Morris.js charts -->
	<!-- Sparkline -->
	<!-- jvectormap -->
	<!-- jQuery Knob Chart -->
	<!-- daterangepicker -->
	<!-- datepicker -->
	<!-- Bootstrap WYSIHTML5 -->
	<!-- Slimscroll -->
	<!-- FastClick -->
	<!-- iCheck -->
	<!-- AdminLTE App -->
	<!-- 表格树 -->
	<!-- select2 -->
	<!-- bootstrap color picker -->
	<!-- bootstrap time picker -->
	<!--<script src="../../../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
	<!-- Bootstrap WYSIHTML5 -->
	<!--bootstrap-markdown-->
	<!-- CK Editor -->
	<!-- InputMask -->
	<!-- DataTables -->
	<!-- ChartJS 1.0.1 -->
	<!-- FLOT CHARTS -->
	<!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
	<!-- FLOT PIE PLUGIN - also used to draw donut charts -->
	<!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
	<!-- jQuery Knob -->
	<!-- Sparkline -->
	<!-- Morris.js charts -->
	<!-- Ion Slider -->
	<!-- Bootstrap slider -->
	<!-- bootstrap-datetimepicker -->
	<!-- 页面meta /-->
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/morris/morris.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/select2.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
	<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script>
		function update(id,name,m,p,address,man,z,c,i,l){
			$(".modal-content").css("border-radius","10px");
			$(".modal-content").css("text-align","center");
			$("#cid").val(id);
			$("#cname").val(name);
			$("#mo").val(m);
			$("#lxr").val(man);
			$("#ph").val(p);
			$("#czc").val(z);
			$("#ress").val(address);
			source(c);
			industry(i);
			level(l);
			$(".modal").modal("show");
		}
		
		function source(c) {
			$("option[name='sco']").each(
				function () {
					var num=$(this).val();
					if (num==c){
						$(this).attr("selected","true");
					}
				}
			)
		}
		
		function industry(i) {
			$("option[name='ind']").each(
				function () {
					var num=$(this).val();
					if (num==i){
						$(this).attr("selected","true");
					}
				}
			)
		}
		
		
		function level(l) {
			$("option[name='lev']").each(
				function () {
					var num=$(this).val();
					if (num==l){
						$(this).attr("selected","true");
					}
				}
			)
		}
		
		function xg() {
			$.getJSON("update","cust_id="+$("#cid").val()+"&cust_source="+$("#sc").val()+"&cust_industry="+$("#in").val()+"&cust_level="+$("#cle").val()+"&cust_linkman="+$("#lxr").val()+"&cust_phone="+$("#ph").val()+"&cust_mobile="+$("#mo").val()+"&cust_zipcode="+$("#czc").val()+"&cust_address="+$("#ress").val(),function (date) {
				if (date==1){
					alert("修改成功");
					window.location="list";
				}
			});
		}
		
		function del(id) {
			var b=confirm("确定删除吗？");
			if (b==true){
				window.location="del?id="+id;
			}
		}
		
		function alldel() {
			var flag = false;
			if (confirm("你确定要删除吗？")) {
				$("input[name='alldel']:checkbox").each(function () {
					if (this.checked) {
						flag = true;
					}
				})
			}
			if (flag) {
				$("#delform").submit();
			}
		}
		
	</script>
	<script>
		if ("${msg}"!=""){
			window.setTimeout("alert('${msg}')",200);
		}
	</script>
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">
	
	<!-- 页面头部 -->
	<header class="main-header">
		
		
		<!-- Logo -->
		<a href="all-admin-index.html" class="logo">
			<!-- mini logo for sidebar mini 50x50 pixels -->
			<span class="logo-mini"><b>数据</b></span>
			<!-- logo for regular state and mobile devices -->
			<span class="logo-lg"><b>CRM</b>后台管理</span>
		</a>
		
		
		<!-- Header Navbar: style can be found in header.less -->
		<nav class="navbar navbar-static-top">
			<!-- Sidebar toggle button-->
			<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
				<span class="sr-only">Toggle navigation</span>
			</a>
			
			<div class="navbar-custom-menu">
				<ul class="nav navbar-nav">
					<!-- Messages: style can be found in dropdown.less-->
					
					<!-- User Account: style can be found in dropdown.less -->
					<li class="dropdown user user-menu">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<img src="${pageContext.request.contextPath}/img/1554651606344 (2).jpg" class="user-image" alt="User Image">
							<span class="hidden-xs">Noa</span>
						</a>
						<ul class="dropdown-menu">
							<!-- User image -->
							<li class="user-header">
								<img src="${pageContext.request.contextPath}/img/1554651606344 (2).jpg" class="img-circle" alt="User Image">
								
								<p>
									Noa- 数据管理员
									<small>最后登录${time}</small>
								</p>
							</li>
							<!-- Menu Body
					<li class="user-body">
						<div class="row">
							<div class="col-xs-4 text-center">
								<a href="#">Followers</a>
							</div>
							<div class="col-xs-4 text-center">
								<a href="#">Sales</a>
							</div>
							<div class="col-xs-4 text-center">
								<a href="#">Friends</a>
							</div>
						</div>
					</li>-->
							<!-- Menu Footer-->
							<li class="user-footer">
								<div class="pull-left">
									<a href="#" class="btn btn-default btn-flat">修改密码</a>
								</div>
								<div class="pull-right">
									<a href="#" class="btn btn-default btn-flat">注销</a>
								</div>
							</li>
						</ul>
					</li>
				
				</ul>
			</div>
		</nav>
	</header>
	<!-- 页面头部 /-->
	
	<!-- 导航侧栏 -->
	<aside class="main-sidebar">
		<!-- sidebar: style can be found in sidebar.less -->
		<section class="sidebar">
			<!-- Sidebar user panel -->
			<div class="user-panel">
				<div class="pull-left image">
					<img src="${pageContext.request.contextPath}/img/1554651606344 (2).jpg" class="img-circle" alt="User Image">
				</div>
				<div class="pull-left info">
					<p>Noa</p>
					<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
				</div>
			</div>
			<!-- search form -->
			<!--<form action="#" method="get" class="sidebar-form">
		<div class="input-group">
			<input type="text" name="q" class="form-control" placeholder="搜索...">
			<span class="input-group-btn">
			<button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
			</button>
		  </span>
		</div>
	</form>-->
			<!-- /.search form -->
			
			
			<!-- sidebar menu: : style can be found in sidebar.less -->
			<ul class="sidebar-menu">
				<li class="header">菜单</li>
				
				<li id="admin-index"><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>
				
				<!-- 菜单 -->
				
				
				
				<li class="treeview">
					<a href="#">
						<i class="fa fa-folder"></i> <span>系统管理</span>
						<span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
					</a>
					<ul class="treeview-menu">
						
						
						
						<li id="admin-datalist">
							<a href="all-admin-datalist.html">
								<i class="fa fa-circle-o"></i> 用户管理
							</a>
						</li>
						
						
						
						<li id="admin-profile">
							<a href="all-admin-profile.html">
								<i class="fa fa-circle-o"></i> 权限管理
							</a>
						</li>
						
						<li id="admin-invoice">
							<a href="all-admin-invoice.html">
								<i class="fa fa-circle-o"></i> 角色管理
							</a>
						</li>
						
						<li id="admin-invoice-print">
							<a href="all-admin-invoice-print.html">
								<i class="fa fa-circle-o"></i> 访问日志
							</a>
						</li>
					
					</ul>
				</li>
				
				
				
				<li class="treeview">
					<a href="#">
						<i class="fa fa-pie-chart"></i> <span>客户关系管理</span>
						<span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
					</a>
					<ul class="treeview-menu">
						
						<li id="charts-chartjs">
							<a href="all-charts-chartjs.html">
								<i class="fa fa-circle-o"></i> 用户管理
							</a>
						</li>
					
					
					</ul>
				</li>
				
				
				
				
				
				
				
				
				
				<!-- 菜单 /-->
			
			
			
			</ul>
		</section>
		<!-- /.sidebar -->
	</aside>
	<!-- 导航侧栏 /-->
	
	<!-- 内容区域 -->
	<!-- @@master = admin-layout.html-->
	<!-- @@block = content -->
	
	<div class="content-wrapper">
		
		<!-- 内容头部 -->
		<section class="content-header">
			<h1>
				数据管理
				<small>数据列表</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
				<li><a href="#">数据管理</a></li>
				<li class="active">数据列表</li>
			</ol>
		</section>
		<!-- 内容头部 /-->
		
		<!-- 正文区域 -->
		<section class="content">
			
			<!-- .box-body -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">列表</h3>
				</div>
				
				<div class="box-body">
					
					<!-- 数据表格 -->
					<div class="table-box">
						
						<!--工具栏-->
						<div class="pull-left">
							<div class="form-group form-inline">
								<div class="btn-group">
									客户名称：<input type="text" size="6" class="form-control" placeholder="客户名称" value="">
									客户来源：<select class="form-control">
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_type_code==\"009\"}">
												<option>${i3.dict_item_name}</option>
											</c:if>
										</c:forEach>
								</select>
									所属行业：<select class="form-control">
											<c:forEach items="${list3}" var="i3">
												<c:if test="${i3.dict_type_code=='001'}">
													<option>${i3.dict_item_name}</option>
												</c:if>
											</c:forEach>
								</select>
									客户级别：<select class="form-control">
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_type_code=='006'}">
											<option>${i3.dict_item_name}</option>
											</c:if>
										</c:forEach>
								</select>
								
								</div>
								<button type="button" class="btn btn-default" title="搜索" ><i class="fa fa-search"></i> 搜索</button>
							</div>
						</div>
						
						<!--工具栏/-->
						<form action="dels" method="post" id="delform">
						<!--数据列表-->
						<table id="dataList" class="table table-bordered table-striped table-hover dataTable">
							<thead>
							<tr>
								<th class="" style="padding-right:0px;">
									<input id="selall" type="checkbox" class="icheckbox_square-blue">
								</th>
								<th class="sorting_asc">ID</th>
								<th class="sorting_desc">客户名称</th>
								<th class="sorting_asc sorting_asc_disabled">客户来源</th>
								<th class="sorting_desc sorting_desc_disabled">客户所属行业</th>
								<th class="sorting">客户级别</th>
								<th class="text-center sorting">手机</th>
								<th class="text-center">操作</th>
							</tr>
							</thead>
							<tbody>
									<c:forEach items="${list}" var="ls">
										<tr>
										<td><input name="alldel" type="checkbox" value="${ls.cust_id}"></td>
										<td>${ls.cust_id}</td>
										<td>${ls.cust_name}</td>
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_id==ls.cust_source}">
											<td>${i3.dict_item_name}</td>
											</c:if>
										</c:forEach>
											<c:forEach items="${list3}" var="i3">
												<c:if test="${i3.dict_id==ls.cust_industry}">
													<td>${i3.dict_item_name}</td>
												</c:if>
											</c:forEach>
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_id==ls.cust_level}">
												<td>${i3.dict_item_name}</td>
											</c:if>
										</c:forEach>
											<td class="text-center">${ls.cust_mobile}</td>
											<td class="text-center">
												<button type="button" class="btn bg-olive btn-xs" onclick="update('${ls.cust_id}','${ls.cust_name}','${ls.cust_mobile}','${ls.cust_phone}','${ls.cust_address}','${ls.cust_linkman}','${ls.cust_zipcode}','${ls.cust_source}','${ls.cust_industry}','${ls.cust_level}')">修改</button>
												<button type="button" class="btn bg-olive btn-xs" onclick="del('${ls.cust_id}')">删除</button>
											</td>
										</tr>
							</c:forEach>
							
							</tbody>
							<!--
						<tfoot>
						<tr>
						<th>Rendering engine</th>
						<th>Browser</th>
						<th>Platform(s)</th>
						<th>Engine version</th>
						<th>CSS grade</th>
						</tr>
						</tfoot>-->
						</table>
						</form>
						<!--数据列表/-->
						<!--工具栏-->
						<div class="pull-left">
							<div class="form-group form-inline">
								<div class="btn-group">
									<button type="button" class="btn btn-default" title="新建"><i class="fa fa-file-o"></i> 新建</button>
									<button type="button" class="btn btn-default" title="删除" onclick="alldel()"><i class="fa fa-trash-o"></i> 删除</button>
								</div>
							</div>
						</div>
						<div class="box-tools pull-right">
							<div class="has-feedback">
								<input type="text" class="form-control input-sm" placeholder="搜索">
								<span class="glyphicon glyphicon-search form-control-feedback"></span>
							</div>
						</div>
						<!--工具栏/-->
					
					</div>
					<!-- 数据表格 /-->
				</div>
				<!--修改弹出框-->
				<div class="example-modal" id="example-modal">
					<div class="modal">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span></button>
									<h4 class="modal-title">修改客户信息</h4>
								</div>
								<div class="modal-body">
									<input type="hidden" name="cid" value="" id="cid">
									<p>客户名称：<input type="text" size="50" placeholder="客户名称" value="" disabled name="cname" id="cname"></p>
									<p>客户来源：<select class="control-label" style="width: 371px; height: 26px;" id="sc" name="csource">
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_type_code==\"009\"}">
												<option name="sco" value="${i3.dict_id}">${i3.dict_item_name}</option>
												</c:if>
										</c:forEach>
									</select>
									</p>
									<p>
										所属行业：<select  class="control-label" style="width: 371px;height: 26px;" id="in" name="cindustry">
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_type_code==\"001\"}">
												<option name="ind" value="${i3.dict_id}">${i3.dict_item_name}</option>
											</c:if>
										</c:forEach>
									</select>
									</p>
									<p>
										客户级别：<select class="control-label" style="width: 371px;height: 26px;" id="cle" name="clevel">
										<c:forEach items="${list3}" var="i3">
											<c:if test="${i3.dict_type_code==\"006\"}">
												<option name="lev" value="${i3.dict_id}">${i3.dict_item_name}</option>
											</c:if>
										</c:forEach>
									</select>
									</p>
									<p>&nbsp;&nbsp;&nbsp;联系人：<input type="text" size="50" placeholder="联系人" value="" id="lxr" name="cman"></p>
									<p>固定电话：<input type="text" size="50" placeholder="固定电话" value="" id="ph" name="cphone"></p>
									<p>移动电话：<input type="text" size="50" placeholder="移动电话" value="" id="mo" name="cmobile"></p>
									<p>邮政编码：<input type="text" size="50" placeholder="邮政编码" value="" id="czc" name="czcode"></p>
									<p>联系地址：<input type="text" size="50" placeholder="联系地址" value="" id="ress"  name="address"></p>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default pull-left" data-dismiss="modal">关闭</button>
									<button type="button" class="btn btn-primary" onclick="xg()">保存修改</button>
								</div>
							</div>
							<!-- /.modal-content -->
						</div>
						<!-- /.modal-dialog -->
					</div>
					<!-- /.modal -->
				</div>
				<!-- /.box-body -->
				
				<!-- .box-footer-->
				<div class="box-footer">
					<div class="pull-left">
						<div class="form-group form-inline">
							总共${list2.page} 页，共${list2.count} 条数据。 每页
							<select class="form-control" name="rows">
								<option>${list2.rows}</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select> 条
						</div>
					</div>
					
					<div class="box-tools pull-right">
						<ul class="pagination">
							<li>
								<a href="list?page=1&rows=${list2.rows}" aria-label="Previous">首页</a>
							</li>
							<c:if test="${list2.dqpage==1}">
								<li><a href="#">上一页</a></li>
							</c:if>
							<c:if test="${list2.dqpage!=1}">
								<li><a href="list?page=${list2.dqpage-1}&rows=${list2.rows}">上一页</a></li>
							</c:if>
							<c:forEach begin="1" end="${list2.page}" step="1" var="i">
								<c:if test="${i==list2.dqpage}">
									<li ><a style="background: #00a7d0;color: white;" href="list?page=${i}&rows=${list2.rows}">${i}</a></li>
								</c:if>
								<c:if test="${i!=list2.dqpage}">
								<li><a href="list?page=${i}&rows=${list2.rows}">${i}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${list2.page==list2.dqpage}">
							<li><a href="#">下一页</a></li>
							</c:if>
							<c:if test="${list2.page>list2.dqpage}">
								<li><a href="list?page=${list2.dqpage+1}&rows=${list2.rows}">下一页</a></li>
							</c:if>
							<li>
								<a href="list?page=${list2.page}&rows=${list2.rows}" aria-label="Next">尾页</a>
							</li>
						</ul>
					</div>
				
				</div>
				<!-- /.box-footer-->
			
			
			
			</div>
		
		</section>
		<!-- 正文区域 /-->
	
	</div>
	<!-- @@close -->
	<!-- 内容区域 /-->
	
	<!-- 底部导航 -->
	<footer class="main-footer">
	
	</footer>
	<!-- 底部导航 /-->

</div>


<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
	$.widget.bridge('uibutton', $.ui.button);
</script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>
	$(document).ready(function() {
		// 选择框
		$(".select2").select2();
		
		// WYSIHTML5编辑器
		$(".textarea").wysihtml5({
			locale: 'zh-CN'
		});
	});
	
	
	// 设置激活菜单
	function setSidebarActive(tagUri) {
		var liObj = $("#" + tagUri);
		if (liObj.length > 0) {
			liObj.parent().parent().addClass("active");
			liObj.addClass("active");
		}
	}
	
	
	$(document).ready(function() {
		
		// 激活导航位置
		setSidebarActive("admin-datalist");
		
		// 列表按钮
		$("#dataList td input[type='checkbox']").iCheck({
			checkboxClass: 'icheckbox_square-blue',
			increaseArea: '20%'
		});
		// 全选操作
		$("#selall").click(function() {
			var clicks = $(this).is(':checked');
			if (!clicks) {
				$("#dataList td input[type='checkbox']").iCheck("uncheck");
			} else {
				$("#dataList td input[type='checkbox']").iCheck("check");
			}
			$(this).data("clicks", !clicks);
		});
	});
	

</script>
</body>

</html>
