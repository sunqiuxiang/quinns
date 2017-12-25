<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>地震大数据分析与服务平台</title>

    <!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

    <link rel="shortcut icon" href="favicon.ico">
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/style.min.css?v=4.0.0" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.uniform.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.4.1/jquery.min.js"></script>
	<script type="text/javascript">
	/* function t(t){var e=0;return $(t).each(function(){e+=$(this).outerWidth(!0)}),e}
	n=t($(".content-tabs").children().not(".J_menuTabs"))
	function x(){
		alert("sqx");
		$("J_menuItem").each(function(t){$(this).attr("data-index")||$(this).attr("data-index",t)})
		$("J_menuItem").on("click",n)
		} */
function ajaxf(a){  
   	 alert(a);
     $('iframe0').attr('src',a);  
} 
	
	
</script>
</head>

<body style="overflow:hidden" class="fixed-sidebar full-height-layout gray-bg">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse" id="insertdiv" style="background:#4876FF">
				<ul class="nav" id="side-menu">
                    <li class="nav-header"  style="background:#104E8B">
                        <div class="dropdown profile-element"  style="background:#104E8B">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                                <span style="color:#fff" class="block m-t-xs"><strong class="font-bold">用户角色</strong></span>
                                <span style="color:#fff" class="text-muted text-xs block" >${usr.name}<b class="caret"></b></span>
                                </span>
                            </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a class="J_menuItem" href="form_avatar.html">修改头像</a>
                                </li>
                                <li><a class="J_menuItem" href="${pageContext.request.contextPath }/user/userinfo?userID=${usr.id}">个人资料</a>
                                </li>
                                <li><a class="J_menuItem" href="contacts.html">联系我们</a>
                                </li>
                                <li><a class="J_menuItem" href="mailbox.html">信箱</a>
                                </li>
                                <li class="divider"></li>
                                <li><a href="http://localhost:8080/sddzj/page/login">安全退出</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <!-- insert -->
                           <c:forEach items="${itemlist}" var="a">
                                <c:if test="${a.childflag eq 1 }">
                                 	<li>
										<a href="${a.funcpath}">
                       					 	${a.funcicon}<span class="nav-label">${a.funcname}</span> <span class="fa arrow"></span>
                    					</a>
                    			<ul class="nav nav-second-level">
									<c:forEach items="${a.child}" var="b">
                                		<li><a class="J_menuItem" href="${b.funcpath}"><span class="nav-label">${b.funcname}</span></a></li>
                    				</c:forEach>
                    			</ul>
								</li>
								</c:if>
								<c:if test="${a.childflag ne 1 }">
                                	<li>					
                        				<a class="J_menuItem" href="${a.funcpath}">${a.funcicon}<span class="nav-label">${a.funcname}</span></a>
                    				</li>
								</c:if>
                            </c:forEach>
                          
                      
			    </ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
		<!--
		
		
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                    <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                        
                    </div>
                    
                </nav>
            </div>
		-->
		<div align="left" style="height:105px;width:100%;background:url('${pageContext.request.contextPath }/images/header_bg.png');">
			<a style="margin-top:5px;border:0px;background-color:transparent" class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#">
				<img style="margin-top:5px;margin-left:25px" src="${pageContext.request.contextPath }/images/logo.png" width=70px height = 70px></img>
			</a>
			<img style="margin-top:15px" src="${pageContext.request.contextPath }/images/dzjpt.png" width=50% height=50%>
		</div>
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="${pageContext.request.contextPath }/notice/list">公告</a>

                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a>
                        </li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="http://localhost:8080/sddzj/page/login" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            
            
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" id="iframe0" name="iframe0" width="100%" height="100%" src="" frameborder="0" data-id="${pageContext.request.contextPath }/jsp/if_home.html" seamless></iframe>
            </div>
            
            
            <div class="footer">
                <div class="pull-right">&copy; 山东省地震局 <a href="http://www.cnblogs.com/quinnsun/" target="_blank">孙秋翔</a>
                </div>
            </div>
        </div>
        <!--右侧部分结束-->
        
       
    </div>
    <script src="${pageContext.request.contextPath }/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/layer/layer.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/hplus.min.js?v=4.0.0"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/contabs.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/pace/pace.min.js"></script>
</body>

</html>