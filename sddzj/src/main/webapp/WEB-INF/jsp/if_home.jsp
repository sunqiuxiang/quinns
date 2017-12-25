<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>H+ 后台主题UI框架 - 数据表格</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> <link href="${pageContext.request.contextPath }/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <!-- Data Tables -->
    <link href="${pageContext.request.contextPath }/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
	
	<script src="${pageContext.request.contextPath }/js/jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/ui-dialog.css">
    <script src="${pageContext.request.contextPath }/js/dialog-plus.js"></script>
    <link href="${pageContext.request.contextPath }/css/animate.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    
                    <div class="ibox-content">

                        

                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>可编辑表格</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">
                        <div class="">
                            <a onclick="fnClickAddRow();" href="javascript:void(0);" class="btn btn-primary ">添加</a>
                        </div>
                        <table class="table table-striped table-bordered table-hover " id="editable">
                            <thead>
                                <tr>
                                    <th>1</th>
                                    <th>2</th>
                                    <th>3</th>
									<th>操作</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="gradeX">
                                    <td>Trident</td>
                                    <td>Internet Explorer 4.0
                                    </td>
                                    <td>Win 95+</td>
                                    <td><a class="btn btn-primary ">修改</a>&nbsp;&nbsp;<a class="btn btn-primary ">删除</a></td>
					
									
                                </tr>
                                <tr class="gradeC">
                                    <td>Trident</td>
                                    <td>Internet Explorer 5.0
                                    </td>
                                    <td>Win 95+</td>
                                     <td><a class="btn btn-primary ">修改</a>&nbsp;&nbsp;<a class="btn btn-primary ">删除</a></td>
                                </tr>
                                <tr class="gradeA">
                                    <td>Trident</td>
                                    <td>Internet Explorer 5.5
                                    </td>
                                    <td>Win 95+</td>
                                    <td><a class="btn btn-primary ">修改</a>&nbsp;&nbsp;<a class="btn btn-primary ">删除</a></td>
                                </tr>
                                
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th>1</th>
                                    <th>2</th>
                                    <th>3</th>
									<th>操作</th>
                                </tr>
                            </tfoot>
                        </table>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="${pageContext.request.contextPath }/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/jeditable/jquery.jeditable.js"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="${pageContext.request.contextPath }/js/plugins/dataTables/dataTables.bootstrap.js"></script>
    <script src="${pageContext.request.contextPath }/js/content.min.js?v=1.0.0"></script>
    <script>
        $(document).ready(function(){$(".dataTables-example").dataTable();var oTable=$("#editable").dataTable();});
		function fnClickAddRow(){
				alert(111);
				var addDialog = top.dialog({
				    title: '添加',
				    url:'create_1.html',
					height:'400px',
					width:'400px',
				    onclose:function (){
				    	window.location.reload();
				    }
				});
				addDialog.showModal();
		};
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

</body>

</html>