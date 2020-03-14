package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("  <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar - Brand -->\n");
      out.write("      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("        <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("          <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar-brand-text mx-3\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'s  DashBoard  </div>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("      <!-- Nav Item - Dashboard -->\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"dashboard.jsp\">\n");
      out.write("          <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("          <span>Dashboard</span></a>\n");
      out.write("      </li>\n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("      <!-- Heading -->\n");
      out.write("  \n");
      out.write("\n");
      out.write("      <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("          <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("          <span>Manage News </span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <h6 class=\"collapse-header\">Custom Actions...</h6>\n");
      out.write("            <a class=\"collapse-item\" href=\"viewAllNews.jsp\">View All News</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">View Pending News</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"cards.html\">View News Request</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write(" <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("     \n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseThree\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("          <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("          <span>Manage Reporter </span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <h6 class=\"collapse-header\">Custom Actions...</h6>\n");
      out.write("            <a class=\"collapse-item\" href=\"addReporter.jsp\">Add Reporters</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">View All Reporters</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">View Pending Reporters</a>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseFour\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("          <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("          <span>Reports</span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapseFour\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <h6 class=\"collapse-header\">Custom Actions...</h6>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">Category based News</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">Reporter based News</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"cards.html\">Filter News </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </li> \n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseFive\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("          <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("          <span>Other Action</span>\n");
      out.write("        </a>\n");
      out.write("        <div id=\"collapseFive\" class=\"collapse\" aria-labelledby=\"heading\" data-parent=\"#accordionSidebar\">\n");
      out.write("          <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("            <h6 class=\"collapse-header\">Custom Actions...</h6>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">View Subscribers</a>\n");
      out.write("            <a class=\"collapse-item\" href=\"buttons.html\">View Enquiry</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </li> \n");
      out.write(" <!-- Divider -->\n");
      out.write("      <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("     \n");
      out.write("      <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("      <div class=\"text-center d-none d-md-inline\">\n");
      out.write("        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </ul>");
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
