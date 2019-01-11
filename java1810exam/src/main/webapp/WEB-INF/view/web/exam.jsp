<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<!-- 指定全页面的发送路径前缀 -->
<base href="<%=basePath %>">
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>在线考试系统</title>

<link href="<%=request.getContextPath() %>/webstyle/css/main.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/webstyle/css/iconfont.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/webstyle/css/test.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/webstyle/js/jquery-1.11.3.min.js"></script>

<!--时间js-->
<script src="<%=request.getContextPath() %>/webstyle/js/jquery.countdown.js"></script>
<!-- <script>
	$(function() {
		$('li.option').click(function() {
			var examId = $(this).closest('.test_content_nr_main').closest('li').attr('id'); // 得到题目ID
			var cardLi = $('a[href=#' + examId + ']'); // 根据题目ID找到对应答题卡
			// 设置已答题
			if(!cardLi.hasClass('hasBeenAnswer')){
				cardLi.addClass('hasBeenAnswer');
			}
			
		});
	});
	window.jQuery(function($) {
		"use strict";
		
		$('time').countDown({
			with_separators : false
		});
		$('.alt-1').countDown({
			css_class : 'countdown-alt-1'
		});
		$('.alt-2').countDown({
			css_class : 'countdown-alt-2'
		});
		
	});
	
	
	
</script> -->
<style>
.hasBeenAnswer {
	background: #5d9cec;
	color:#fff;
}
</style>

</head>
<body>
<div class="main">
	<!--nr start-->
	<div class="test_main">
		<div class="nr_left">
			<div class="test">
				<form action="" method="post">
					<div class="test_title">
						<p class="test_time">
							<i class="icon iconfont">&#xe6fb;</i><b class="alt-1">01:40</b>
						</p>
						<font><input type="button" name="test_jiaojuan" value="交卷"></font>
					</div>
					
						<div class="test_content">
							<div class="test_content_title">
								<h2>单选题</h2>
								<p>
									<span>共</span><i id="questionsCount" class="content_lit">60</i><span>题，</span><span>合计</span><i class="content_fs">60</i><span>分</span>
								</p>
							</div>
						</div>
						<div class="test_content_nr">
							<ul id="questionU">
								
									<li id="qu_0_0">
										<div class="test_content_nr_tt">
											<i>1</i><span>(1分)</span><font>在生产管理信息系统中，下列操作步骤能正确将工单推进流程的是（  ）</font><b class="icon iconfont">&#xe881;</b>
										</div>

										<div class="test_content_nr_main">
											<ul>
													<li class="option">
															<input type="radio" class="radioOrCheck" name="answer1"
																id="0_answer_1_option_1"/>
														<label for="0_answer_1_option_1">
															A.
															<p class="ue" style="display: inline;">在工具栏中点击“workflow”标签</p>
														</label>
													</li>
													<li class="option">
															<input type="radio" class="radioOrCheck" name="answer1"
																id="0_answer_1_option_2"/>
														<label for="0_answer_1_option_2">
															B.
															<p class="ue" style="display: inline;">在缺陷单界面中点击“推进流程”按钮</p>
														</label>
													</li>
													<li class="option">
															<input type="radio" class="radioOrCheck" name="answer1"
																id="0_answer_1_option_3"/>
														<label for="0_answer_1_option_3">
															C.
															<p class="ue" style="display: inline;">在缺陷单界面中点击“提交”按钮</p>
														</label>
													</li>
													<li class="option">
															<input type="radio" class="radioOrCheck" name="answer1"
																id="0_answer_1_option_4"/>
														<label for="0_answer_1_option_4">
															D.
															<p class="ue" style="display: inline;">后台启动流程推进</p>
														</label>
													</li>
											</ul>
										</div>
									</li>
							</ul>
						</div>
					
						<div class="test_content">
							<div class="test_content_title">
								<h2>多选题</h2>
								<p>
									<span>共</span><i class="content_lit">30</i><span>题，</span><span>合计</span><i class="content_fs">30</i><span>分</span>
								</p>
							</div>
						</div>
						<div class="test_content_nr">
							<ul>
								
									<li id="qu_1_0">
										<div class="test_content_nr_tt">
											<i>1</i><span>(1分)</span><font>以下属于南方电网员工职业操守中明文规定的有()</font><b class="icon iconfont">&#xe881;</b>
										</div>

										<div class="test_content_nr_main">
											<ul>
												
													<li class="option">
														
														
															<input type="checkbox" class="radioOrCheck" name="answer1"
																id="1_answer_1_option_1"
															/>
														
														<label for="1_answer_1_option_1">
															A.
															<p class="ue" style="display: inline;">热爱祖国、热爱南网、热爱岗位</p>
														</label>
													</li>
												
													<li class="option">
														
														
															<input type="checkbox" class="radioOrCheck" name="answer1"
																id="1_answer_1_option_2"
															/>
														
														<label for="1_answer_1_option_2">
															B.
															<p class="ue" style="display: inline;">遵纪守法、忠于职守、令行禁止</p>
														</label>
													</li>
												
													<li class="option">
														
														
															<input type="checkbox" class="radioOrCheck" name="answer1"
																id="1_answer_1_option_3"
															/>
														
														<label for="1_answer_1_option_3">
															C.
															<p class="ue" style="display: inline;">客户至上、诚实守信、优质服务</p>
														</label>
													</li>
												
													<li class="option">
														
														
															<input type="checkbox" class="radioOrCheck" name="answer1"
																id="1_answer_1_option_4"
															/>
														
														<label for="1_answer_1_option_4">
															D.
															<p class="ue" style="display: inline;">公平竞争、互相监督、服从监管</p>
														</label>
													</li>
												
											</ul>
										</div>
									</li>
							</ul>
						</div>
					
				</form>
			</div>

		</div>
		<div class="nr_right">
			<div class="nr_rt_main">
				<div class="rt_nr1">
					<div class="rt_nr1_title">
						<h1>
							<i class="icon iconfont">&#xe692;</i>答题卡
						</h1>
						<p class="test_time">
							<i class="icon iconfont">&#xe6fb;</i><b class="alt-1">01:40</b>
						</p>
					</div>
					
						<div class="rt_content">
							<div class="rt_content_tt">
								<h2>单选题</h2>
								<p>
									<span>共</span><i class="content_lit">60</i><span>题</span>
								</p>
							</div>
							<div class="rt_content_nr answerSheet">
								<ul id="answerCardsingle">
										<li><a href="#qu_0_0">1</a></li>
								</ul>
							</div>
						</div>
					
						<div class="rt_content">
							<div class="rt_content_tt">
								<h2>多选题</h2>
								<p>
									<span>共</span><i class="content_lit">30</i><span>题</span>
								</p>
							</div>
							<div class="rt_content_nr answerSheet">
								<ul>
										<li><a href="#qu_1_0">1</a></li>
								</ul>
							</div>
						</div>
					
				</div>

			</div>
		</div>
	</div>
	<!--nr end-->
	<div class="foot"></div>
</div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">

</div>
</body>

<script type="text/javascript">
	$(function(){
		//获取试题并生成
		$.ajax({
			url:"getTestPaper",
			type:"post",
			data:{},
			dataType:'text',
			success:function(result){
				//得到试题
				var testp = val("("+result+")");
				
			},
			error:function(){
				//无法生成试题...
				alert(生成试题失败);
			}
		});
	});

</script>
</html>
