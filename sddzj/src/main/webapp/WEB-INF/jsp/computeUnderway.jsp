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
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]--><title></title>
</head>
<body class="pos-r">
	<!-- <div class="pos-a"
		style="width: 150px; left: 0; top: 0; bottom: 0; height: 100%; border-right: 1px solid #e5e5e5; background-color: #f5f5f5">
		<ul id="treeDemo" class="ztree">
		</ul>
	</div> -->
	<div>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 平台状态 <span class="c-gray en">&gt;</span> 计算状态 <span class="c-gray en">&gt;</span> 互相关计算<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
     		<th scope="col" colspan="9">进行中的任务</th>
			</tr>
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" value="" name=""></th> -->
				<th width="40">申请人</th>
				<th width="40">台站</th>
				<th width="100">台站通道</th>
				<th width="100">开始时间</th>
				<th width="100">结束时间</th>
				<!-- <th width="100">muban</th> -->
				<th width="100">MR任务状态</th>
				<th width="100">spark任务状态</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${tasks}" var="task">
                  <tr>
						<%-- <td hidden><input type="hidden" name="task_id" value="${task.id }"/>${task.id }</td> --%>
                        <td>${task.userName }</td>
                        <td>${task.monitor }</td> 
                        <td>${task.parameter }</td> 
                        <td>${task.startTime }</td> 
                        <td>${task.endTime }</td> 
                        <c:if test="${task.taskstatus ==null||task.taskstatus ==''}"><td>进行中</td></c:if>
                        <c:if test="${task.taskstatus !=null&&task.taskstatus !=''}"><td>已完成</td></c:if>
                        <c:if test="${task.taskstatusspark ==null||task.taskstatusspark ==''}"><td>进行中</td></c:if>
                        <c:if test="${task.taskstatusspark !=null&&task.taskstatusspark !=''}"><td>已完成</td></c:if>
                        
                    </tr> 
                </c:forEach>
    </tbody>
  </table>
  <div id="pageNav" class="pageNav"></div>
</div>
<%-- <div class="page-container">
  <table class="table table-border table-bordered table-bg table-hover table-sort1">
    <thead>
      <tr class="text-c">
     		<th scope="col" colspan="9">进行中的Spark任务</th>
			</tr>
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" value="" name=""></th> -->
				<th width="40">申请人</th>
				<th width="100">台站</th>
				<th width="100">台站通道</th>
				<th width="100">开始时间</th>
				<th width="100">结束时间</th>
				<!-- <th width="100">muban</th> -->
				<th width="100">Spark任务状态</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${task}" var="task1">
                  <tr>
						<td hidden><input type="hidden" name="task_id" value="${task.id }"/>${task.id }</td>
                        <td>${task1.userName }</td> 
                        <td>${task1.monitor }</td> 
                        <td>${task1.parameter }</td> 
                        <td>${task1.startTime }</td> 
                        <td>${task1.endTime }</td> 
                        <td>${task.muban} </td>
                         <td>进行中</td>
                    </tr> 
                </c:forEach>
    </tbody>
  </table>
  <div id="pageNav" class="pageNav"></div>
</div>
 --%>
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
	  {"orderable":false,"aTargets":[6]}//指定列不参与排序
	]
});
/* $('.table-sort1').dataTable({
	"aaSorting": [[ 0, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[5]}//指定列不参与排序
	]
}); */
</script>
<script>
	$("#btn_search").click(function(){
		var startTime = $("#logmin").val() || "";
		var endTime = $("#logmax").val() || "";
		var event = $("#event").val() || "";
		var userName = $("#userName").val() || "";
		console.log(startTime);
		console.log(endTime);
		if(startTime == endTime){
			
		}
		if(event == "全部"){
			event = "";
		}
		var data = {
			startTime:startTime,
			endTime:endTime,
			event:event,
			userName:userName
		};
		createFormForSubmit('post','<%=request.getContextPath() %>/log/query.do',data);
	});
</script>
<script type="text/javascript">
/*无刷新请求后台*/
function createFormForSubmit(method,action,data){
	 var form = $("<form>");
		form.attr("style","display:none");
		form.attr("target","");
		form.attr("method",method);
		form.attr("action",action);
		var input_startTime_data = $("<input>");
		input_startTime_data.attr("type","hidden");
		input_startTime_data.attr("name","startTime");
		input_startTime_data.attr("value",data.startTime);
		var input_endTime_data = $("<input>");
		input_endTime_data.attr("type","hidden");
		input_endTime_data.attr("name","endTime");
		input_endTime_data.attr("value",data.endTime);
		var input_event_data = $("<input>");
		input_event_data.attr("type","hidden");
		input_event_data.attr("name","event");
		input_event_data.attr("value",data.event);
		var input_userName_data = $("<input>");
		input_userName_data.attr("type","hidden");
		input_userName_data.attr("name","userName");
		input_userName_data.attr("value",data.userName);
		$("body").append(form);
		form.append(input_startTime_data);
		form.append(input_endTime_data);
		form.append(input_event_data);
		form.append(input_userName_data);
		form.submit();
}
</script>
<%
		if ("Success".equals(request.getAttribute("apply"))) {
	%>
	<script type="text/javascript">
		layer.msg("同意该计算任务！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("Defeat".equals(request.getAttribute("apply"))) {
	%>
	<script type="text/javascript">
		layer.msg("拒绝该计算任务！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<script type="text/javascript">
	var setting = {
			view : {
				dblClickExpand : false,
				showLine : false,
				selectedMulti : false
			},
			data : {
				simpleData : {
					enable : true,
					idKey : "id",
					pIdKey : "pId",
					rootPId : ""
				}
			},
			callback : {
				beforeClick : function(treeId, treeNode) {
					var zTree = $.fn.zTree.getZTreeObj("tree");
					if (treeNode.isParent) {
						zTree.expandNode(treeNode);
						return false;
					} else {
						demoIframe.attr("src", treeNode.file + ".html");
						return true;
					}
				}
			}
		};
	var zNodes = [ {
		id : 1,
		pId : 0,
		name : "互相关计算",
		open : true
	},
	/*{ id:11, pId:1, name:"二级分类"},
	{ id:111, pId:11, name:"三级分类"},
	{ id:112, pId:11, name:"三级分类"},
	{ id:113, pId:11, name:"三级分类"},
	{ id:114, pId:11, name:"三级分类"},
	{ id:115, pId:11, name:"三级分类"},*/
	/* { id:12, pId:1, name:"二级分类 1-2"},
	{ id:121, pId:12, name:"三级分类 1-2-1"},
	{ id:122, pId:12, name:"三级分类 1-2-2"}, */
	];

	var code;

	function showCode(str) {
		if (!code)
			code = $("#code");
		code.empty();
		code.append("<li>" + str + "</li>");
	}

	$(document).ready(function() {
		var t = $("#treeDemo");
		t = $.fn.zTree.init(t, setting, zNodes);
		demoIframe = $("#testIframe");
		demoIframe.bind("load", loadReady);
		var zTree = $.fn.zTree.getZTreeObj("tree");
		zTree.selectNode(zTree.getNodeByParam("id", '11'));
	});
	/*图片-添加*/
	function product_add(title, url) {
		var index = layer.open({
			type : 2,
			title : title,
			content : url
		});
		layer.full(index);
	}
	/*图片-查看*/
	function product_show(title, url, id) {
		var index = layer.open({
			type : 2,
			title : title,
			content : url
		});
		layer.full(index);
	}
	</script>
</body>
</html>