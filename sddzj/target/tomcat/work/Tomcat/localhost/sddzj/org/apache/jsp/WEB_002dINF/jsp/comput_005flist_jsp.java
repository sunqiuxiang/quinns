/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-25 02:20:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;

public final class comput_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"lib/PIE_IE678.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/static/h-ui/css/H-ui.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/static/h-ui.admin/css/H-ui.admin.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/lib/Hui-iconfont/1.0.7/iconfont.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/lib/icheck/icheck.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/static/h-ui.admin/css/style.css\" />\n");
      out.write("<!--[if IE 6]>\n");
      out.write("<script type=\"text/javascript\" src=\"http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js\" ></script>\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\n");
      out.write("<![endif]--><title></title>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/css/lib/jquery/1.9.1/jquery.min.js\"></script> \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\thtml,body{\n");
      out.write("\t\theight:100%;\n");
      out.write("\t}\n");
      out.write("\tdiv.my_container{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t}\n");
      out.write("\tdiv.menu{\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t\tbackground-color: #f5f5f5;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t}\n");
      out.write("\tdiv.content{\n");
      out.write("\t\twidth:90%;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t\tmargin-left:150px;\n");
      out.write("\t\toverflow-y:hidden; \n");
      out.write("\t}\n");
      out.write("\t.content_iframe{\n");
      out.write("\t\twidth:99%;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t}\n");
      out.write("\tul.menu_ul{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\tul.menu_ul li.menu_li{\n");
      out.write("\t\tmargin:0 auto;\n");
      out.write("\t\twidth:75%;\n");
      out.write("\t\tpadding:5px 0;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tborder-radius:3px;\n");
      out.write("\t\tbackground: #aaa;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tmargin-top:10px;\n");
      out.write("\t}\n");
      out.write("\tul.menu_ul li.active{\n");
      out.write("\t\tbackground: skyblue;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"my_container\">\n");
      out.write("\t\t<div class=\"menu\">\n");
      out.write("\t\t\t<ul class=\"menu_ul\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<iframe id=\"content_iframe\" class=\"content_iframe\" src=\"\"></iframe>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\tvar first_li = $($(\".menu_li\")[0]);\n");
      out.write("\t\tfirst_li.addClass(\"active\");\n");
      out.write("\t\tif(first_li.attr(\"id\") == \"menu_li_hxg\"){\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/data/compute/compute_hxg\");\n");
      out.write("\t\t}else if(first_li.attr(\"id\") == \"menu_li_xb\"){\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/page/comput_xb\");\n");
      out.write("\t\t}else if(first_li.attr(\"id\") == \"menu_li_dc\"){\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/page/comput_dc\");\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"#menu_li_hxg\").click(function(){\n");
      out.write("\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_xb\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_dc\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/data/compute/compute_hxg\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#menu_li_xb\").click(function(){\n");
      out.write("\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_hxg\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_dc\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/page/comput_xb\");\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#menu_li_dc\").click(function(){\n");
      out.write("\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_hxg\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#menu_li_xb\").removeClass(\"active\");\n");
      out.write("\t\t\t$(\"#content_iframe\").attr(\"src\",\"");
      out.print(request.getContextPath() );
      out.write("/page/comput_dc\");\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/comput_list.jsp(75,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Type eq \"1\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li class=\"menu_li active\" id=\"menu_li_hxg\">互相关计算</li>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/comput_list.jsp(78,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Type eq \"2\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li class=\"menu_li active\" id=\"menu_li_hxg\">互相关计算</li>\n");
        out.write("\t\t\t\t\t\t<li class=\"menu_li\" id=\"menu_li_xb\">形变计算</li>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/comput_list.jsp(82,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Type eq \"3\" }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t    <li class=\"menu_li active\" id=\"menu_li_hxg\">互相关计算</li>\n");
        out.write("\t\t\t\t\t    <li class=\"menu_li\" id=\"menu_li_xb\">形变计算</li>\n");
        out.write("\t\t\t\t\t\t<li class=\"menu_li\" id=\"menu_li_dc\">电磁计算</li>\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
