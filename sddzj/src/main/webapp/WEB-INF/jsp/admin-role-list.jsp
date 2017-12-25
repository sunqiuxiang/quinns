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

</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表 <a class="btn btn-success radius r" 
style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
  <table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
      <tr class="text-c">
     		<th scope="col" colspan="9">注册用户列表</th>
			</tr>
			<tr class="text-c">
				<th width="40">用户名</th>
				<th width="40" hidden>个人编号</th>
				<th width="100">姓名</th>
				<th width="100">用户身份</th>
			</tr>
    </thead>
    <tbody>
			<c:forEach items="${list}" var="user">
                  <tr>
						<td>${user.username }</td>
                        <th hidden>${user.id }</th>
                        <td>${user.name }</td> 
                        <td>${user.constantname }</td> 
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

</body>
</html>