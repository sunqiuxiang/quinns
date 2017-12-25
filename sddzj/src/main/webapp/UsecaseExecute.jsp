<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>企业认证</title>
<script type="text/javascript" src="D:/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="D:/jquery-easyui-1.4.1/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="D:/jquery-easyui-1.4.1/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
function ons() {
	alert("${pageContext.request.contextPath }");
}
</script>
</head>
<body onload="ons()">
<div style="float:left; height:480px; width:400px; margin: 20px 15px">
	<div class="easyui-panel" title="测试机器" style="height:100%;width:100%; padding:10px 60px;">
		<select id="sequence" class="easyui-combobox" label="执行顺序：" labelPosition="top" style="width:100%;">
			<option value="true">顺序</option>
			<option value="false">乱序</option>
		</select>
		<select id="timeout" class="easyui-combobox" label="超时时间：" labelPosition="top" style="width:100%;">
			<option value="10000">10000</option>
			<option value="20000">20000</option>
			<option value="30000">30000</option>
		</select>
		<select id="instance" class="easyui-combobox" label="是否按实例分组：" labelPosition="top" style="width:100%;">
			<option value="false">否</option>
			<option value="true">是</option>
		</select>
		<select id="skip" class="easyui-combobox" label="是否跳过失败的调用：" labelPosition="top" style="width:100%;">
			<option value="false">否</option>
			<option value="true">是</option>
		</select>
		<select id="testtype" class="easyui-combobox" label="测试类型：" labelPosition="top" style="width:100%;">
			<option value="performancetest">性能测试</option>
			<option value="unittest">单元测试</option>
		</select>
		<select id="macuse" class="easyui-combobox" label="机器使用方式：" labelPosition="top" style="width:100%;">
			<option value="false">一台机器执行所有测试</option>
			<option value="true">一台机器执行一个test</option>
		</select>
		<input id="macnum" class="easyui-textbox" value="1" label="机器数量：" labelPosition="top" style="width: 100%; height: 45px">
		<input type="button" id="suite"/>申请测试机器
	</div>
</div>
<div style="float:right; height:480px; width:400px; margin: 20px 15px;">
	<div class="easyui-panel" title="测试用例" style="height:100%;width:100%; padding:10px 60px;">
		<form action="http://211.64.127.212:30048/YunTest/test.action" method="post" enctype="multipart/form-data" target="framFile">
			<input id="time" name="time" type="hidden">
			<input id="suiteid" name="suiteid" type="hidden">
			<input id="testtype" name="testtype" type="hidden">
			<input id="sqx" name="testtype" type="">
			<input id="pronum" name="pronum" class="easyui-textbox" value="1" label="线程数量：" labelPosition="top" style="width: 100%; height: 45px">
			<select id="operate" name="operate" class="easyui-combobox" label="执行方式：" labelPosition="top" style="width:100%;">
				<option value="false">串行</option>
				<option value="classes">类并行</option>
				<option value="methods">方法并行</option>
			</select>
			<select id="returnvalue" name="returnvalue" class="easyui-combobox" label="是否允许返回函数值：" labelPosition="top" style="width:100%;">
				<option value="false">否</option>
				<option value="true">是</option>
			</select>
			<input id="file" name="file" class="easyui-filebox" label="上传测试用例（.java）" labelPosition="top" data-options="prompt:'选择用例文件'" style="width:100%">
			<a id="test" class="easyui-linkbutton" onclick=" document.forms[0].submit()" data-options="iconCls:'icon-ok',disabled:true" style="width: 100%; height: 32px; margin-top: 10px; float: left;">上传测试用例</a>
		</form>
		<iframe id="framFile" name="framFile" style="height:150px;width:100%; margin-top:10px; padding:10px 0px;" >
			
		</iframe>
		<div style="height: 100px; width: 100px;">
			
		</div>
		<!-- <td id="more">
			<input type="hidden" name="param" value="1"/> <input
			type="file" name="file" /> <input type="button" value="Add More..."
			onclick="addMore();" />
		</td> -->
	</div>
</div>
<script type="text/javascript">
function say() {
	alert(1111);
}
	function param() {
		var name, value;
		var str = location.href; //取得整个地址栏
		var num = str.indexOf("?")
		str = str.substr(num + 1); //取得所有参数   stringvar.substr(start [, length ]
		alert(str);
		var arr = str.split("&"); //各个参数放到数组里
		for (var i = 0; i < arr.length; i++) {
			num = arr[i].indexOf("=");
			if (num > 0) {
				name = arr[i].substring(0, num);
				value = arr[i].substr(num + 1);
				this[name] = value;
			}
		}
	}
	
	function addMore() {
        var td = document.getElementById("more");//获取id="more"的元素，该元素用于容纳动态增减的上传文件元素
        
        var br = document.createElement("br");//创建<br />元素
        var input = document.createElement("input");//创建<input>元素，设置该元素的属性为<input type="file" name="file" />，用于选择上传的文件
        var button = document.createElement("input");//创建<input>元素,设置该元素的属性为<input type="button" value="remove" />，用于移除上传标签
        
/*         input.setAttribute("type", "file");
		input.setAttribute("name", "file"); */
		input.type = "file";
        input.name = "file"; 
        
        button.type = "button";
        button.value = "remove";
        
        //移除上传标签
        button.onclick = function()
        {
            td.removeChild(br);
            td.removeChild(input);
            td.removeChild(button);
        };
        
        /*
         * 添加上传标签
         */
        td.appendChild(br);
        td.appendChild(input);
        td.appendChild(button);
    }
	$('#suite').click(function(){
		if ($('#suite').linkbutton('options').disabled == true) {
			return;
		}
		$.ajax({
			type:"get",
			async:false,
			url:"http://211.64.127.212:30048/YunTest/suite.action",
			data:{
				sequence:$('#sequence').val(),
				timeout:$('#timeout').val(),
				instance:$('#instance').val(),
				skip:$('#skip').val(),
				testtype:$('#testtype').val(),
				macuse:$('#macuse').val(),
				macnum:$('#macnum').val()
			},
			success:function(data){

				alert("success");
				
				$('#suite').linkbutton('disable');
				$('#test').linkbutton('enable');
				
				$("#time").val(data.suite.time);
				$("#testtype").val(data.suite.testtype);
				$("#suiteid").val(data.suite.suiteid);
				
				/* $('#test').click(function(){
					alert(123456);
					$.ajaxFileUpload({
						url:'http://211.64.127.212:30048/YunTest/test.action',  
			            secureuri:false,  
			            fileElementId:'file',//file标签的id  
			            dataType: 'json',//返回数据的类型  
			            data:{
			            	pronum:$('#pronum').val(),
							operate:$('#operate').val(),
							returnvalue:$('#returnvalue').val(),
							time:data.suite.time,
							testtype:data.suite.testtype,
							suiteid:data.suite.suiteid
						},//一同上传的数据  
			            success: function (data, status) {  
			            	alert("成功");
			            },  
			            error: function (data, status, e) {  
			                alert(e);  
			            }  
			        });
				}); */
				
			},
			error:function(){
				alert("error");
			}
			
		});
	});
	
	$('iframe').on('load', function() {
		/* alert($('iframe')[0].contentWindow.document.body); */
		/* 
		var responseText = $('iframe')[0].contentDocument.body.textContent;
		alert(2);
		var responseData = JSON.parse(responseText) || {}; */
	});
</script>
</body>
</html>