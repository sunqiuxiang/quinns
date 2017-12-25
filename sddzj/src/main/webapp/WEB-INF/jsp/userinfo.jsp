<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
		.table{
			margin: 0 auto;			 
			padding: 30px;
		}
			.table tr{
				line-height: 50px;
				width:500px;
				height: 50px;
			}
			.table tr td:first-child{
				text-align: right;
			}
			.table tr td:nth-child(2){
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
</head>
<body>
<table class="table">
	<tr>
		<td>
			姓名：<input type="text" name="userName" value="${user.name }" disabled="disabled"/>
		</td>
	</tr>
	<tr>
		<td>
			用户名：<input type="text" name="depID" value="${user.username}"disabled="disabled"/>
		</td>
	</tr>
	
	<tr>
		<td>
			角色：<input type="text" name="area" value="${user.constantname}"disabled/>
		</td>
	</tr>
	
</table>
</body>
</html>