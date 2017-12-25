<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
  <script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/jquery/1.9.1/jquery.min.js"></script> 

    <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/css/lib/utf8-jsp/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/css/lib/utf8-jsp/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/css/lib/utf8-jsp/lang/zh-cn/zh-cn.js"></script>

    <style type="text/css">
        div{
            width:100%;
        }
        a.btn{
        	width:100px;
        	height:40px;
        	display: block;
        	border-radius:3px;
        	text-align: center;
        	line-height:40px;
        	background: skyblue;
        	margin:20px auto;
        	color:#fff;
        	font-family: "微软雅黑";
        	cursor: pointer;
        }
    </style>
</head>

<body>
	<center style="margin:25px 0;font-family:'微软雅黑'">标题：<input id="title" type="text" style="width:300px;height:25px;"/></center>
	<script type="text/plain" id="editor" style="width:100% ;height:300px;"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/css/lib/layer/2.1/layer.js"></script>
	<a onclick="verify()" class="btn">发布公告</a>
	<script type="text/javascript">
	function verify(){
		if(verifyy()){
			getContent()
		}
	}
	function verifyy(){
		var title = document.getElementById("title").value;
		if (title = null || title == "") {
			alert(" 公告题目不能为空");
			return false;}
		else{
			return true;
		}
	}
	var ue = UE.getEditor('editor',{
		toolbars:[
			[
				'anchor', //锚点
				'undo', //撤销
				'redo', //重做
				'bold', //加粗
				'indent', //首行缩进
				'italic', //斜体
				'underline', //下划线
				'strikethrough', //删除线
				'subscript', //下标
				'fontborder', //字符边框
				'superscript', //上标
				'formatmatch', //格式刷
				'blockquote', //引用
				'pasteplain', //纯文本粘贴模式
				'selectall', //全选
				'print', //打印
				'preview', //预览
				'horizontal', //分隔线
				'removeformat', //清除格式
				'time', //时间
				'date', //日期
				'unlink', //取消链接
				'insertrow', //前插入行
				'insertcol', //前插入列
				'mergeright', //右合并单元格
				'mergedown', //下合并单元格
				'deleterow', //删除行
				'deletecol', //删除列
				'splittorows', //拆分成行
				'splittocols', //拆分成列
				'splittocells', //完全拆分单元格
				'deletecaption', //删除表格标题
				'inserttitle', //插入标题
				'mergecells', //合并多个单元格
				'deletetable', //删除表格
				'cleardoc', //清空文档
				'insertparagraphbeforetable', //"表格前插入行"
				'insertcode', //代码语言
				'fontfamily', //字体
				'fontsize', //字号
				'paragraph', //段落格式
				'edittable', //表格属性
				'edittd', //单元格属性
				'link', //超链接
				'spechars', //特殊字符
				'searchreplace', //查询替换
				'help', //帮助
				'justifyleft', //居左对齐
				'justifyright', //居右对齐
				'justifycenter', //居中对齐
				'justifyjustify', //两端对齐
				'forecolor', //字体颜色
				'backcolor', //背景色
				'insertorderedlist', //有序列表
				'insertunorderedlist', //无序列表
				'fullscreen', //全屏
				'directionalityltr', //从左向右输入
				'directionalityrtl', //从右向左输入
				'rowspacingtop', //段前距
				'rowspacingbottom', //段后距
				'pagebreak', //分页
				'insertframe', //插入Iframe
				'imagenone', //默认
				'imageleft', //左浮动
				'imageright', //右浮动
				'imagecenter', //居中
				'lineheight', //行间距
				'edittip ', //编辑提示
				'customstyle', //自定义标题
				'autotypeset', //自动排版
				'touppercase', //字母大写
				'tolowercase', //字母小写
				'template', //模板
				'inserttable', //插入表格
				'drafts', // 从草稿箱加载
				'charts', // 图表
				'attachment', //附件
			 ],
		],
	});
	function getContent() {
		var data = {
			"notice_title":$("#title").val(),
			"notice_content":UE.getEditor('editor').getContent()
		};
		$.ajax({
			type:'post',
			url:'<%=request.getContextPath()%>/notice/create_notice',
			data:data,
			success:function(resultData){
				alert(resultData.res == 'suc');
				if (resultData.res == 'suc') {
					$("#title").val("");
					ue.execCommand('cleardoc');
					layer.msg("公告添加成功",{icon:1,time:1000});
					parent.location.reload();
				}
				else {
					layer.msg("公告添加失败",{icon:1,time:1000});
				}
				
			}
		});
    }
	</script>
</body>
</html>