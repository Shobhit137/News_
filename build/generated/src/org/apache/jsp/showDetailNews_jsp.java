package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.News;
import com.daos.NewsDao;

public final class showDetailNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body id=\"page-top\">\n");
      out.write("        ");

            if (session.getAttribute("admin") == null) {
                response.sendRedirect("login.jsp");
                return;
            }
        
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("                <!-- Content Wrapper -->\n");
      out.write("                <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                    <!-- Main Content -->\n");
      out.write("                    <div id=\"content\">\n");
      out.write("\n");
      out.write("                        <!-- Topbar -->\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("\n");
      out.write("                        <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                        <!-- Begin Page Content -->\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                            <!-- Page Heading -->\n");
      out.write("                            \n");
      out.write("                        ");

                           
                            int newsid = Integer.parseInt(request.getParameter("newsid"));
                            NewsDao nd = new NewsDao();
                            News news = nd.getById(newsid);
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"card col col-md-12\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">");
      out.print(news.getTitle());
      out.write("</h4>\n");
      out.write("                                <p class=\"card-text\">");
      out.print(news.getDescription());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <img class=\"card-img-bottom\" src=\"../");
      out.print(news.getImage());
      out.write("\" alt=\"Card image\" style=\"width:100%\">\n");
      out.write("                            <h6>Current Status :</h6>\n");
      out.write("                            <form method=\"post\">\n");
      out.write("                                <p class=\"card-text\"><input type=\"radio\" value=\"Pending\" name=\"status\"  ");
if(news.getStatus().equalsIgnoreCase("Pending"))out.println(" checked");
      out.write(" > Pending</p>\n");
      out.write("                           <p class=\"card-text\"><input type=\"radio\" value=\"Approved\" name=\"status\"   ");
if(news.getStatus().equalsIgnoreCase("Approved"))out.println(" checked");
      out.write("> Approved</p>\n");
      out.write("                           <p class=\"card-text\"><input type=\"radio\" value=\"Rejected\" name=\"status\"  ");
if(news.getStatus().equalsIgnoreCase("Rejected"))out.println(" checked");
      out.write("> Rejected</p>\n");
      out.write("                           <input type=\"hidden\" name=\"newsid\" value=\"");
      out.print(newsid);
      out.write("\"/>\n");
      out.write("                           <p class=\"card-text\"><input type=\"text\" name=\"status_text\" required=\"required\" class=\"form-control\" value=\"");
      out.print(news.getStatus_text());
      out.write("\"> </p><br/>\n");
      out.write("                            <input type=\"submit\" value=\"Update Status\" name=\"submit\" class=\"btn  btn-primary form-control\">\n");
      out.write("                            </form>\n");
      out.write("                            </div>\n");
      out.write("                     </div>\n");
      out.write("\n");
      out.write("                    <!-- Content Row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- End of Footer -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"assets/js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");

    
 if (request.getParameter("submit")!=null) {
   if(nd.updateNewsStatus(Integer.parseInt(request.getParameter("newsid")), request.getParameter("status"), request.getParameter("status_text"))) 
    response.sendRedirect("viewAllNews.jsp");
   else 
       out.println("<script>alert('news is not updated !');</script>");
}
 
      out.write("   \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
