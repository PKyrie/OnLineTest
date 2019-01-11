<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="style/css/pintuer.css">
<link rel="stylesheet" href="style/css/admin.css">
<script src="style/js/jquery.js"></script>
<script src="style/js/pintuer.js"></script>


</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add">
  	<strong><span class="icon-pencil-square-o"></span>新增多选题</strong>
  </div>
  <div class="body-content">
    <form method="post" class="form-x" action="newMoreQuestion">  
         
        <div class="form-group">
          <div class="label">
            <label>题干：</label>
          </div>
          <div class="field">
          	<textarea name="stemContent" class="input" style="height:130px;border:1px solid #ddd;"></textarea>
            <div class="tips"></div>
          </div>
        </div>
      
      <div class="clear"></div>
      <div class="form-group">
        <div class="label">
          <label>分值：</label>
        </div>
        <div class="field">
          <input id="scoreInput" type="number" class="input" value="1" name="score" onchange="scoreCallBack()" />
          <div class="tips"></div>
        </div>
      </div> 
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" onclick="addOption()" type="button">新增选项：</button>
        </div>
      </div>
	  <div id="optBox">
		<div class="form-group">
        	<div class="label">选项A:
        	</div>
        	<div class="field">
         	 <input type="text" class="input" name="options" value="" />
        	</div>
      	</div> 
      	<!-- <div class="form-group">
        	<div class="label">选项B:
        	</div>
        	<div class="field">
         	 <input type="text" class="input" name="options" value="" />
        	</div>
      	</div>  -->
	  </div>
		
   
      <div class="form-group">
        <div class="label">
          <label>正确答案：</label>
        </div>
        <div class="field">
          	<!-- <ul id="choose">  
			   <li><label><input name="answer" type="checkbox" value="0">A</label></li>
			   <li><label><input name="answer" type="checkbox" value="1">B</label></li>
			</ul> -->
				
			<table id="checkboxAll">
				<label><input id="choose" name="answer" type="checkbox" value="0">A</label><br>
				<!-- <label><input name="answer" type="checkbox" value="1">B</label> -->
			</table>
          
          <div class="tips"></div>
        </div>
      </div>       
  
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

<script type="text/javascript">
	var optIndex = 1;
	//增加选项内容
	function addOption(){
		var c = String.fromCharCode(65 + optIndex);
		$("#optBox").append(
			"<div class='form-group'>"
				+"<div class='label'>选项"+c+":</div>"
				+"<div class='field'>"
					+"<input type='text' class='input' name='options' value='' />"
				+"</div>"
			+"</div>"		
		);
		$("#checkboxAll").append("<label><input type='checkbox' value='"+optIndex+"'>"+c+"</label><br>");
		optIndex++;
	}
	//对分数设置的监听，分数不能低于1
	function scoreCallBack(){
		if($("#scoreInput").val()<1){
			$("#scoreInput").val("1");
		}
	}
	//选择选项
	$("#checkboxAll").click(function(){  
		if(this.checked){  
		     $("#choose :checkbox").prop("checked", true);  
		}else{ 
		     $("#choose :checkbox").prop("checked", false);
		}   
	});

</script>

</body>
</html>
