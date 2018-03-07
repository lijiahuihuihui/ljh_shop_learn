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
					<ul class="am-icon-flag on">栏目名称
					</ul>

					<dl class="am-icon-home" style="float: right;">
						当前位置： 首页 >
						<a href="#">商品列表</a>
					</dl>

					<dl>
						<button type="button"
							class="am-btn am-btn-danger am-round am-btn-xs am-icon-plus">
							添加产品</button>
					</dl>


				</div>

				<div class="am-btn-toolbars am-btn-toolbar am-kg am-cf">
					<ul>
						<li>
							<div class="am-btn-group am-btn-group-xs">
								<select
									data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}">
									<option value="b">产品分类</option>
									<option value="o">下架</option>
								</select>
							</div>
						</li>
						<li>
							<div class="am-btn-group am-btn-group-xs">
								<select
									data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}">
									<option value="b">产品分类</option>
									<option value="o">下架</option>
								</select>
							</div>
						</li>
						<li style="margin-right: 0;"><span
							class="tubiao am-icon-calendar"></span> <input type="text"
							class="am-form-field am-input-sm am-input-zm  am-icon-calendar"
							placeholder="开始日期" data-am-datepicker="{theme: 'success',}"
							readonly /></li>
						<li style="margin-left: -4px;"><span
							class="tubiao am-icon-calendar"></span> <input type="text"
							class="am-form-field am-input-sm am-input-zm  am-icon-calendar"
							placeholder="开始日期" data-am-datepicker="{theme: 'success',}"
							readonly /></li>

						<li style="margin-left: -10px;">
							<div class="am-btn-group am-btn-group-xs">
								<select
									data-am-selected="{btnWidth: 90, btnSize: 'sm', btnStyle: 'default'}">
									<option value="b">产品分类</option>
									<option value="o">下架</option>
								</select>
							</div>
						</li>
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
								<th class="table-check"><input type="checkbox" /></th>
								<th class="table-id">排序</th>
								<th class="table-id">ID</th>
								<th class="table-title">标题</th>
								<th class="table-type">类别</th>
								<th class="table-author am-hide-sm-only">上架/下架 <i
									class="am-icon-check am-text-warning"></i> <i
									class="am-icon-close am-text-primary"></i></th>
								<th class="table-date am-hide-sm-only">修改日期</th>
								<th width="163px" class="table-set">操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="checkbox" /></td>
								<td><input type="text"
									class="am-form-field am-radius am-input-sm" /></td>
								<td>14</td>
								<td><a href="#">Business management</a></td>
								<td>default</td>
								<td class="am-hide-sm-only"><i
									class="am-icon-check am-text-warning"></i></td>
								<td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
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
									</div></td>
							</tr>
							<tr>
								<td><input type="checkbox" /></td>
								<td><input type="text"
									class="am-form-field am-radius am-input-sm" /></td>
								<td>15</td>
								<td><a href="#">Business management</a></td>
								<td>default</td>
								<td class="am-hide-sm-only"><i
									class="am-icon-close am-text-primary"></i></td>
								<td class="am-hide-sm-only">2014年9月4日 7:28:47</td>
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
									</div></td>
							</tr>
						</tbody>
					</table>

					<div class="am-btn-group am-btn-group-xs">
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-plus"></span> 删除
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-save"></span> 上架
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-save"></span> 下架
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-save"></span> 移动
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-plus"></span> 新增
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-save"></span> 保存
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-archive"></span> 移动
						</button>
						<button type="button" class="am-btn am-btn-default">
							<span class="am-icon-trash-o"></span> 删除
						</button>
					</div>

					<ul class="am-pagination am-fr">
						<li class="am-disabled"><a href="#">«</a></li>
						<li class="am-active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">»</a></li>
					</ul>




					<hr />
					<p>注：.....</p>
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
