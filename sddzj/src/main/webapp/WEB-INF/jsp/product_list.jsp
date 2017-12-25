<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,Fenli-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
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

<style type="text/css">
</style>
<title>测震数据</title>
<script type="text/javascript">
	function openFileIIs(filename) {
		try {
			var obj = new ActiveXObject("regedit.exe");
			if (obj) {
				obj.Run("\"" + C + ":\"+Windows+" / "", 1, false);
				//obj.run("osk");/*打开屏幕键盘*/
				//obj.Run('"'+filename+'"'); 
				obj = null;
			}
		} catch (e) {
			alert("请确定是否存在该盘符或文件");
		}

	}
</script>
</head>
<body class="pos-r">
	<div>
		<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		数据管理 <span class="c-gray en">&gt;</span> 测震数据<span class="c-gray en">&gt;</span> ${taizhenname}<a
			class="btn btn-success radius r"
			style="line-height: 1.6em; margin-top: 3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a></nav>
		<div class="page-container">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l">
				    <c:if test="${Type=='2'}">
						<a href="javascript:;" class="btn btn-danger radius"
							onclick="system_category_edit('上传文件','<%=request.getContextPath()%>/data/upload?path=${list[0].uploadpath}','1','700','480')"
							style="text-decoration: none"><i class="Hui-iconfont">&#xe642;</i>上传</a>
					</c:if> 
					<c:if test="${Type=='3' }">
						<a href="javascript:;" class="btn btn-danger radius"
							onclick="system_category_edit('上传文件','<%=request.getContextPath()%>/data/upload?path=${list[0].uploadpath}','1','700','480')"
							style="text-decoration: none"><i class="Hui-iconfont">&#xe642;</i>上传</a>
						<a href="javascript:;" class="btn btn-danger radius"
							onclick="system_category_edit('批量删除数据','<%=request.getContextPath()%>/data/list/tw_record?taizhenname=${list[0].uploadpath}','1','800','480')"
							style="text-decoration: none"><i class="Hui-iconfont"></i>删除</a>
					</c:if> 
					<c:if test="${Type=='1' }"></c:if> 
				</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<div class="mt-20">
				<table
					class="table table-border table-bordered table-bg table-hover table-sort">
					<thead>
						<tr class="text-c">
							<th >台网名称</th>
							<th >台站名称</th>
							<th>数采型号</th>
							<!-- <th width="60">数采字长</th>
							<th width="60">满幅电压</th> -->
							<th >采样率</th>
						<!-- 	<th width="60">通道总数</th>
							<th width="90">数据传播方式</th>
							<th width="90">传输设备类型</th>
							<th width="60">对时方式</th>
							<th width="60">时钟型号</th>
							<th width="60">钟差</th>
							<th width="60">台站纬度</th>
							<th width="60">台站经度</th>
							<th width="60">台站高程</th>
							<th width="60">台站权重</th>
							<th width="90">台站速度模型</th>
							<th width="90">原始数据模型</th> -->
							<th >地震计型号</th>
							<!--<th width="110">EW向增益因子</th>
						 	<th width="110">NS向增益因子</th>
							<th width="110">UD向增益因子</th>
							<th width="110">EW向响应阶数</th>
							<th width="110">NS向响应阶数</th>
							<th width="110">UD向响应阶数</th> -->
							<th >开始时间</th>
							<th >截止时间</th>
							<th>数据长度</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="user">
							<tr class="text-c va-m">
								<td>${user.twname}</td>
								<td class="text-l">${user.staname}</td>
								<td class="text-l">${user.datype}</td>
								<%-- <td class="text-l">${user.dAlen}</td>
								<td class="text-l">${user.v}</td> --%>
								<td class="text-l">${user.samp}</td>
								<%-- <td class="text-l">${user.stacom}</td>
								<td class="text-l">${user.bc}</td>
								<td class="text-l">${user.tp}</td>
								<td class="text-l">${user.checktime}</td>
								<td class="text-l">${user.timetype}</td>
								<td class="text-l">${user.subtime}</td>
								<td class="text-l">${user.stalat}</td>
								<td class="text-l">${user.stalon}</td>
								<td class="text-l">${user.shei}</td>
								<td class="text-l">${user.swei}</td>
								<td class="text-l">${user.vmol}</td>
								<td class="text-l">${user.dmol}</td> --%>
								<td class="text-l">${user.stype}</td>
								<%-- <td class="text-l">${user.gfactore}</td>
								<td class="text-l">${user.gfactorn}</td>
								<td class="text-l">${user.gfactorz}</td>
								<td class="text-l">${user.dgreee}</td>
								<td class="text-l">${user.dgreen}</td>
								<td class="text-l">${user.dgreez}</td> --%>
								<td class="text-l">${user.starttime}</td>
								<td class="text-l">${user.endtime }</td>
								<td class="text-l">${user.datasec }</td>
								<!-- <td class="text-l">1</td> -->
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/static/h-ui/js/H-ui.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/css/static/h-ui.admin/js/H-ui.admin.js"></script>

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

		$('.table-sort').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			/* "bStateSave" : true,//状态保存 */
			"aoColumnDefs" : [ {
				"orderable" : false,
			} // 制定列不参与排序
			]
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
		/*图片-审核*/
		function product_shenhe(obj, id) {
			layer
					.confirm(
							'审核文章？',
							{
								btn : [ '通过', '不通过' ],
								shade : false
							},
							function() {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a class="c-primary" onClick="product_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-success radius">已发布</span>');
								$(obj).remove();
								layer.msg('已发布', {
									icon : 6,
									time : 1000
								});
							},
							function() {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a class="c-primary" onClick="product_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-danger radius">未通过</span>');
								$(obj).remove();
								layer.msg('未通过', {
									icon : 5,
									time : 1000
								});
							});
		}
		/*图片-下架*/
		function product_stop(obj, id) {
			layer
					.confirm(
							'确认要下架吗？',
							function(index) {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" onClick="product_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-defaunt radius">已下架</span>');
								$(obj).remove();
								layer.msg('已下架!', {
									icon : 5,
									time : 1000
								});
							});
		}

		/*图片-发布*/
		function product_start(obj, id) {
			layer
					.confirm(
							'确认要发布吗？',
							function(index) {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" onClick="product_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-success radius">已发布</span>');
								$(obj).remove();
								layer.msg('已发布!', {
									icon : 6,
									time : 1000
								});
							});
		}
		/*图片-申请上线*/
		function product_shenqing(obj, id) {
			$(obj).parents("tr").find(".td-status").html(
					'<span class="label label-default radius">待审核</span>');
			$(obj).parents("tr").find(".td-manage").html("");
			layer.msg('已提交申请，耐心等待审核!', {
				icon : 1,
				time : 2000
			});
		}
		/*图片-编辑*/
		function product_edit(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/*图片-删除*/
		function product_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon : 1,
					time : 1000
				});
			});
		}

		function system_category_edit(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}   
		<%-- function system_category_edit(name,path) {
            layer.open({
                type: 2,
                title: name,
                fix: false,
                maxmin: true,
                shadeClose: false,
                area: ['40%', '40%'],
                content: '<%=request.getContextPath()%>/upload.do?path=' + path,
            });
        } --%>
	</script>
	
	
	<script type="text/javascript">
		function endTime(start,sec){
			console.log(start);
			console.log(sec);
		}
	</script>

	<%
		if ("Success".equals(request.getAttribute("shenqingxiazai"))) {
	%>
	<script type="text/javascript">
		layer.msg("提交申请！",{icon:1,time:1000});
	</script>
	<%
		}
	%>
<script type="text/javascript">
	//$($("#DataTables_Table_0_filter").find("label")).html("检索<input type='search' class='input-text' aria-controls='DataTables_Table_0'>");
</script>



</body>
</html>