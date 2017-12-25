<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/lib/icheck/icheck.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/static/h-ui.admin/css/style.css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/css/lib/jquery/1.9.1/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/css/lib/echarts-all.js"></script>
<style>
			body,html{
				margin:0;
				padding:0;
				height:100%;
			}
			div.container{
				width:1000px;
				height:100%;
				margin:0 auto;
			}
			div.container div.overview{
				width:100%;
				height:300px;
			}
			
			div.part{
				width:100%;
				position:relative;
			}
			
			div.overview div.part{
				width:300px;
				height:300px;
				float: left;
				margin-right:31px;
			}
			div.overview div.chart{
				width:300px;
				height:300px;
				float: left;
				margin-right:31px;
			}

			div.container div.overview div.tip{
				width:100%;
				height:30px;
				position: absolute;
				text-align: center;
				line-height: 30px;
				bottom: 20px;
			}
		
			
			div.container div.details{
				/* overflow-y: scroll; */
			}
			
			
			div.container div.details{
				width:100%;
			}
			
			div.details div.list{
				width:100%;
				height:calc(100% - 50px);
				margin-top:50px;
			}
		</style>
	</head>
	<body>
		<div class="container" id="container">
			<h3>集群资源使用情况</h3>
			<div class="overview" id="overview">
				<div class="part" id="mem-part">
					<div class="chart" id="mem-chart"></div>
					<div class="tip" id="mem-tip">64G/256G</div>
				</div>
				<div class="part" id="cpu-part">
					<div class="chart" id="cpu-chart"></div>
					<div class="tip" id="cpu-tip"></div>
				</div>
				<div class="part" id="disk-part">
					<div class="chart" id="disk-chart"></div>
					<div class="tip" id="disk-tip">2.1T/19T</div>
				</div>
			</div>
			<h3>集群各节点资源使用情况</h3>
			<div class="details" id="details">
				<div class="list" id="list">
					<table class="table table-border table-bordered table-bg table-hover table-sort">
						<thead>
							<tr class="text-c">
								<th>节点名称</th>
								<th>IP地址</th>
								<th>CPU</th>
								<th>内存</th>
								<th>存储</th>
							</tr>
						</thead>
						<tbody id="t_body" class="text-c">
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	
		<!-- <script type="text/javascript">
			$("#details").height($("#container").height() - $("#overview").height());
		
		</script> -->
		
<script type="text/javascript">
		function drawOverviewGauge(){
			var cpu_chart = echarts.init(document.getElementById("cpu-chart"));
			var mem_chart = echarts.init(document.getElementById("mem-chart"));
			var disk_chart = echarts.init(document.getElementById("disk-chart"));
			var cpu_option = {

			    series : [
			        {
			        	axisLine: {            // 坐标轴线
                			 lineStyle: {       // 属性lineStyle控制线条样式
                    			width: 10
                		  	 }
            			},
            			axisTick: {            // 坐标轴小标记
                			length :5,        // 属性length控制线长
                			
                		},
                		
                		splitLine: {           // 分隔线
                			length :20,         // 属性length控制线长
               				lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                    			color: 'auto'
                			}
            			},
                		
			            name:'CPU占用率',
			            type:'gauge',
			            detail : {formatter:'{value}%'},
			            data:[{value: overview.CPU_USAGE * 100, name: 'CPU占用率'}]
			        }
			    ]
			};
			
			var mem_option = {

				    series : [
				        {
				        	axisLine: {            // 坐标轴线
	                			 lineStyle: {       // 属性lineStyle控制线条样式
	                    			width: 10
	                		  	 }
	            			},
	            			axisTick: {            // 坐标轴小标记
	                			length :5,        // 属性length控制线长
	                			
	                		},
	                		
	                		splitLine: {           // 分隔线
	                			length :20,         // 属性length控制线长
	               				lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
	                    			color: 'auto'
	                			}
	            			},
	                		
				            name:'内存使用率',
				            type:'gauge',
				            detail : {formatter:'{value}%'},
				            data:[{value: overview.MEM_USAGE * 100, name: '内存使用率'}]
				        }
				    ]
				};
			
			var disk_option = {

				    series : [
				        {
				        	axisLine: {            // 坐标轴线
	                			 lineStyle: {       // 属性lineStyle控制线条样式
	                    			width: 10
	                		  	 }
	            			},
	            			axisTick: {            // 坐标轴小标记
	                			length :5,        // 属性length控制线长
	                			
	                		},
	                		
	                		splitLine: {           // 分隔线
	                			length :20,         // 属性length控制线长
	               				lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
	                    			color: 'auto'
	                			}
	            			},
	                		
				            name:'存储使用率',
				            type:'gauge',
				            detail : {formatter:'{value}%'},
				            data:[{value: overview.DISK_USAGE * 100, name: '存储使用率'}]
				        }
				    ]
				};
			
			cpu_chart.setOption(cpu_option);
			mem_chart.setOption(mem_option);
			disk_chart.setOption(disk_option);
			
			$.ajax({
				url:'<%=request.getContextPath() %>/cluster/overview.do',
				type:'POST',
				success:function(rd){
					rd = eval("("+rd+")");
					if(rd.SUCCESS){
						cpu_option.series[0].data[0].value = (rd.CPU_USAGE*1).toFixed(2) - 0;
						cpu_chart.setOption(cpu_option, true);
						mem_option.series[0].data[0].value = (rd.MEM_USAGE*100).toFixed(2) - 0;
						mem_chart.setOption(mem_option, true);
						disk_option.series[0].data[0].value = (rd.DISK_USAGE*100).toFixed(2) - 0;
						disk_chart.setOption(disk_option, true);
						console.log(rd.MEM_USED);
						console.log(rd.MEM_TOTAL);
						$("#mem-tip").html(formatValue(rd.MEM_USED) + " / " +formatValue(rd.MEM_TOTAL));
						$("#disk-tip").html(formatValue(rd.DISK_USED) + " / " +formatValue(rd.DISK_TOTAL));
					}
				}
			});
			
			timeTicket = setInterval(function (){
				$.ajax({
					url:'<%=request.getContextPath() %>/cluster/overview.do',
					type:'POST',
					success:function(rd){
						rd = eval("("+rd+")");
						if(rd.SUCCESS){
							cpu_option.series[0].data[0].value = (rd.CPU_USAGE*1).toFixed(2) - 0;
							cpu_chart.setOption(cpu_option, true);
							mem_option.series[0].data[0].value = (rd.MEM_USAGE*100).toFixed(2) - 0;
							mem_chart.setOption(mem_option, true);
							disk_option.series[0].data[0].value = (rd.DISK_USAGE*100).toFixed(2) - 0;
							disk_chart.setOption(disk_option, true);
						}
					}
				});
			},5000);

			
		}		
		
		(function getValueToDraw(){
			drawOverviewGauge();
		})()
		
		function drowTable(hosts){
			var elems = "";
			for(var i = 0;i<hosts.length;i++){
				elems += "<tr>" +
						 "<td>"+
						 hosts[i]["HOSTNAME"]+
						 "</td>"+
						 "<td>"+
						 hosts[i]["IP"]+
						 "</td>"+
						 "<td>"+
						 (hosts[i]["CPU_USAGE"] * 1).toFixed(3)+"%"+
						 "</td>"+
						 "<td>"+
						 formatValue(hosts[i]["MEM_USED"]) + " / " + formatValue(hosts[i]["MEM_TOTAL"])+
						 "</td>"+
						 "<td>"+
						 formatValue(hosts[i]["DISK_USED"]) + " / " + formatValue(hosts[i]["DISK_TOTAL"])+
						 "</td>"+
						 "</tr>";
			}
			console.log(elems);
			$("#t_body").html($(elems));
		}
		
		$.ajax({
			url:'<%=request.getContextPath() %>/cluster/details.do',
			type:'POST',
			success:function(rd){
				rd = eval("("+rd+")");
				console.log(rd);
				drowTable(rd["HOSTS"]);
			}
		});
		
		setInterval(function(){
			$.ajax({
				url:'<%=request.getContextPath() %>/cluster/details.do',
				type:'POST',
				success:function(rd){
					rd = eval("("+rd+")");
					console.log(rd);
					drowTable(rd["HOSTS"]);
				}
			});
		}, 5000)
		
		function formatValue(value){
			console.log(value);
			var value = value * 1.0;
			return value / 1024 < 1 ? value.toFixed(2) + "KB" :
				value/1024/1024 < 1 ? (value / 1024).toFixed(2) + "MB":
					value / 1024 /1024 /1024 < 1 ? (value/1024/1024).toFixed(2) +"GB":
						value / 1024 /1024 /1024 /1024 < 1 ? (value /1024 /1024/ 1024).toFixed(2) + "TB":
							value / 1024 /1024 /1024 /1024 /1024< 1?(value /1024/1024/1024/1024).toFixed(2) + "PB":
								(value /1024/1024/1024/1024).toFixed(2) + "PB";
		}
	</script>
</body>
</html>
