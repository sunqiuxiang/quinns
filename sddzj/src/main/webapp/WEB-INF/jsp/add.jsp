<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
   <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.1.0.min.js"></script>
   <script type="text/javascript" src="<%=request.getContextPath() %>/css/lib/layer/2.1/layer.js"></script> 
	<link href="<%=request.getContextPath() %>/css/H-ui.min.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/css/H-ui.login.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/css/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
	<title>后台注册</title>
	<meta name="keywords" content="">
	<meta name="description" content="">
<script type="text/javascript">
	function verify() {
		var userName = document.getElementById("userName").value;
		var depID = document.getElementById("depID").value;
		var name = document.getElementById("name").value;
		alert(name);
		//var a = /^((\(\d{3}\))|(\d{3}\-))?13\d{9}|14[57]\d{8}|15\d{9}|18\d{9}$/;
		//var b = /^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
		//var c=phone.match(a);
		//var d=depID.match(b);
	    reg=/^([\u4e00-\u9fa5]){2,8}$/;       //只能是中文，长度为2-8位
	    if(!reg.test(name)){       
	            alert("姓名为2-8位的中文汉字");     
	       return false;}
	   else if (userName = null || userName == "") {
			alert(" 用户名为空");
			return false;
		} else if (name = null || name == "") {
			alert(" 身份证号为空");
			return false;
		}  else if (userPWD = null || userPWD == "") {
			alert(" 密码为空");
			return false;
		} else if (reuserPWD = null || reuserPWD == "") {
			alert(" 请再次输入密码");
			return false;
		}else if (userPWD != reuserPWD) {
			alert("两次密码不同，请重新输入");
		      return false;
		} else if (confirm("是否确认进行注册？")) {
			return true;
		} else {
			return false;
		}
	}
</script>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
	<input type="hidden" id="TenantId" name="TenantId" value="" />
	<div class="header"></div>
	<div class="loginWraper">
	  	<div id="loginform1" class="loginBox">
		<div class="title_div"><h2>山东地震局大数据管理平台</h2></div>
		    <form class="form form-horizontal" action="<%=request.getContextPath()%>/user/add" method="post" onsubmit="return verify();">
		      <div class="row cl"><!--用户名-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="userName" name="userName" type="text" placeholder="用户名" class="input-text size-L">
		        </div>
		      </div>
		       <div class="row cl"><!--所在单位-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe696;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="name" name="name" type="text" placeholder="姓名" class="input-text size-L">
		        </div>
		      </div>
		      <div class="row cl"><!--密码-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="userPWD" name="userPWD" type="password" placeholder="密码" class="input-text size-L">
		        </div>
		      </div>
		       <div class="row cl"><!--确认密码-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="reuserPWD" name="reuserPWD" type="password" placeholder="确认密码" class="input-text size-L">
		        </div>
		      </div>		       
		      <div class="row cl"><!--按钮-->
		        <div class="formControls col-xs-8 col-xs-offset-3">
		          <input name="" type="submit" class="btn btn-primary radius size-L a1" value="&nbsp;提&nbsp;&nbsp;&nbsp;&nbsp;交&nbsp;">
		          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="<%=request.getContextPath()%>/page/login">返回登录页面</a>
		        </div>
		      </div>
		    </form>
	  </div>
	</div>
	<div class="footer"></div>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script> 
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/H-ui.js"></script> 
	<script>
	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
	var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
	document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
	</script>
	<%
		if ("Error".equals(request.getAttribute("zhuce"))) {
	%>
	<script type="text/javascript">
		layer.msg("注册失败！",{icon:2,time:1000});
	</script>
	<%
		}
	if ("repetition".equals(request.getAttribute("zhuce"))) {
	%>
	<script type="text/javascript">
		layer.msg(" 用户已存在！",{icon:2,time:1000});
	</script>
	<%
		}
	if ("Success".equals(request.getAttribute("zhuce"))) {
		%>
		<script type="text/javascript">
			layer.msg(" 注册成功！",{icon:2,time:1000});
		</script>
		<%
			}
		
		%>
</body>
</html>