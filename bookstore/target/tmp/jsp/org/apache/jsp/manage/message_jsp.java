/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.7.v20160115
 * Generated at: 2018-03-05 16:04:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Amaze UI Admin index Examples</title>\r\n");
      out.write("<meta name=\"description\" content=\"这是一个 index 页面\">\r\n");
      out.write("<meta name=\"keywords\" content=\"index\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/i/favicon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/i/app-icon72x72@2x.png\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-title\" content=\"Amaze UI\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/amazeui.min.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
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
      out.write("<!--[if lte IE 9]><p class=\"browsehappy\">升级你的浏览器吧！ <a href=\"http://se.360.cn/\" target=\"_blank\">升级浏览器</a>以获得更好的体验！</p><![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"am-topbar admin-header\">\r\n");
      out.write("  <div class=\"am-topbar-brand\"><img src=\"assets/i/logo.png\"></div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"am-collapse am-topbar-collapse\" id=\"topbar-collapse\">\r\n");
      out.write("    <ul class=\"am-nav am-nav-pills am-topbar-nav admin-header-list\">\r\n");
      out.write("\r\n");
      out.write("   <li class=\"am-dropdown tognzhi\" data-am-dropdown>\r\n");
      out.write("  <button class=\"am-btn am-btn-primary am-dropdown-toggle am-btn-xs am-radius am-icon-bell-o\" data-am-dropdown-toggle> 消息管理<span class=\"am-badge am-badge-danger am-round\">6</span></button>\r\n");
      out.write("  <ul class=\"am-dropdown-content\">\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("  \t\r\n");
      out.write("    <li class=\"am-dropdown-header\">所有消息都在这里</li>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <li><a href=\"#\">未激活会员 <span class=\"am-badge am-badge-danger am-round\">556</span></a></li>\r\n");
      out.write("    <li><a href=\"#\">未激活代理 <span class=\"am-badge am-badge-danger am-round\">69</span></a></a></li>\r\n");
      out.write("    <li><a href=\"#\">未处理汇款</a></li>\r\n");
      out.write("    <li><a href=\"#\">未发放提现</a></li>\r\n");
      out.write("    <li><a href=\"#\">未发货订单</a></li>\r\n");
      out.write("    <li><a href=\"#\">低库存产品</a></li>\r\n");
      out.write("    <li><a href=\"#\">信息反馈</a></li>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </ul>\r\n");
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write(" <li class=\"kuanjie\">\r\n");
      out.write(" \t\r\n");
      out.write(" \t<a href=\"#\">会员管理</a>          \r\n");
      out.write(" \t<a href=\"#\">奖金管理</a> \r\n");
      out.write(" \t<a href=\"#\">订单管理</a>   \r\n");
      out.write(" \t<a href=\"#\">产品管理</a> \r\n");
      out.write(" \t<a href=\"#\">个人中心</a> \r\n");
      out.write(" \t <a href=\"#\">系统设置</a>\r\n");
      out.write(" </li>\r\n");
      out.write("\r\n");
      out.write(" <li class=\"soso\">\r\n");
      out.write(" \t\r\n");
      out.write("<p>   \r\n");
      out.write("\t\r\n");
      out.write("\t<select data-am-selected=\"{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}\">\r\n");
      out.write("          <option value=\"b\">全部</option>\r\n");
      out.write("          <option value=\"o\">产品</option>\r\n");
      out.write("          <option value=\"o\">会员</option>\r\n");
      out.write("          \r\n");
      out.write("        </select>\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<p class=\"ycfg\"><input type=\"text\" class=\"am-form-field am-input-sm\" placeholder=\"圆角表单域\" /></p>\r\n");
      out.write("<p><button class=\"am-btn am-btn-xs am-btn-default am-xiao\"><i class=\"am-icon-search\"></i></button></p>\r\n");
      out.write(" </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <li class=\"am-hide-sm-only\" style=\"float: right;\"><a href=\"javascript:;\" id=\"admin-fullscreen\"><span class=\"am-icon-arrows-alt\"></span> <span class=\"admin-fullText\">开启全屏</span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"am-cf admin-main\"> \r\n");
      out.write("\r\n");
      out.write("<div class=\"nav-navicon admin-main admin-sidebar\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"sideMenu am-icon-dashboard\" style=\"color:#aeb2b7; margin: 10px 0 0 0;\"> 欢迎系统管理员：清风抚雪</div>\r\n");
      out.write("    <div class=\"sideMenu\">\r\n");
      out.write("      <h3 class=\"am-icon-flag\"><em></em> <a href=\"#\">商品管理</a></h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"\">商品列表</a></li>\r\n");
      out.write("        <li class=\"func\" dataType='html' dataLink='msn.htm' iconImg='images/msn.gif'>添加新商品</li>\r\n");
      out.write("        <li>商品分类</li>\r\n");
      out.write("        <li>用户评论</li>\r\n");
      out.write("        <li>商品回收站</li>\r\n");
      out.write("        <li>库存管理 </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-cart-plus\"><em></em> <a href=\"#\"> 订单管理</a></h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>订单列表</li>\r\n");
      out.write("        <li>合并订单</li>\r\n");
      out.write("        <li>订单打印</li>\r\n");
      out.write("        <li>添加订单</li>\r\n");
      out.write("        <li>发货单列表</li>\r\n");
      out.write("        <li>换货单列表</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-users\"><em></em> <a href=\"#\">会员管理</a></h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>会员列表 </li>\r\n");
      out.write("        <li>未激活会员</li>\r\n");
      out.write("        <li>团队系谱图</li>\r\n");
      out.write("        <li>会员推荐图</li>\r\n");
      out.write("        <li>推荐列表</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-volume-up on\"><em></em> <a href=\"#\">信息通知</a></h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>站内消息 /留言 </li>\r\n");
      out.write("        <li>短信</li>\r\n");
      out.write("        <li>邮件</li>\r\n");
      out.write("        <li>微信</li>\r\n");
      out.write("        <li>客服</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <h3 class=\"am-icon-gears\"><em></em> <a href=\"#\">系统设置</a></h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>数据备份</li>\r\n");
      out.write("        <li>邮件/短信管理</li>\r\n");
      out.write("        <li>上传/下载</li>\r\n");
      out.write("        <li>权限</li>\r\n");
      out.write("        <li>网站设置</li>\r\n");
      out.write("        <li>第三方支付</li>\r\n");
      out.write("        <li>提现 /转账 出入账汇率</li>\r\n");
      out.write("        <li>平台设置</li>\r\n");
      out.write("        <li>声音文件</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- sideMenu End --> \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(\".sideMenu\").slide({\r\n");
      out.write("\t\t\t\ttitCell:\"h3\", //鼠标触发对象\r\n");
      out.write("\t\t\t\ttargetCell:\"ul\", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏\r\n");
      out.write("\t\t\t\teffect:\"slideDown\", //targetCell下拉效果\r\n");
      out.write("\t\t\t\tdelayTime:300 , //效果时间\r\n");
      out.write("\t\t\t\ttriggerTime:150, //鼠标延迟触发时间（默认150）\r\n");
      out.write("\t\t\t\tdefaultPlay:true,//默认是否执行效果（默认true）\r\n");
      out.write("\t\t\t\treturnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t</script> \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"daohang\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\"> 首页 </li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">帮助中心<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">奖金管理<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t\t<li><button type=\"button\" class=\"am-btn am-btn-default am-radius am-btn-xs\">产品管理<a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close=\"\">×</a></button></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"admin-biaogelist\">\r\n");
      out.write("\t\r\n");
      out.write("    <div class=\"listbiaoti am-cf\">\r\n");
      out.write("      <ul class=\"am-icon-flag on\"> 订单列表</ul>\r\n");
      out.write("      \r\n");
      out.write("      <dl class=\"am-icon-home\" style=\"float: right;\">当前位置： 首页 > <a href=\"#\">商品列表</a></dl>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <div class=\"am-tabs am-margin\" data-am-tabs>\r\n");
      out.write("    <ul class=\"am-tabs-nav am-nav am-nav-tabs\">\r\n");
      out.write("      <li class=\"am-active\"><a href=\"#tab1\">站内消息 /留言</a></li>\r\n");
      out.write("      <li><a href=\"#tab2\">短信</a></li>\r\n");
      out.write("      <li><a href=\"#tab3\">邮件</a></li>\r\n");
      out.write("      <li><a href=\"#tab4\">微信</a></li>\r\n");
      out.write("      <li><a href=\"#tab5\">客服</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"am-tabs-bd\">\r\n");
      out.write("      <div class=\"am-tab-panel am-fade am-in am-active\" id=\"tab1\">\r\n");
      out.write("        <div class=\"am-g am-margin-top\">\r\n");
      out.write("          <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">所属类别</div>\r\n");
      out.write("          <div class=\"am-u-sm-8 am-u-md-10\">\r\n");
      out.write("            <select data-am-selected=\"{btnSize: 'sm'}\">\r\n");
      out.write("              <option value=\"option1\">选项一...</option>\r\n");
      out.write("              <option value=\"option2\">选项二.....</option>\r\n");
      out.write("              <option value=\"option3\">选项三........</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-g am-margin-top\">\r\n");
      out.write("          <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">显示状态</div>\r\n");
      out.write("          <div class=\"am-u-sm-8 am-u-md-10\">\r\n");
      out.write("            <div class=\"am-btn-group\" data-am-button>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"radio\" name=\"options\" id=\"option1\"> 正常\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"radio\" name=\"options\" id=\"option2\"> 待审核\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"radio\" name=\"options\" id=\"option3\"> 不显示\r\n");
      out.write("              </label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-g am-margin-top\">\r\n");
      out.write("          <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">推荐类型</div>\r\n");
      out.write("          <div class=\"am-u-sm-8 am-u-md-10\">\r\n");
      out.write("            <div class=\"am-btn-group\" data-am-button>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"checkbox\"> 允许评论\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"checkbox\"> 置顶\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"checkbox\"> 推荐\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"checkbox\"> 热门\r\n");
      out.write("              </label>\r\n");
      out.write("              <label class=\"am-btn am-btn-default am-btn-xs\">\r\n");
      out.write("                <input type=\"checkbox\"> 轮播图\r\n");
      out.write("              </label>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-g am-margin-top\">\r\n");
      out.write("          <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("            发布时间\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"am-u-sm-8 am-u-md-10\">\r\n");
      out.write("            <form action=\"\" class=\"am-form am-form-inline\">\r\n");
      out.write("              <div class=\"am-form-group am-form-icon\">\r\n");
      out.write("                <i class=\"am-icon-calendar\"></i>\r\n");
      out.write("                <input type=\"text\" class=\"am-form-field am-input-sm\" placeholder=\"时间\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"am-tab-panel am-fade\" id=\"tab2\">\r\n");
      out.write("        <form class=\"am-form\">\r\n");
      out.write("          <div class=\"am-g am-margin-top\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              文章标题\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-hide-sm-only am-u-md-6\">*必填，不可重复</div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              文章作者\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end col-end\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              信息来源\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-hide-sm-only am-u-md-6\">选填</div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              内容摘要\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-12 am-u-md-6\">不填写则自动截取内容前255字符</div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-12 am-u-md-2 am-text-right admin-form-text\">\r\n");
      out.write("              内容描述\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-12 am-u-md-10\">\r\n");
      out.write("              <textarea rows=\"10\" placeholder=\"请使用富文本编辑插件\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"am-tab-panel am-fade\" id=\"tab3\">\r\n");
      out.write("        <form class=\"am-form\">\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"xitong\">\r\n");
      out.write("    \r\n");
      out.write("<div class=\"am-alert am-alert-success\" data-am-alert>\r\n");
      out.write("\r\n");
      out.write("  <p>发件箱设置（站内所有邮件均由此邮箱发送，如会员密码找回邮件等）</p>\r\n");
      out.write("</div>\r\n");
      out.write("    \t\r\n");
      out.write("    \r\n");
      out.write("              <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">发件人：</div>\r\n");
      out.write("          <div class=\"you\" style=\"max-width: 300px;\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("                 <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">邮箱账号：</div>\r\n");
      out.write("          <div class=\"you\" style=\"max-width: 300px;\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                      <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">邮箱密码：</div>\r\n");
      out.write("          <div class=\"you\" style=\"max-width: 300px;\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                      <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">SMTP：</div>\r\n");
      out.write("          <div class=\"you\" style=\"max-width: 300px;\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">发送端口：</div>\r\n");
      out.write("          <div class=\"you\" style=\"max-width: 300px;\">\r\n");
      out.write("            <input type=\"email\" class=\"am-input-sm\" id=\"doc-ipt-email-1\" placeholder=\"请输入标题\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("          <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\">发送方式：</div>\r\n");
      out.write("          <div class=\"you\" style=\"margin-top: 4px;\">\r\n");
      out.write("          <label class=\"am-radio-inline\">\r\n");
      out.write("        <input type=\"radio\"  value=\"\" name=\"docInlineRadio\"> SSL服务方式\r\n");
      out.write("      </label>\r\n");
      out.write("      <label class=\"am-radio-inline\">\r\n");
      out.write("        <input type=\"radio\" name=\"docInlineRadio\"> TLS服务方式\r\n");
      out.write("      </label>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <div class=\"am-form-group\">\r\n");
      out.write("          <div class=\"zuo\"></div>\r\n");
      out.write("          <div class=\"you\" style=\"margin-top: 4px;\">\r\n");
      out.write("         测试发送状态\r\n");
      out.write("         <br /><br />\r\n");
      out.write("          <button type=\"button\" class=\"am-btn am-btn-success  am-radius am-btn-sm\">保存选择</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"am-tab-panel am-fade\" id=\"tab4\">\r\n");
      out.write("        <form class=\"am-form\">\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 标题\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 关键字\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 描述\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <textarea rows=\"4\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <div class=\"am-tab-panel am-fade\" id=\"tab5\">\r\n");
      out.write("        <form class=\"am-form\">\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 标题\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 关键字\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <input type=\"text\" class=\"am-input-sm\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"am-g am-margin-top-sm\">\r\n");
      out.write("            <div class=\"am-u-sm-4 am-u-md-2 am-text-right\">\r\n");
      out.write("              SEO 描述\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-u-sm-8 am-u-md-4 am-u-end\">\r\n");
      out.write("              <textarea rows=\"4\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"am-margin\">\r\n");
      out.write("    <button type=\"button\" class=\"am-btn am-btn-success am-radius \">提交保存</button>\r\n");
      out.write("    <button type=\"button\" class=\"am-btn am-btn-primary am-radius \">放弃保存</button>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"foods\">\r\n");
      out.write("  <ul>\r\n");
      out.write("    版权所有@2015.\r\n");
      out.write("  </ul>\r\n");
      out.write("  <dl>\r\n");
      out.write("    <a href=\"\" title=\"返回头部\" class=\"am-icon-btn am-icon-arrow-up\"></a>\r\n");
      out.write("  </dl>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://libs.baidu.com/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js\"></script>\r\n");
      out.write("<script src=\"assets/js/polyfill/rem.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/polyfill/respond.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/amazeui.legacy.js\"></script>\r\n");
      out.write("<![endif]--> \r\n");
      out.write("\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--> \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/amazeui.min.js\"></script>\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
