package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("          <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("          <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("          <!-- Topbar Search -->\n");
      out.write("          <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("              <div class=\"input-group-append\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                  <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("          <!-- Topbar Navbar -->\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - Messages -->\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\n");
      out.write("                <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                    <div class=\"input-group-append\">\n");
      out.write("                      <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                        <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                      </button>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Alerts -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                <!-- Counter - Alerts -->\n");
      out.write("                <span class=\"badge badge-danger badge-counter\">1+</span>\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - Alerts -->\n");
      out.write("              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                <h6 class=\"dropdown-header\">\n");
      out.write("                  Alerts Center\n");
      out.write("                </h6>\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                  <div class=\"mr-3\">\n");
      out.write("                    <div class=\"icon-circle bg-primary\">\n");
      out.write("                      <i class=\"fas fa-file-alt text-white\"></i>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div>\n");
      out.write("                    <div class=\"small text-gray-500\">December 12, 2019</div>\n");
      out.write("                    <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Messages -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                <!-- Counter - Messages -->\n");
      out.write("                <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - Messages -->\n");
      out.write("              <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                <h6 class=\"dropdown-header\">\n");
      out.write("                  Message Center\n");
      out.write("                </h6>\n");
      out.write("                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                  <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                    <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\n");
      out.write("                    <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"font-weight-bold\">\n");
      out.write("                    <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\n");
      out.write("                    <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\n");
      out.write("                  </div>\n");
      out.write("                </a>\n");
      out.write("                 \n");
      out.write("                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - User Information -->\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </span>\n");
      out.write("                <img class=\"img-profile rounded-circle\" src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("              </a>\n");
      out.write("              <!-- Dropdown - User Information -->\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                  <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Profile\n");
      out.write("                </a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                  <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Settings\n");
      out.write("                </a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                  <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Activity Log\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-divider\"></div>\n");
      out.write("                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                  <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                  Logout\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("        </nav>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
