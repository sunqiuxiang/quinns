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
</head>
<body>
<div class="page-container">
<div class="cl pd-5 bg-1 bk-gray" id="btns">
				<span><a class="btn btn-primary radius" href="#" id="btn_delete"><i class="Hui-iconfont"></i>批量删除</a></span>
			</div>
  <table class="table table-border table-bordered table-bg table-hover table-sort">
   <thead>
						<tr class="text-c">
							<th>选择</th>
							<th>台网名</th>
							<th>台站总数</th>
							<th>开始时间</th>
							<th>结束时间</th>
						</tr>
					</thead>
    <tbody>
    <c:forEach var="tw" items="${tw_list }">
							<tr>
							<td><input type="checkbox" value="${tw.uuid }"/></td>
							<td>${tw.twName }</td>
							<td>${tw.staNum }</td>
							<td>${tw.startDate }</td>
							<td>${tw.endDate }</td>
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
	  {"orderable":false,"aTargets":[4]}//指定列不参与排序
	]
});
</script>
<script type="text/javascript"
				src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script>
			<script type="text/javascript"
				src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
		
		
		<script>
				$("#div_table").css("max-height",($("body").height() - $("#btns").height()));
		</script>
		
		<script>
			$("#btn_delete").click(function(){
				$("input[type='checkbox']").each(function(){
					if($(this).is(":checked")){
						console.log($(this).attr('value'));
						delete_tw($(this).attr('value'));
					}
				});
			});
			
			function delete_tw(uuid){
				$.ajax({
					url:'<%=request.getContextPath() %>/data/del/tw_record',
					type:'POST',
					data:{uuid:uuid},
					success:function(){
						parent.layer.msg("删除成功");
						setTimeout(function(){
							parent.location.reload();	
						},1500);
						
					}
				});
			}
		</script>
</body>
</html>