<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/webuploader/webuploader.css">

<title>首页</title>
<style>
html{
	font-family: "微软雅黑";
}
div.container{
	width:200px;
	margin:0 auto;
}
.btn{
	width:50px;
	color:#fff;
	background: #dd514c;
	border:none;
	height:30px;
	line-height:30px;
	border-radius:3px;
}
</style>
</head>
<body>
	<div class="container">
		<div id="uploader" class="wu-example">
	    <!--用来存放文件信息-->
	    <div id="thelist" class="uploader-list"></div>
	    <div class="btns">
	        <div id="picker">选择文件</div><div style="font-size:14px;color:red;position:relative;top:-40px;left:100px;">*上传文件类型为evt</div>      
	    </div>
	    <div><button id="ctlBtn" class="btn btn-default">开始上传</button></div>
	    <input id="path" type="hidden" value="${path}"/> 
		</div>
	</div>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/css/webuploader/webuploader.js"></script>
<script type="text/javascript">

jQuery(function() {
	
    /* var path = $('#path'); */
    var $ = jQuery,
        $list = $('#thelist'),
        $btn = $('#ctlBtn'),
        $path = $('#path');
        state = 'pending',
        uploader;
    uploader = WebUploader.create({
		
    	 swf:  'webuploader/Uploader.swf',

        resize: false,


        server: "${pageContext.request.contextPath}/upload/bigfile?path="+$path.attr("value"),


        pick: '#picker'
    });


    uploader.on( 'fileQueued', function( file ) {
        $list.append( '<div id="' + file.id + '" class="item">' +
            '<h4 class="info">' + file.name + '</h4>' +
            '<p class="state">等待上传...</p>' +
        '</div>' );
    });


    uploader.on( 'uploadProgress', function( file, percentage ) {
        var $li = $( '#'+file.id ),
            $percent = $li.find('.progress .progress-bar');
			console.log($percent.length);
			console.log(percentage);
       /*  if (!$percent.length ) {
            $percent = $('<div class="progress progress-striped active">' +
              '<div class="progress-bar" role="progressbar" style="width: 0% height:10px">' +
              '</div>' +
            '</div>').appendTo( $li ).find('.progress-bar');
        } */
        
        if (!$percent.length ) {
           $("<div class='"+file.id+"'></div>").appendTo( $li );
        }
     	$li.find('p.state').text('上传中...');
	
      	$("."+file.id)[0].innerHTML = (percentage * 100).toFixed(0) + '%' ;
    });

    uploader.on( 'uploadSuccess', function( file ) {
        $( '#'+file.id ).find('p.state').text('上传成功');
    });

    uploader.on( 'uploadError', function( file ) {
        $( '#'+file.id ).find('p.state').text('上传成功');
    });

    uploader.on( 'uploadComplete', function( file ) {
        $( '#'+file.id ).find('.progress').fadeOut();
    });

    uploader.on( 'all', function( type ) {
        if ( type === 'startUpload' ) {
            state = 'uploading';
        } else if ( type === 'stopUpload' ) {
            state = 'paused';
        } else if ( type === 'uploadFinished' ) {
            state = 'done';
        }

        if ( state === 'uploading' ) {
            $btn.text('上传中');
        } else {
            $btn.text('上传');
        }
    });

    $btn.on( 'click', function() {
    	debugger;
        if ( state === 'uploading' ) {
            uploader.stop();
        } else {
        	var flag = true;
        	$(".info").each(function(){
        		console.log($(this).html().split(".")[$(this).html().split(".").length - 1]);
        		if(!($(this).html().split(".")[$(this).html().split(".").length - 1] == "evt")){
        			flag = false;
        		}
        	});
        	if(flag){
        		uploader.upload();
        	}else{
        		alert("必须上传evt文件");
        	}
            
        }
    });
});

	

</script>
</body>
</html>