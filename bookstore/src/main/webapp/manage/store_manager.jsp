<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ljh.bookstore.domain.StoreInformationDomain" %>

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
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin.css">
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
					<ul class="am-icon-flag on">店铺管理
					</ul>
 
					<dl style="float:right">
						<a type="button"
							href="${pageContext.request.contextPath}/manage/store_add.jsp"
							class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus">
							添加店铺</a>
					</dl>

				</div>

				<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
					<ul>
						<li><input type="text"
							class="am-form-field am-input-sm am-input-xm" placeholder="关键词搜索" /></li>
						<li><button type="button"
								class="am-btn am-radius am-btn-xs am-btn-success"
								style="margin-top: -1px;">搜索</button></li>
					</ul>
				</div>


				<form class="am-form am-g">
					<table width="100%"
						class="am-table am-table-bordered am-table-radius am-table-striped">
						<thead>
							<tr class="am-success">
								<th class="table-id">店铺名称</th>
								<th class="table-id">店铺地址</th>
								<th class="table-id">店铺介绍</th>
								<th class="table-id">店铺电话</th>
								
								<th width="163px" class="table-id">操作</th>
							</tr>
						</thead>
						<tbody>
						
							<%
								Object storeListObj = request.getAttribute("storeList") ; 
								if(storeListObj != null){
									List<StoreInformationDomain> storeList = (List<StoreInformationDomain>)storeListObj ; 
									for(StoreInformationDomain store : storeList){
									 	%>
									 		<tr>
												<td><%=store.getStoreName() %></td>
												<td><%=store.getStoreAddress() %></td>
												<td><%=store.getStoreIntroduce() %></td>
												<td><%=store.getStoreTelephone() %></td>
												<td><div class="am-btn-toolbar">
														<div class="am-btn-group am-btn-group-xs">
															<button
																class="am-btn am-btn-default am-btn-xs am-text-success am-round">
																<span class="am-icon-search"></span>
															</button>
															<button
																class="am-btn am-btn-default am-btn-xs am-text-secondary am-round">
																<span class="am-icon-pencil-square-o"></span>
															</button>
															<button
																class="am-btn am-btn-default am-btn-xs am-text-warning  am-round">
																<span class="am-icon-copy"></span>
															</button>
															<button
																class="am-btn am-btn-default am-btn-xs am-text-danger am-round">
																<span class="am-icon-trash-o"></span>
															</button>
														</div>
													</div>
												</td>
											</tr>
									 	<%
									}
								}
							%>
						
							
							 
						</tbody>
					</table>
 
					<ul class="am-pagination am-fr">
					
					<%
						int currentPage = (int)request.getAttribute("currentPage") ; 
					%>
					
						<li <%=(1==currentPage)?"class=\"am-active\"":"" %> ><a href="/manage/store/manager?pageNow=1">1</a></li>
						<li <%=(2==currentPage)?"class=\"am-active\"":"" %>><a href="/manage/store/manager?pageNow=2">2</a></li>
						<li <%=(3==currentPage)?"class=\"am-active\"":"" %>><a href="/manage/store/manager?pageNow=3">3</a></li>
						<li <%=(4==currentPage)?"class=\"am-active\"":"" %>><a href="/manage/store/manager?pageNow=4">4</a></li>
						<li <%=(5==currentPage)?"class=\"am-active\"":"" %>><a href="/manage/store/manager?pageNow=5">5</a></li>
					</ul>
 
				</form>
			</div>
		</div>
	</div>

	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script
		src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
	<!--<![endif]-->



</body>
</html>
