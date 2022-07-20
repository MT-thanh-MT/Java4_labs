/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-07-11 12:44:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<title>Đăng ký!</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<main class=\"container\">\r\n");
      out.write("		<header class=\"row\">\r\n");
      out.write("			<div class=\"alert alert-success col\">\r\n");
      out.write("				<h1>Đăng ký</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</header>\r\n");
      out.write("		<section class=\"row\">\r\n");
      out.write("			<div class=\"col-7\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col\">\r\n");
      out.write("						<form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"username\">Tên Đăng Nhập:</label> <input type=\"text\"\r\n");
      out.write("									id=\"username\" name=\"username\" class=\"form-control\" />\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"password\">Mật Khẩu:</label> \r\n");
      out.write("								<input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" />\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"gender\">Giới Tính:</label>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"radio\" class=\"form-check-input\" id=\"genderM\"\r\n");
      out.write("										name=\"gender\" value=\"Nam\" checked /> \r\n");
      out.write("									<label for=\"genderM\" >Nam</label>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"radio\" class=\"form-check-input\" id=\"genderF\"\r\n");
      out.write("										name=\"gender\" value=\"Nữ\"/>\r\n");
      out.write("									<label for=\"genderF\">Nữ</label>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<div class=\"form-check\">\r\n");
      out.write("									<input type=\"checkbox\" name=\"married\" class=\"form-check-input\"\r\n");
      out.write("										id=\"married\" />\r\n");
      out.write("									<label for=\"married\">Đã có gia đình?</label>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"nationality\">Quốc Tịch:</label>\r\n");
      out.write("								<select\r\n");
      out.write("									name=\"nationality\" id=\"nationality\" class=\"form-control\">\r\n");
      out.write("									<option value=\"vi\">Việt Nam</option>\r\n");
      out.write("									<option value=\"us\">Mỹ</option>\r\n");
      out.write("									<option value=\"jp\">Nhật Bản</option>\r\n");
      out.write("								</select>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"favorites\">Sở Thích: </label>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"form-check form-check-input\"\r\n");
      out.write("										name=\"favorites\" id=\"Read\" value=\"Read\" /> <label\r\n");
      out.write("										for=\"Read\">Đọc Sách</label>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"form-check form-check-input\"\r\n");
      out.write("										name=\"favorites\" id=\"Music\" value=\"Music\" /> <label\r\n");
      out.write("										for=\"Music\">Âm Nhạc</label>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"form-check form-check-input\"\r\n");
      out.write("										name=\"favorites\" id=\"Tourist\" value=\"Tourist\" />\r\n");
      out.write("										<label for=\"Tourist\">Du Lịch</label>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-check form-check-inline\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"form-check form-check-input\"\r\n");
      out.write("										name=\"favorites\" id=\"others\" value=\"others\" />\r\n");
      out.write("										<label class=\"form-label\" for=\"others\">Khác</label>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"note\">Ghi Chú:</label>\r\n");
      out.write("								<textarea name=\"note\" id=\"note\" rows=\"3\" class=\"form-control\"></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							<hr />\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-primary\">Đăng Ký</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-5\">\r\n");
      out.write("				<h3>Thông tin đã được đăng ký</h3>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>Tên đăng nhập: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Mật khẩu: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ password }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Giới Tính: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ gender }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Tình trạng hôn nhân: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ married ? 'Đã lập gia đình' : 'Chưa lập gia đình' }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Quốc tịch: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ nationality }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Sở thích: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ favorites }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("					<li>Ghi chú: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ note }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
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