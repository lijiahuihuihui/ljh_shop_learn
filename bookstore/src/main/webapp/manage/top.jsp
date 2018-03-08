<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin index Examples</title>
<meta name="description" content="这是一个 index 页面">
<meta name="keywords" content="index">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed"
	href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/admin.css">
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/app.js"></script>
</head>
<body>
	<!--[if lte IE 9]><p class="browsehappy">升级你的浏览器吧！ <a href="http://se.360.cn/" target="_blank">升级浏览器</a>以获得更好的体验！</p><![endif]-->
</head>

<body>

	<header class="am-topbar admin-header">
	<div class="am-topbar-brand"></div>

	<div class="am-collapse am-topbar-collapse" id="topbar-collapse">
		<ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

			<li class="kuanjie">
			    
			    <a href="${pageContext.request.contextPath}/manage/left_shop.jsp" target="iframeLeft">商品管理</a>
			    <a href="${pageContext.request.contextPath}/manage/left_user.jsp" target="iframeLeft">会员管理</a>
			    <a href="${pageContext.request.contextPath}/manage/left_order.jsp" target="iframeLeft">订单管理</a>
			    <a href="${pageContext.request.contextPath}/manage/left_store.jsp" target="iframeLeft">店铺管理</a>
			    <a href="${pageContext.request.contextPath}/manage/left_system.jsp" target="iframeLeft">系统管理</a>
			    <a href="${pageContext.request.contextPath}/manage/left_interface.jsp" target="iframeLeft">界面管理</a>
				<a onclick="top.location.href='/login'">退出</a>
			</li>

		</ul>
	</div>
</body>
</html>