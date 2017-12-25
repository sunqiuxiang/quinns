<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><style type="text/css" id="113119785847"></style>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
	<meta http-equiv="Cache-Control" content="no-siteapp" />
	<link href="<%=request.getContextPath()%>/css/H-ui.min.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/H-ui.login.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
	<script>DD_belatedPNG.fix('*');</script>
	<![endif]-->
	<title>后台登录</title>
	<meta name="keywords" content="">
	<meta name="description" content="">
</head>

<body>

<input type="hidden" id="TenantId" name="TenantId" value="" />
	
	<div class="loginWraper">
	<div id="Layer1" style="position:absolute; left:0px; top:0px; width:100%; height:100%">
	<img src="<%=request.getContextPath()%>/images/admin-login-bg.jpg" width="100%" height="100%"/>
</div>
	  	<div id="loginform" class="loginBox">
	  	<div class="title_div"><img src="<%=request.getContextPath() %>/css/static/h-ui/images/dzjpt.png"/></div>	
		    <form class="form form-horizontal" action="<%=request.getContextPath()%>/function/getitem" method="post">	    	
		      <div class="row cl"><!--用户名-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="username" name="username" type="text" placeholder="身份证号或手机号" class="input-text size-L">
		        </div>
		      </div>
		      <div class="row cl"><!--密码-->
		        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
		        <div class="formControls col-xs-8">
		          <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
		        </div>
		      </div>	       
		      <div class="row cl">
		        <div class="formControls col-xs-8 col-xs-offset-3">
		          <label for="online">
		            <input type="checkbox" name="online" id="online" value="">使我保持登录状态</label>
		            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="findpw.jsp">忘记密码？</a>
		        </div>
		      </div>
		      
		      <div class="row cl"><!--按钮-->
		        <div class="formControls col-xs-8 col-xs-offset-3">
		          <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
		          <a href="<%=request.getContextPath() %>/page/add"><p class="btn btn-primary radius size-L">&nbsp;注&nbsp;&nbsp;&nbsp;&nbsp;册&nbsp;</p></a>
		        </div>
		      </div>
		    </form>
	  </div>
	</div>
	<div class="footer"></div>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script> 
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/H-ui.js"></script> 
	<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script> 
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
		if (!"weichulierror".equals
(request.getAttribute("error"))) {
	%>
	<script type="text/javascript">
	layer.msg(request.getAttribute("error"),{icon:2,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("Success".equals(request.getAttribute("zhuce"))) {
	%>
	<script type="text/javascript">
		layer.msg("注册成功,您还需等待管理员审核后才能登陆平台！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("weichulierror".equals
(request.getAttribute("error"))) {
	%>
	<script type="text/javascript">
	layer.msg("管理员未处理您的申请！",{icon:2,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("success".equals
(request.getAttribute("updatePassword"))) {
	%>
	<script type="text/javascript">
	layer.msg("密码重置成功！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("jujueerror".equals
(request.getAttribute("error"))) {
	%>
	<script type="text/javascript">
	layer.msg("管理员拒绝您的申请！",{icon:2,time:1000});
	</script>
	<%
		}
	%>
		<%
		if ("loginerror".equals
(request.getAttribute("error"))) {
	%>
	<script type="text/javascript">
	layer.msg("用户名或者密码错误！",{icon:2,time:1000});
	</script>
	<%
		}
	%>
	
</body>
</html>