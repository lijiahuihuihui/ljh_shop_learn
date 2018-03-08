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
	<div class="am-cf admin-main">
		<div class=" admin-content">
			<div class="admin-biaogelist">
				<div class="listbiaoti am-cf">
					<ul class="am-icon-flag on">添加管理员
					</ul>

				</div>
				<div class="fbneirong">
					<form class="am-form" action="${pageContext.request.contextPath}/manage/manage/save" method="post">
						<%
							String errorMsg = (String)request.getAttribute("errorMsg") ; 
							if(errorMsg != null && !"".equals(errorMsg)){
								%>
									<div class="am-form-group am-cf">
										<div class="zuo"></div>
										<div class="you">
											<span style="color:red"> <%=errorMsg %> </span>
										</div>
									</div>
								<% 
							}
						%>
						
						<div class="am-form-group am-cf">
							<div class="zuo">管理员姓名：</div>
							<div class="you">
								<input type="text" name="manager_name" value="${managerName }" class="am-input-sm" id="doc-ipt-email-1"
									placeholder="请输入标题">
							</div>
						</div>
						<div class="am-form-group am-cf">
							<div class="zuo">管理员性别：</div>
							<div class="you">
								<input type="text" name="manager_sex" value="${managerSex }" class="am-input-sm" id="doc-ipt-pwd-1"
									placeholder="请输入关键词">
							</div>
						</div>
						<div class="am-form-group am-cf">
							<div class="zuo">管理员年龄：</div>
							<div class="you">
								<input type="text" name="manager_age" value="${managerAgeInt }" class="am-input-sm" id="doc-ipt-email-1"
									placeholder="请输入标题">
							</div>
						</div>
						<div class="am-form-group am-cf">
							<div class="zuo">管理员密码：</div>
							<div class="you">
								<input type="text" name="manager_password" value="${managerPassword }" class="am-input-sm" id="doc-ipt-pwd-1"
									placeholder="请输入关键词">
							</div>
						</div>
						
						<div class="am-form-group am-cf">
							<div class="zuo">管理员电话：</div>
							<div class="you">
								<input type="text" name="manager_number" value="${managerNumberInt }" class="am-input-sm" id="doc-ipt-pwd-1"
									placeholder="请输入关键词">
							</div>
						</div>
						
						<div class="am-form-group am-cf">
							<div class="you" style="margin-left: 11%;">
								<button type="submit" class="am-btn am-btn-success am-radius">保存</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->
	<!--[if (gte IE 9)|!(IE)]><!-->
	<script
		src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
	<!--<![endif]-->
</body>
</html>