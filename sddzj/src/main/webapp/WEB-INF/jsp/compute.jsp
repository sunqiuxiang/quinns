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
<style type="text/css">
.table{
	 width:50%; 
}
</style>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/static/h-ui.admin/skin/default/skin.css"
	id="skin" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
</head>
<body class="pos-r">
	<!-- <div class="pos-a"
		style="width: 150px; left: 0; top: 0; bottom: 0; height: 100%; border-right: 1px solid #e5e5e5; background-color: #f5f5f5">
		<ul id="treeDemo" class="ztree">
		</ul>
	</div> -->
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
<div>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 平台服务 <span class="c-gray en">&gt;</span> 计算申请 <span class="c-gray en">&gt;</span> 互相关计算 </nav>
<div align="center"><a href="<%=request.getContextPath() %>/data/compute"><b style="font-size:19px;text-decoration:underline">互相关申请</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/data/computeApply"><span style="font-size:18px">历史申请</span></a></div>

<div class="page-container">
<div align="center" style="margin-top:20px;">
     <form id="shenqing" action='<%=request.getContextPath()%>/data/uploadjar.do' method="post"
			enctype="multipart/form-data">
			<table class="table">
			 		<tr>
						<td><input type="text" style="display: none;" name="uns" id="uns" value="${uns}"></td>
					</tr>
			         <tr>
						<td >台网</td>
						<td>
						<select name=taizhen id="taizhen" style="width:200px;height:30px;border-color:#ddd;" onchange="Changetd('taizhen')">
    						<option value="" selected="selected">请选择台网</option>
    						<c:forEach items="${list}" var="task">
    						<option value="${task.namev}">${task.name}</option>
    						</c:forEach>
    					</select>
    					</td>
					</tr>
					<tr>
						<td >站台编号</td>
						<td><input type="text" name="monitor" id="monitor"></td>
					</tr>
					<tr>
						<td>通道编号</td>
						<!-- <td><input type="text" name="parameter"></td> -->
						<td>
						<select name=parameter id="parameter" style="width:200px;height:30px;border-color:#ddd;">
    					<option value="" selected="selected">请选择通道</option>
    					<!-- <option value="N">北南向</option>
    						<option value="E">东西向</option>
    						<option value="Z">垂直向</option> -->
    						<!-- <option value="N">BHN</option>
    						<option value="E">BHE</option>
    						<option value="Z">BHZ</option> -->
    					</select>
    					</td>
					</tr>
					<tr>
						<td>开始时间</td>
						<!-- <td><input type="text" name="start"></td> yyyyMMddHH0000-->
						<td><input type="text" name="start" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:00:00',maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin" class="input-text Wdate" style="width:160px;"></td>
					</tr>
					<tr>
						<td>结束时间</td>
						<!-- <td><input type="text" name="end"></td> -->
						<td><input type="text" name="end" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:00:00',minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax" class="input-text Wdate" style="width:160px;"></td>
					</tr>
					<!-- <tr>
						<td>jar文件</td>
						<td style="position: absolute;"><input type="file" name="jarfile"><span style="color:red;position: relative;left:-70px;">*若采用默认计算程序，不需要提交Jar文件<span></td>
					</tr> -->
					<tr>
						<td>模板文件</td>
						<td><input type="file" name="textfile" id="textfile"></td>
					</tr>
					<!-- <tr align="center">
						<td colspan="2"><input type="submit" class="btn" value="申请计算"></td>
					</tr> -->
			</table>
			<div style="margin-left:-80px;margin-top:20px;"><input type="button" class="btn" id="btn_submit" value="申请计算"></div>
		</form></div>
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
<c:if test='${rest != null}'>
	<script type="text/javascript">
		layer.alert("计算已申请，等待审核");
	</script>
</c:if>

<script type="text/javascript">
function Changetd(taizhen) {
    $.ajax({
        type: 'post',
        url: '<%=request.getContextPath() %>/data/changetd.do',
        data: { taizhen: $("#" + taizhen).val() },
        success: function (data) {
        	var list=data.data.split(',');
            var content = "<option value=\"\" id=\"parameter\" selected=\"selected\">请选择通道</option>";
            for (var j = 0; j < 3; j++) {
            	console.log(list[j]);
                content += "<option value=\"" + list[j] + "\">" + list[j+3] + "</option>";
            }
            $("#parameter").html(content);
        }
    })
}




$('.table-sort').dataTable({
	"aaSorting": [[ 0, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[3]}//指定列不参与排序
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
$("#btn_submit").click(function(){
	var form = $("#shenqing");
	if($("#monitor").val() == ""){
		layer.msg("台站编号为空,不能进行互相关计算");
	}else if($("#logmin").val() == ""){
		layer.msg("开始时间不能为空");
	}else if($("#logmax").val() == ""){
		layer.msg("结束时间不能为空");
	}else if($("#textfile").val() == ""){
		layer.msg("模板文件不能为空");
	}else{
		var data = {
			tz:$("#monitor").val(),
			taizhen:$("#taizhen").val(),
			parameter:$("#parameter").val(),
			start:$("#logmin").val(),
			end:$("#logmax").val(),
			uns:$("#uns").val(),
		};
		$.ajax({
			url:'<%=request.getContextPath() %>/data/check_comput',
			type:'post',
			data:data,
			success:function(restData){
				var restData = eval("("+restData+")");
				if(restData.success){
					alert("申请成功");
					window.location.href='<%=request.getContextPath() %>/data/compute?uns=$("#uns").val()';
				}else{
					layer.msg("申请的计算缺少数据文件");
				}
			}
		});
		
	}
	
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