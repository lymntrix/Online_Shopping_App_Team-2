/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.28.v20200408
 * Generated at: 2021-06-28 07:41:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.example.helper.FactoryProvider;
import com.example.Dao.ProductDao;
import com.example.entities.Product;
import java.util.List;
import com.example.Dao.CategoryDao;
import com.example.entities.Categories;
import com.example.helper.Helper;
import com.example.entities.Customer;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/components/common_css_js.jsp", Long.valueOf(1624597705766L));
    _jspx_dependants.put("/components/header.jsp", Long.valueOf(1624691359631L));
    _jspx_dependants.put("/components/footer.jsp", Long.valueOf(1624865337869L));
    _jspx_dependants.put("/components/common_models.jsp", Long.valueOf(1624625032823L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.example.entities.Product");
    _jspx_imports_classes.add("com.example.entities.Categories");
    _jspx_imports_classes.add("com.example.helper.Helper");
    _jspx_imports_classes.add("com.example.Dao.ProductDao");
    _jspx_imports_classes.add("com.example.entities.Customer");
    _jspx_imports_classes.add("com.example.helper.FactoryProvider");
    _jspx_imports_classes.add("com.example.Dao.CategoryDao");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home-Page</title>\n");
      out.write("        ");
      out.write("<!--CSs-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <!--js-->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("                crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("         integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("         integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("         <script src=\"js/script.js\"></script");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     ");
      out.write('\r');
      out.write('\n');


Customer cust = (Customer)session.getAttribute("current-customer");


      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light custom-bg sticky-top\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  <a class=\"navbar-brand text-font-sans-serif-500-20px\" href=\"index.jsp\"><img src=\"images/logoo.png\" style=\"width:100%;\"></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("          <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("        </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"#\" data-toggle=\"modal\" data-target=\"#cart\"  ><i class=\"fa fa-cart-plus\"style=\"font-size: 35px; color:rgb(26, 8, 190);\"></i><span class=\"ml-0 cart-items\">()</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("     ");


          if(cust == null)
          {

     
      out.write("\r\n");
      out.write("         <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                  <li class=\"nav-item active\">\r\n");
      out.write("                   <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"login.jsp\">Login</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("             <li class=\"nav-item active\">\r\n");
      out.write("                     <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"register.jsp\">Register</a>\r\n");
      out.write("             </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("    ");


    }else{

     
      out.write("\r\n");
      out.write("     <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("              <li class=\"nav-item active\">\r\n");
      out.write("               <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"");
      out.print(cust.getCustType().equals("admin")?"admin.jsp":"index.jsp");
      out.write('"');
      out.write('>');
      out.print( cust.getCustEmail());
      out.write("</a>\r\n");
      out.write("              </li>\r\n");
      out.write("             <li class=\"nav-item active\">\r\n");
      out.write("                     <a class=\"nav-link text-font-sans-serif-500-20px\" href=\"LogoutServlet\">Logout</a>\r\n");
      out.write("             </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("   ");
 }

    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("     <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row mt-3 mx-3 mb-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                String cat = request.getParameter("category");


                ProductDao productDao = new ProductDao(FactoryProvider.getFactory());
                List<Product> list=null;

                if (cat == null || cat.trim().equals("all"))
                {
                    list = productDao.getAllProducts();

                }
                else
                {

                    int cid =Integer.parseInt(cat.trim());
                    list=productDao.getAllProductsById(cid);

                }
                CategoryDao categoryDao = new CategoryDao(FactoryProvider.getFactory());
                List<Categories> clist = categoryDao.getCategories();
            
      out.write("\n");
      out.write("\n");
      out.write("             <div class=\"col-md-2\">\n");
      out.write("\n");
      out.write("                <div class=\"list-group mt-4\">\n");
      out.write("                    <a href=\"index.jsp?category=all\" class=\"list-group-item text-font-sans-serif-500-20px text-dark list-group-item-action active\">\n");
      out.write("                     Categories\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    for (Categories c:clist)
                    {
                
      out.write("\n");
      out.write("                    <a href=\"index.jsp?category=");
      out.print(c.getCategoryId());
      out.write("\" class=\"list-group-item list-group-item-action\">");
      out.print( c.getCategoryName() );
      out.write("</a>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                <div class=\"row mt-4\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card-columns\">\n");
      out.write("                            <!--traversing products -->\n");
      out.write("                            \n");
      out.write("                            ");

                                for (Product p:list)
                                {

                            
      out.write("\n");
      out.write("                            <!--Product CArd-->\n");
      out.write("                            <div class=\"card product-card\">\n");
      out.write("                                <div class=\"container text-center\">\n");
      out.write("                                    <img src=\"images/products/");
      out.print(p.getProductPhoto());
      out.write("\" style=\"max-height: 200px; max-width: 100%;width: auto;\" class=\"card-img-top m-2\" alt=\"...\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                    <h5 class=\"card-title\">");
      out.print(p.getProductName());
      out.write("</h5>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(Helper.get10Words(p.getProductDesc()));
      out.write("</p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer text-center\">\n");
      out.write("                                    <button class=\"btn custom-bg\" onclick=\"add_to_cart(");
      out.print( p.getProductId());
      out.write(',');
      out.write('\'');
      out.print(p.getProductName());
      out.write('\'');
      out.write(',');
      out.print(p.getPriceAfterDiscount());
      out.write(")\">Add to Cart</button>\n");
      out.write("                                    <button class=\"btn btn-outline-success text-dark fa fa-inr\"> ");
      out.print(p.getPriceAfterDiscount() );
      out.write("/- <span class=\"text-muted discount-label fa fa-inr\"> ");
      out.print(p.getProductPrice() );
      out.write(' ');
      out.write(',');
      out.write(' ');
      out.print(p.getProductDiscount() );
      out.write(" off</span></button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                    
                                }
                                if (list.size()==0)
                                {
                                    out.println("<h3>no items in this category</h3>");
                                }
                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("     ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"cart\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header custom-bg\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Your Cart</h5>\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"cart-body\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn custom-bg\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-success checkout-btn\" onclick=\"goToCheckout()\">Checkout</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"toast\">This is our custom Toast text</div>\r\n");
      out.write("\n");
      out.write("     ");
      out.write("\r\n");
      out.write("<footer class=\"footer-container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid py-3 px-4\">\r\n");
      out.write("\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-6 mb-1\">\r\n");
      out.write("\r\n");
      out.write("                <h6 class=\"m-0 text-uppercase text-font-sans-serif-500-20px\">Xeom Fashion</h6>\r\n");
      out.write("                <div class=\"footer-content-body\">\r\n");
      out.write("                    <p class=\"m-0 text-muted text-justify branch-p\">\r\n");
      out.write("                        Buy what you do not have yet or what you really want, which can be mixed with what you already own.\r\n");
      out.write("                         Buy only because something excites you, not just for the simple act of shopping.\r\n");
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 mb-1\">\r\n");
      out.write("                <h6 class=\"m-0 text-uppercase text-font-sans-serif-500-20px\">Follow us</h6>\r\n");
      out.write("                <div class=\"footer-content-body\">\r\n");
      out.write("                    <div>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\" https://www.facebook.com/xeomfashion/\"><i class=\"fa fa-facebook\" style=\"padding-right: 20px;\r\n");
      out.write("                                                         font-size: 24px;\r\n");
      out.write("                                                         color: rgb(26, 8, 190);\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"https://wa.me/message/M2MTMXEYEBODE1\"><i class=\"fa fa-whatsapp\" style=\"padding-right: 20px;\r\n");
      out.write("                                                        font-size: 24px;\r\n");
      out.write("                                                        color:forestgreen;\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"https://www.google.com\"><i class=\"fa fa-google\" style=\"padding-right: 20px;\r\n");
      out.write("                                                       font-size: 24px;\r\n");
      out.write("                                                       color: rgb(45, 128, 223);\"></i></a>\r\n");
      out.write("\r\n");
      out.write("                        <a href=\" https://instagram.com/xeomfashion?utm_medium=copy_link\"><i class=\"fa fa-instagram\"style=\"padding-right: 20px;\r\n");
      out.write("                                                         font-size: 24px;\r\n");
      out.write("                                                         color: red;\" ></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 mb-1 \">\r\n");
      out.write("                <h6 class=\"m-0 text-uppercase text-font-sans-serif-500-20px\">Quick Links</h6>\r\n");
      out.write("                <div class=\"footer-content-body\">\r\n");
      out.write("                    <div><a href=\"About.jsp\" class=\"m-0 text-dark\">About Us</a></div>\r\n");
      out.write("                    <div><a href=\"Contact-us.jsp\" class=\"m-0 text-dark\">Contact Us</a></div>\r\n");
      out.write("                    <div><a class=\"m-0\">Privacy-Policy</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"py-2 copyright_container \">\r\n");
      out.write("        <p class=\"m-0 text-center\">Copyright &copy;2021 <a class=\"text-muted\">All Rights Reserved</a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
