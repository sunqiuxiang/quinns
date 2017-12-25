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
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<title>系统日志</title>
</head>
<body>

<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 下载管理<span class="c-gray en">&gt;</span>  
<a href="<%=request.getContextPath()%>/data/check?taizhen=${list3}">返回上级</a>
<a class="btn btn-success radius r" 
style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
			<tr class="text-c">
				<th scope="col" colspan="4">任务详情</th>
			</tr>
			<tr class="text-c">
				<th width="40">台网名称</th>
				<th width="40" hidden>台站名称</th>
				<th width="100">开始时间</th>
				<th width="100">持续时间</th>
			</tr>
    </thead>
    <tbody>
     <c:forEach items="${list}" var="user">
                  <tr>
                  	<!-- <td><input type="checkbox" value="" name=""></td> -->
						<td>${user.twName }</td>
                        <th hidden>${user.tzStaname }</th>
                        <td>${user.applytime }</td> 
                        <td>${user.datasec }</td>
                    </tr> 
                </c:forEach>
    </tbody>
  </table>
  <div id="pageNav" class="pageNav"></div>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/static/h-ui.admin/js/H-ui.admin.js"></script> 
<script type="text/javascript">

$('.table-sort').dataTable({
	"aaSorting": [[ 0, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[3]}//指定列不参与排序
	]
});
</script>
<%
		if ("Success".equals(request.getAttribute("xiazaishenhe"))) {
	%>
	<script type="text/javascript">
		layer.msg("同意下载！", {
			icon : 1,
			time : 1000
		});
	</script>
	<%
		}
		if ("not".equals(request.getAttribute("not"))) {
	%>
	<script type="text/javascript">
		layer.msg("还有未审批的任务！", {
			icon : 2,
			time : 1000
		});
	</script>
	<%
		}
		if ("Defeat".equals(request.getAttribute("xiazaishenhe"))) {
	%>
	<script type="text/javascript">
		layer.msg("拒绝下载！", {
			icon : 1,
			time : 1000
		});
	</script>
	<%
		}
	%>
</body>
</html>