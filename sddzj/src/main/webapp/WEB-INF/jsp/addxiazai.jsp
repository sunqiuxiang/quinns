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
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script> 
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]--><title>下载申请</title>

</head>
<body>
	<div>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 平台服务 <span class="c-gray en">&gt;</span> 下载申请 <span class="c-gray en">&gt;</span> ${list2} </nav>
<div align="center"><a href="<%=request.getContextPath()%>/data/chaxunxiazai?tw_name=NetName&taizhen=${list4}"><b style="font-size:18px;text-decoration:underline">下载申请</b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/data/xiazailishi?taizhen=1"><span style="font-size:18px">历史申请</span></a></div>
		<form action="<%=request.getContextPath()%>/data/chaxunxiazai?taizhen=${list4}"
			method="post">
			<div class="page-container">
				<b>请选择台网：</b>
				<!-- <input type="text" name="tw_name"
size="20" maxlength="50"> -->
				<select name="tw_name" style="font-size: 13px;">
					${list1}
				</select> &nbsp;&nbsp;&nbsp;&nbsp; <b>开始时间</b>
				<!-- <td><input type="text" name="start"></td> -->
				<b><input type="text" name="start"
					onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:00:00',maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})"
					id="logmin" class="input-text Wdate" style="width: 175px;"></b>
				<b>结束时间</b>
				<!-- <td><input type="text" name="end"></td> -->
				<b><input type="text" name="end"
					onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:00:00',minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})"
					id="logmax" class="input-text Wdate" style="width: 175px;"></b>
				<input type="submit" class="btn btn1" value="查询" />
			</div>
		</form>

		<%-- <form action="<%=request.getContextPath()%>/shenqingxiazai.do" method="post" onsubmit="return verify();" > --%>
<div class="page-container">


  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
      <tr>
            <th scope="col" rowspan="2">全选：<input type="checkbox" name="allChecked" id="allChecked" onclick="SelectAll()"/></th>
            <th scope="col" colspan="9">内容介绍</th>
        </tr>
     	 <tr>
            <th scope="col" >台网名称</th>
            <th scope="col">事件类型</th>
            <th scope="col">文件记录类型</th>
            <th scope="col">台站数目</th>
            <th scope="col">台网中心纬度</th>
           <th scope="col">台网中心经度</th>
           <th scope="col">台网中心高度</th>
           <th scope="col">数据开始时间</th>
           <th scope="col">持续时间</th>
        </tr>
      
    </thead>
    <tbody>
      <c:forEach var="user" items="${list}">
      <tr class="text-c">
      	<td><input type="checkbox" id="uuid" name="uuid"value="${user.uuid}"/></td>
						<td >${user.twname}</td>
					    <td class="text-l">${user.type}</td>
						<td >${user.doctype}</td>
						<td class="text-l">${user.stasum}</td>
						<td class="text-l">${user.lat}</td>
						<td class="text-l">${user.lon}</td>
						<td class="td-status">${user.hei}</td>
						<td class="td-status">${user.starttime}</td>
						<td class="td-status">${user.datasec}</td>
      </tr>
      </c:forEach>
      
    </tbody>
  </table>
  <div id="pageNav" class="pageNav"></div>
  <b>申请理由:</b><input type="text" name="remark" id="remark" value="" class="page_input"/>&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="hidden" name="taiwang" id="taiwang" value="${list2}"/>
		<input type="submit"  class="btn btn1" value="申请下载" id="btn_sub"/>
</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/static/h-ui.admin/js/H-ui.admin.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript">
function SelectAll() {
 var checkboxs=document.getElementsByName("uuid");

 for (var i=0;i<checkboxs.length;i++) {
  var e=checkboxs[i];
  e.checked=!e.checked;
 }
}
$('.table-sort').dataTable({
	"aaSorting": [[ 0, "asc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[2]}//指定列不参与排序
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
		if ("defeat1".equals(request.getAttribute("chaxunxiazai"))) {
	%>
	<script type="text/javascript">
		layer.msg("请先选择台网，再选择台站！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("defeat".equals(request.getAttribute("chaxunxiazai"))) {
	%>
	<script type="text/javascript">
		layer.msg("请选择台站！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
	<%
		if ("defeat".equals(request.getAttribute("shenqingxiazai"))) {
	%>
	<script type="text/javascript">
		layer.msg("申请失败,请选择台站名称！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
<!-- </form> -->
</div>
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
	
	<script type="text/javascript">
	function verify() {
		var remark = document.getElementById("remark").value;
		if (remark = null || remark == "") {
			alert(" 申请理由为空！");
			return false;
		} else{
			return true;
		} 
	}
</script>
<script type="text/javascript">
	$("#btn_sub").click(function(){
		var flag = verify();
		if(flag){
			$("input[type='checkbox']").each(function(){
				console.log($(this).is(":checked"));
				if($(this).is(":checked")){
					console.log($(this).attr('value'));
						download($(this).attr('value'));
				}
			});
			location.reload();
		}else{
			
		}
	});
	
	function download(id){
			console.log(id);
			$.ajax({
				url:'<%=request.getContextPath()%>/data/shenqingxiazai',
				type:'POST',
				data:{uuid:id
					,remark:document.getElementById("remark").value
					,taiwang:document.getElementById("taiwang").value
					},
				success:function(){
					console.log(id);
				}
			});
	
	}
</script>
</body>
</html>