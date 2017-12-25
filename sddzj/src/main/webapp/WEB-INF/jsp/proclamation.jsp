<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background:#eee;
	margin:0;
	padding:0;
}
div.notice { 
	width: 75%; margin: 20px auto; box-shadow:10px 10px 10px #CCC ; padding: 0 20px;  border-radius:3px;background: #FFF;
}
h2 {text-align: center;}
div.notice div{
	margin:10px auto;
	font-family: "微软雅黑";
	text-align: center;
}
div.notice div.title{
	width:80%;
	line-height:50px;
	font-size:20px;
	font-weight: bold;
	margin-bottom:0;
}
div.notice div.info{
	margin-top:0;
	width:80%;
	height:20px;
	font-size:14px;
	line-height:20px;
}
div.notice div.info span{
	margin-right:50px;
	color:#666;
}
div.notice div.content{
	width:80%;
	text-align: left;
	padding-bottom:20px;
}
</style>
<style>
		a.button {
			position: relative;
			color: rgba(255,255,255,1);
			text-decoration: none;
			background-color: #0B69F3;
			font-family: 'Yanone Kaffeesatz';
			font-weight: 60;
			font-size: 1em;
			display: block;
			padding: 4px;
			-webkit-border-radius: 8px;
			-moz-border-radius: 8px;
			border-radius: 8px;
			-webkit-box-shadow: 0px 9px 0px #0B69F3, 0px 9px 25px #0B69F3;
			-moz-box-shadow: 0px 9px 0px #0B69F3, 0px 9px 25px #0B69F3;
			box-shadow: 0px 9px 0px #0B69F3, 0px 9px 25px #0B69F3;
			margin: 10px auto;
			width: 60px;
			text-align: center;
			
			-webkit-transition: all .1s ease;
			-moz-transition: all .1s ease;
			-ms-transition: all .1s ease;
			-o-transition: all .1s ease;
			transition: all .1s ease;
		}

		a.button:active {
			-webkit-box-shadow: 0px 3px 0px #0B69F3, 0px 3px 6px #0B69F3;
			-moz-box-shadow: 0px 3px 0px #0B69F3, 0px 3px 6px #0B69F3;
			box-shadow: 0px 3px 0px #0B69F3, 0px 3px 6px #0B69F3;
			position: relative;
			top: 6px;
		}
	</style>
</head>
<body>
	<div class="notice">
		<div class="title">${notices.noticeTitle }</div>
		<div class="info"><span>${notices.noticeStartTime }</span><span>${notices.noticeCreater }</span></div>
		<div class="content">${notices.noticeContent }</div>
</div>
<a href="<%=request.getContextPath()%>/notice/list" class="button" style="text-decoration:none">返回</a>
</body>
</html>