<%@page import="java.util.Date"%>
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
<body>

	<div>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 平台服务 <span class="c-gray en">&gt;</span> 下载申请 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a>
<span class="c-gray en">&gt;</span><a href="<%=request.getContextPath()%>/data/xiazailishi?taizhen=${list4}">返回上级</a>
</nav>

<div class="page-container">

  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
     <tr>
				<th scope="col" colspan="9" align="center">任务详情</th>
			</tr>
			<tr class="text-c">
				<!-- <th width="25"><input type="checkbox" value="" name=""></th> -->
				<th width="40">申请人</th>
				<th width="40" >申请时间</th>
				<th width="100">申请备注</th>
				<th width="100">申请结果</th>
				<th width="100">下载</th>
				
			</tr>
     
    </thead>
    <tbody>
      <!-- <tr class="text-c">
      	<td>2014-6-11 11:11:42</td>
      	 <td>admin</td>
        <td>登录</td>
        <td>登录成功!</td>
      </tr> -->
     
     	<c:forEach items="${list}" var="user">
                  <tr>
                  	<!-- <td><input type="checkbox" value="" name=""></td> -->
						<td>${user.applyname }</td>
                        <td>${user.applytime }</td>
                        <td>${user.remark }</td>
                        <c:if test="${user.reviewed=='1' }"><td>同意</td></c:if>
                        <c:if test="${user.reviewed=='3' }"><td>同意</td></c:if>
                        <c:if test="${user.reviewed=='4' }"><td>同意</td></c:if>
                        <c:if test="${user.reviewed=='0' }"><td>未审核</td></c:if>
                        <c:if test="${user.reviewed=='2' }"><td>拒绝</td></c:if>

                        <c:if test="${user.reviewed =='3'&&(user.filepath != null && user.filepath != '' && user.reviewed =='1') }">
                        	<td><a href="<%=request.getContextPath() %>/upload/download?task_id=${user.id }&filepath=${user.filepath }">下载</a></td> 
                        </c:if>
                        <c:if test="${user.reviewed =='3'||(user.allfilepath != null && user.allfilepath != '' && user.reviewed =='1')  }">
                        	<td><a href="<%=request.getContextPath() %>/upload/download?task_id=${user.id }&filepath=${user.allfilepath }">下载</a></td> 
                        </c:if>
                         <c:if test="${(user.filepath == null||user.filepath == ''&&user.allfilepath == null&&user.allfilepath == '') && user.reviewed =='1' }">
                         <td>处理中</td> 
                         </c:if>
                          <c:if test="${(user.filepath == null||user.filepath == '') && user.reviewed =='0'  }">
                         <td></td> 
                         </c:if>
                          <c:if test="${(user.filepath == null||user.filepath == '') && user.reviewed =='2'  }">
                         <td></td> 
                         </c:if>
                         <c:if test="${(user.filepath != null&&user.filepath != '') && user.reviewed =='2'  }">
                         <td></td> 
                         </c:if>
                         <c:if test="${user.filepath != null && user.filepath != '' && user.reviewed =='4' }">
                         <td>已过期</td> 
                         </c:if>
                         
                    </tr> 
                </c:forEach>
      
    </tbody>
  </table>
  <div id="pageNav" class="pageNav"></div>
</div>
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
	  {"orderable":false,"aTargets":[4]}//指定列不参与排序
	]
});
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
		createFormForSubmit('post','<%=request.getContextPath() %>/log/query',data);
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
		if ("Success".equals(request.getAttribute("shenqingxiazai"))) {
	%>
	<script type="text/javascript">
		layer.msg("提交申请！",{icon:1,time:1000});
	</script>
	<%
		}%>
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
		name : "乳山台阵",
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