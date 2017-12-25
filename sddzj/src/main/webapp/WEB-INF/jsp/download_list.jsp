<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]--><title></title>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script> 
<style type="text/css">
	html,body{
		height:100%;
	}
	div.my_container{
		width:100%;
		height:100%;
	}
	div.menu{
		width:150px;
		height:100%;
		background-color: #f5f5f5;
		position: absolute;
	}
	div.content{
		width:90%;
		height:100%;
		margin-left:150px;
		overflow-y:hidden; 
	}
	.content_iframe{
		width:99%;
		height:100%;
	}
	ul.menu_ul{
		text-align: center;
	}
	ul.menu_ul li.menu_li{
		margin:0 auto;
		width:75%;
		padding:5px 0;
		cursor: pointer;
		border-radius:3px;
		background: #aaa;
		color:#fff;
		margin-top:10px;
	}
	ul.menu_ul li.active{
		background: skyblue;
	}
</style>
</head>
<body>
	<div class="my_container">
		<div class="menu">
			<ul class="menu_ul">
				<c:forEach var="power" items="${powerlist }">
						<li class="menu_li" id="${power.name}" onclick="changeInfo('${power.name}', '<%=request.getContextPath() %>/data/check.do?taizhen=${power.id}')" >${power.name}</li>
				</c:forEach>
				
				
			</ul>
		</div>
		
		<div class="content">
			<iframe id="content_iframe" class="content_iframe" src=""></iframe>
		</div>
	</div>
	<script>
	 var first_li = $($(".menu_li")[0]);
	    first_li.addClass("active");
		$("#content_iframe").attr("src","<%=request.getContextPath() %>/data/check?taizhen=1");
	
	<%--
	$("#menu_li_rs").click(function(){
		$(this).addClass("active");
		$("#menu_li_sd").removeClass("active");
		
		$("#content_iframe").attr("src","<%=request.getContextPath() %>/fenli.do");
	});
	$("#menu_li_sd").click(function(){
		$(this).addClass("active");
		$("#menu_li_rs").removeClass("active");
		
		$("#content_iframe").attr("src","<%=request.getContextPath() %>/shandongtw.do");
	}); --%>
	  function changeInfo(categoryId, contentId)
	  {
		 /*  $("#山东台网").addClass("active"); */
		  $("#"+categoryId).addClass('active').siblings().removeClass('active');
			$("#content_iframe").attr("src",contentId); 
	  }
		
	</script>
</body>