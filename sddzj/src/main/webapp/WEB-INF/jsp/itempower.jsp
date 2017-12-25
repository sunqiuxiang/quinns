<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script> 
<title>Insert title here</title>

<style>
			table[class^="table"]{
				margin: 0 auto;		 
				padding: 30px;
			}
			table[class^="table"] tr{
				line-height: 50px;
				width:500px;
				height: 50px;
			}
			table[class^="table"] tr td:first-child{
				text-align: right;
			}
			table[class^="table"] tr td:nth-child(2){
				text-align: left;
			}			
			input,select{
				width:350px;
			    height: 25px;
			    
			}
			.btn{
				width:100px;
				height: 30px;
				margin-left: 50px;
		 		border: none;
				background:#8BC2EB;
				border-radius: 5px;
			}
			.btn:hover{
				background: #389AE5;
			}
			
		</style>
		<script type="text/javascript">
		function add(){
			  $.ajax({
				  type : "POST",  
                  url : "<%=request.getContextPath()%>/function/update",  
	                data:{func: $("#func").val(),role: $("#role").val()},
	                success:function (data) {
	                    if (data.ret == "success") {
	                        $("body").html("修改成功！")
	                        layer.msg("修改成功！",{icon:1,time:1000});
	                        window.location.href="<%=request.getContextPath()%>/function/getlist";  
	                    }
	                    else if (data.ret == "error") {
		                        $("body").html("修改失败")
		                        layer.msg("添加失败",{icon:2,time:1000});
		                        window.location.href="<%=request.getContextPath()%>/function/getlist"; 
		                    }
	                    else{
	                    	$("body").html("操作异常！")
	                        layer.msg("操作异常！",{icon:2,time:1000});
	                    }
	                }
	                });
			  }
		</script>
		<script type="text/javascript">
		function cg(){
			 $.ajax({
				  type : "POST",  
                  url : "<%=request.getContextPath()%>/function/getroe",  
	                data:{funcid: document.getElementById("func").value},
	                success:function (data) {
	                	document.getElementById("tx").value=data.roe;
	                }
	                });
			  }
		</script>
</head>

<body>

<table class="table_qugl">
	<tr>
		<td>权限分类
			<select id="func" name="func" onchange="cg(this.value)">
				<c:forEach items="${funclist}" var="funclist">
  					<option value="${funclist.id}">${funclist.funcname}&nbsp;第${funclist.level}层</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td>当前权限
			<input id = "tx" type="text" value="" readonly="readonly"></input>
		</td>
	</tr>
	
	<tr>
		<td>角色
			<select id="role" name="role">
				<c:forEach items="${rolelist}" var="rolelist">
  					<option value="${rolelist.powerlevel}">${rolelist.rolename}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input onclick="add()" class="btn" type="button" value="提交"/>
      
		</td>
	</tr>
	
</table>
</body>
</html>