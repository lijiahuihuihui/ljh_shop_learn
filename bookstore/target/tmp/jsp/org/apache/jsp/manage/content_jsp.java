/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.7.v20160115
 * Generated at: 2018-03-08 13:40:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Amaze UI Admin index Examples</title>\r\n");
      out.write("<meta name=\"description\" content=\"这是一个 index 页面\">\r\n");
      out.write("<meta name=\"keywords\" content=\"index\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/i/favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/i/app-icon72x72@2x.png\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/amazeui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/admin.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/app.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--[if lte IE 9]><p class=\"browsehappy\">升级你的浏览器吧！ <a href=\"http://se.360.cn/\" target=\"_blank\">升级浏览器</a>以获得更好的体验！</p><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"admin\">\r\n");
      out.write("\t\t<div class=\"admin-index\">\r\n");
      out.write("\t\t\t<dl data-am-scrollspy=\"{animation: 'slide-right', delay: 100}\">\r\n");
      out.write("\t\t\t\t<dt class=\"qs\">\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-users\"></i>\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>455</dd>\r\n");
      out.write("\t\t\t\t<dd class=\"f12\">团队数量</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl data-am-scrollspy=\"{animation: 'slide-right', delay: 300}\">\r\n");
      out.write("\t\t\t\t<dt class=\"cs\">\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-area-chart\"></i>\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>455</dd>\r\n");
      out.write("\t\t\t\t<dd class=\"f12\">今日收入</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl data-am-scrollspy=\"{animation: 'slide-right', delay: 600}\">\r\n");
      out.write("\t\t\t\t<dt class=\"hs\">\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>455</dd>\r\n");
      out.write("\t\t\t\t<dd class=\"f12\">商品数量</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t\t<dl data-am-scrollspy=\"{animation: 'slide-right', delay: 900}\">\r\n");
      out.write("\t\t\t\t<dt class=\"ls\">\r\n");
      out.write("\t\t\t\t\t<i class=\"am-icon-cny\"></i>\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t<dd>455</dd>\r\n");
      out.write("\t\t\t\t<dd class=\"f12\">全部收入</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"admin-biaoge\">\r\n");
      out.write("\t\t\t<div class=\"xinxitj\">信息概况</div>\r\n");
      out.write("\t\t\t<table class=\"am-table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>团队统计</th>\r\n");
      out.write("\t\t\t\t\t\t<th>全部会员</th>\r\n");
      out.write("\t\t\t\t\t\t<th>全部未激活</th>\r\n");
      out.write("\t\t\t\t\t\t<th>今日新增</th>\r\n");
      out.write("\t\t\t\t\t\t<th>今日未激活</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"#\">4534</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td>+20</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+2</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+10</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"am-table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>团队统计</th>\r\n");
      out.write("\t\t\t\t\t\t<th>全部会员</th>\r\n");
      out.write("\t\t\t\t\t\t<th>全部未激活</th>\r\n");
      out.write("\t\t\t\t\t\t<th>今日新增</th>\r\n");
      out.write("\t\t\t\t\t\t<th>今日未激活</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+2</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+10</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table class=\"am-table\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>资金统计</th>\r\n");
      out.write("\t\t\t\t\t\t<th>账户总收入</th>\r\n");
      out.write("\t\t\t\t\t\t<th>账户总支出</th>\r\n");
      out.write("\t\t\t\t\t\t<th>账户余额</th>\r\n");
      out.write("\t\t\t\t\t\t<th>今日收入</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+20</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+2</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+10</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"shuju\">\r\n");
      out.write("\t\t\t<div class=\"shujuone\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>全盘收入： 1356666</dt>\r\n");
      out.write("\t\t\t\t\t<dt>全盘支出： 5646465.98</dt>\r\n");
      out.write("\t\t\t\t\t<dt>全盘利润： 546464</dt>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<h2>26.83%</h2>\r\n");
      out.write("\t\t\t\t\t<li>全盘拨出</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"shujutow\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>全盘收入： 1356666</dt>\r\n");
      out.write("\t\t\t\t\t<dt>全盘支出： 5646465.98</dt>\r\n");
      out.write("\t\t\t\t\t<dt>全盘利润： 546464</dt>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<h2>26.83%</h2>\r\n");
      out.write("\t\t\t\t\t<li>全盘拨出</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"slideTxtBox\">\r\n");
      out.write("\t\t\t\t<div class=\"hd\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>其他信息</li>\r\n");
      out.write("\t\t\t\t\t\t<li>工作进度表</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"bd\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" class=\"am-table\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"7%\" align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"83%\">工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"10%\" align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">1</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>工作进度名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\">10%</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"am-table\">\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>普卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><a href=\"#\">4534</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>+20</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>银卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>+2</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>金卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>+10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>钻卡</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>合计</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>+50</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>4534</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tjQuery(\".slideTxtBox\").slide();\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"foods\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t版权所有@2015 .\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/amazeui.min.js\"></script>\r\n");
      out.write("\t<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
