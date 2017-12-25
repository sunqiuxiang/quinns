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
                  url : "<%=request.getContextPath()%>/user/adduser2info",  
	                data:{depID: $("#depID").val(),authority: $("#authority").val()},
	                success:function (data) {
	                	alert(data);
	                    if (data == "success") {
	                        $("body").html("添加成功！")
	                        layer.msg("添加成功！",{icon:1,time:1000});
	                    }
	                    else if (data == "err") {
		                        $("body").html("添加失败，已有该权限！")
		                        layer.msg("添加失败，已有该权限！",{icon:2,time:1000});
		                    }
	                    else{
	                    	$("body").html("操作异常！")
	                        layer.msg("操作异常！",{icon:2,time:1000});
	                    }
	                }
	                });
			  }
		</script>
</head>

<body>

<table class="table_qugl">
	<tr>
		<td>
			<input type="text" id="depID" name="depID" value="${user.id}" hidden/>
			姓名：<input type="text" id="" name="" value="${user.name}"disabled/>
			<br>
			用户名：<input type="text" id="" name="" value="${user.username}"disabled/>
		</td>
	</tr>
	<tr>
		<td>权限分类
			<select id="authority" name="authority">
				<c:forEach items="${list}" var="conslist">
  					<option value="${conslist.role}">${conslist.rolename}</option>
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