<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>文件列表</title>
<style type="text/css">
	body{
		min-height: 100%;
		max-height: 100%;
		width:100%;
		position: fixed;
	}
	.table .text-c td.name{
		text-align: left;
	}
	.hidden_part{
		display: none;
	}
	.img_btn{
		cursor:pointer;
		margin-left:10px;
	}
	.img_btn_ok{
		width:20px;
		height:20px;
	}
	.img_btn_cancel{
		width:18px;
		height:18px;
	}
	div.file_nav{
		margin-top:10px;
	}
	tbody{
		height:100px;
		overflow: auto;
	}
	.file_list{
		height:300px;
		overflow-y:scroll; 
	}
	.t5{
		width: 5%;
	}
	.t19{
		width:19%;
	}
</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 文件管理 <span class="c-gray en">&gt;</span> 文件搜索 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c">
		<form action="<%=request.getContextPath() %>/file/search" method="post">
			<input type="hidden" name="path" value="/"> 
			<input type="text" name="keyword" id="input_search" placeholder="文件名称" style="width:250px" class="input-text">
			<button name="" id="btn_search" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜文件</button>
		</form>
	</div>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
			<a href="javascript:void(0)" onclick="batchdownload()" class="btn btn-primary radius">
				<i class="Hui-iconfont"></i> 下载
			</a> 
			<a href="javascript:;" onclick="batchDelete()" class="btn btn-danger radius">
				<i class="Hui-iconfont">&#xe6e2;</i> 批量删除
			</a>
		</span>
	</div>
	<div class="file_nav"><a href="<%=request.getContextPath()%>/file/list?filePath=/user/hdfs">全部文件</a> > 搜索</div>
	<table class="mt-10 table table-border table-bg table-hover table-sort" >
			<colgroup>
		        <col>
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		    </colgroup>
			<thead class="th_flex">
				<tr class="text-c">
					<th><input name="" type="checkbox" id="check_all"></th>
					<th>文件名称</th>
					<th>文件大小</th>
					<th>所在位置</th>
					<th>更新时间</th>
					<th>操作</th>
				</tr>
			</thead>
		</table>
	<div class="file_list" id="file_list">
		<table class="table table-border table-bg table-hover table-sort" >
			<colgroup>
		       <colgroup>
		        <col>
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		        <col class="t19">
		    </colgroup>
		    </colgroup>
			<tbody id="file_table">
				<c:if test="${files != null }">
					<c:forEach var="file" items="${files }">
						<tr class="text-c">
						<td><input name="" type="checkbox" value=""></td>
						<c:if test="${file.dir }">
							<td class="name"><span class="edit_part hidden_part"><input value="${file.fileName }"/><img src="<%=request.getContextPath()%>/images/img_btn_ok.png" class="img_btn img_btn_ok" onclick=""/><img src="<%=request.getContextPath()%>/images/img_btn_cancel.png" class="img_btn img_btn_cancel" onclick=""/></span><a class="filename_part" href="${pageContext.request.contextPath }/file/list?filePath=${file.filePath}" onClick=""><input type="hidden" value="${file.filePath }"/><img src="<%=request.getContextPath()%>/images/folderClosed.gif" width="18px" height="18px"/>${file.fileName }</a></td>
							<td>-</td>
						</c:if>
						<c:if test="${!file.dir }">
							<td class="name"><span class="edit_part hidden_part"><input value="${file.fileName }"/><img src="<%=request.getContextPath()%>/images/img_btn_ok.png" class="img_btn img_btn_ok" onclick=""/><img src="<%=request.getContextPath()%>/images/img_btn_cancel.png" class="img_btn img_btn_cancel" onclick=""/></span><a class="filename_part" href="${pageContext.request.contextPath }/file/download?filePath=${file.filePath}" onClick=""><input type="hidden" value="${file.filePath }"/><img src="<%=request.getContextPath()%>/images/leaf.gif" width="18px" height="18px"/>${file.fileName }</a></td>
							<td>${file.size }</td>
						</c:if>
						
						<td>${file.filePath }</td>
						<td>${file.lastModifDate }</td>
						<td class="td-manage">
						<a style="text-decoration:none" class="ml-5" onClick="file_rename(this,'${file.fileParent}','${file.dir}')" href="javascript:;" title="重命名">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<a style="text-decoration:none" class="ml-5" onClick="file_delete(this,'${file.filePath }')" href="javascript:;" title="删除">
							<i class="Hui-iconfont">&#xe6e2;</i>
						</a>
						</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${files == null }">
					<center><h3>没有匹配的文件</h3></center>
				</c:if>
			</tbody>
		</table>
	</div>
</div>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/H-ui.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath() %>/js/H-ui.admin.js"></script> 

<script type="text/javascript">
	/*动态计算文件列表高度*/
	console.log(($("body").height() - 300)+"px");
	console.log($("#file_list").height());
	$("#file_list").height(($("body").height() - 300)); 
</script>

<script type="text/javascript">
	/*全选*/ /*全不选*/
	$("#check_all").click(function(){
		console.log($(this).is(":checked"));
		if(!$(this).is(":checked")){
			$("td input[type=checkbox]").each(function(){
				$(this).prop("checked",false);
			});
		}else{
			$("td input[type=checkbox]").each(function(){
				$(this).prop("checked",true);
			});
		}
	});
	
</script>

<script type="text/javascript">
/*文件删除*/
function file_delete(obj,filePath){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			url:'<%=request.getContextPath() %>/file/delete.do',
			type:"POST",
			data:{"filePath":filePath},
			success:function(resultData){
				var resultData = eval("("+resultData+")");
				//console.log(resultData);
				if(resultData.success){
					$(obj).parents("tr").remove();
					layer.msg('已删除!',{icon:1,time:1000});
				}else{
					layer.msg(resultData.msg,{icon:2,time:1000});
				}
			}
		});
		
	});
}

/*文件重命名:不要轻易动这个方法*/
 function file_rename(obj,fileParent,isDir){
	$($(obj).parents('tr').find(".edit_part")[0]).removeClass("hidden_part");
	$($(obj).parents('tr').find(".filename_part")[0]).addClass("hidden_part");
	var oldname = $($($(obj).parents('tr').find(".edit_part")[0]).find("input")[0]).val();
	$($($(obj).parents('tr').find(".edit_part")[0]).find("input")[0]).focus().val($($($(obj).parents('tr').find(".edit_part")[0]).find("input")[0]).val());
	$($($(obj).parents('tr').find(".edit_part")[0]).find(".img_btn_ok")[0]).click(function(){
		var newname = $($($(obj).parents('tr').find(".edit_part")[0]).find("input")[0]).val();
		$.ajax({
			url:'<%=request.getContextPath() %>/file/rename.do',
			data:{"oldPath":fileParent+oldname,"newPath":fileParent+newname},
			type:"POST",
			success:function(resultData){
				var resultData = eval("("+resultData+")");
				if(resultData.success){
					$(obj).parents('tr').find(".filename_part")[0].innerHTML = isDir == 'true'?"<img src='<%=request.getContextPath()%>/img/folderClosed.gif' width='18px' height='18px'/>"+newname:"<img src='<%=request.getContextPath()%>/img/leaf.gif' width='18px' height='18px'/>"+newname;
					//console.log($($(obj).parents('tr').find(".filename_part")[0]).innerHTML);
					$($(obj).parents('tr').find(".filename_part")[0]).attr("href",isDir == 'true'?"<%=request.getContextPath() %>/file/list.do?filePath="+fileParent+newname+"":"<%=request.getContextPath() %>/file/download.do?filePath="+fileParent+newname+"");
					$($(obj).parents('tr').find(".edit_part")[0]).addClass("hidden_part");
					$($(obj).parents('tr').find(".filename_part")[0]).removeClass("hidden_part");
					layer.msg('重命名成功!',{icon:1,time:1000});
				}else{
					$($(obj).parents('tr').find(".edit_part")[0]).addClass("hidden_part");
					$($(obj).parents('tr').find(".filename_part")[0]).removeClass("hidden_part");
					layer.msg('重命名失败:'+resultData.msg,{icon:2,time:1000});
				}
			}
		});
	});
	$($($(obj).parents('tr').find(".edit_part")[0]).find(".img_btn_cancel")[0]).click(function(){
		$($(obj).parents('tr').find(".edit_part")[0]).addClass("hidden_part");
		$($(obj).parents('tr').find(".filename_part")[0]).removeClass("hidden_part");
	});
 }
 /*新建文件夹*/
 function mkdir(){
	 var elems = "<tr class='text-c'>"+
	 				"<td>"+
	 				"<input name='' type='checkbox' value='' />"+
	 			   "</td>"+
	 				"<td class='name'>"+
	 				"<img src='<%=request.getContextPath()%>/img/folderClosed.gif' width='18px' height='18px'/><input class='input_mkdir' value='mkdir'/><img src='<%=request.getContextPath()%>/img/img_btn_ok.png' class='img_btn img_btn_ok' onclick=''/><img src='<%=request.getContextPath()%>/img/img_btn_cancel.png' class='img_btn img_btn_cancel' onclick=''/>"+
	 			   "</td>"+
				   "<td>-</td>"+
				  "<td>-</td>"+
				  "<td>-</td>"+
	 			"</tr>";
	 $("#file_table").prepend($(elems));
	 $($(".img_btn_ok")[0]).click(function(){
		 $.ajax({
			 url:'<%=request.getContextPath() %>/file/mkdir.do',
			 data:{"filePath":'${currentFile}' == '/'?'${currentFile}'+$($(".input_mkdir")[0]).val():'${currentFile}/'+$($(".input_mkdir")[0]).val()},
			 type:'POST',
			 success:function(resultData){
				 var resultData = eval("("+resultData+")");
				 if(resultData.success){
					 window.location.reload();
				 }else{
					 layer.msg("新建文件夹失败"+resultData.msg,{icon:2,time:1000});
				 }
			 }
		 });
	 });
	 $($(".img_btn_cancel")[0]).click(function(){
		 $(this).parents("tr").remove();
	 });
 }
 
 /*批量下载*/
 function batchdownload(){
	 var checked = [];
	 $("tbody tr input:checkbox").each(function(){
		
	 	if(this.checked){
	 		checked.push($($($(this).parents("tr")[0]).find("a input:hidden")[0]).val());
	 	}
	 	
	 });
	 if(checked.length >= 1){
	 		if(checked.length == 1){
	 			createFormForSubmit("post",'<%=request.getContextPath() %>/file/download.do',{name:"filePath",value:checked[0]});
	 			$("tbody tr input:checkbox").each(function(){
	 				$(this).attr("checked",false);
	 			});
	 		}else{
	 			var filePaths = "";
	 			for(var i=0;i<checked.length;i++){
	 				filePaths += checked[i]+"^";
	 			}
	 			createFormForSubmit("post",'<%=request.getContextPath() %>/file/batchdownload.do',{name:"filePaths",value:filePaths});
	 			$("tbody tr input:checkbox").each(function(){
	 				$(this).attr("checked",false);
	 			});
	 		}
	 }
	 $("#check_all").prop("checked",false);
 }
 /*批量删除*/
 function batchDelete(){
	 var checked = [];
	 $("tbody tr input:checkbox").each(function(){
		
	 	if(this.checked){
	 		checked.push($($($(this).parents("tr")[0]).find("a input:hidden")[0]).val());
	 	}
	 	
	 });
	 if(checked.length >= 1){
		 var filePaths = "";
		 for(var i=0;i<checked.length;i++){
			filePaths += checked[i]+"^";
		 }
		 
		 $.ajax({
			 url:'<%=request.getContextPath() %>/file/batchdelete.do',
			 data:{filePaths:filePaths},
			 type:"POST",
			 success:function(resultData){
				 var resultData = eval("("+resultData+")");
				 if(resultData.success){
					 window.location.reload();
				 }else{
					 layer.msg("删除失败"+resultData.msg,{icon:2,time:1000});
				 }
			 }
		 });
		
	 }
 }
 
<%--  (function createFileNav(){
		var file = '${currentFile}';
		var parts = file.split("/");
		
		parts.shift();parts.shift();
		var nav = "<span>文件导航 | </span>";
		var nav_path = "/user";
		for(var i = 0;i<parts.length;i++){
			nav_path += "/"+parts[i];
			nav += "<a style='color:#5A98DE' href='<%=request.getContextPath() %>/file/list.do?filePath="+nav_path+"'>"+parts[i]+"</a> > ";
		}
		nav = nav.substring(0, nav.length - 2);
		//console.log(nav)
		$($(".file_nav")[0]).append($(nav));
 })(); --%>
 /*无刷新请求后台*/
 function createFormForSubmit(method,action,data){
	 var form = $("<form>");
		form.attr("style","display:none");
		form.attr("target","");
		form.attr("method",method);
		form.attr("action",action);
		var input_data = $("<input>");
		input_data.attr("type","hidden");
		input_data.attr("name",data.name);
		input_data.attr("value",data.value);
		$("body").append(form);
		form.append(input_data);
		form.submit();
 }
</script>
</body>
</html>