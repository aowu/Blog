<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>testforcomment</title>
	
	
	
	<link rel="stylesheet" href="<%=basePath%>byaowu/style.css">

	<link ref="stylesheet" href="<%=basePath%>byaowu/shCoreDefault.css">
	<link ref="stylesheet" type="text/css" href="<%=basePath%>byaowu/embed.bluebox.css">
	<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
	<script src="<%=basePath%>byaowu/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>byaowu/util.js"></script>
    <script type="text/javascript" src="<%=basePath%>byaowu/index.js"></script>
    <script>var duoshuoQuery = {short_name:"cononico"};</script>
    <script src="<%=basePath%>byaowu/embed.js"></script>
    <script src="<%=basePath%>byaowu/shCore.js"></script>
    <script src="<%=basePath%>byaowu/jquery.pjax.js"></script>
    <script src="<%=basePath%>byaowu/pjax-loading.js"></script>
    <script src="<%=basePath%>byaowu/tagcanvas.min.js"></script>
		
	<style type="text/css">
		#ds-thread #ds-reset .ds-comment-body, #ds-thread #ds-reset ul.ds-children .ds-comment-body {
    padding-left: 70px;
}


#ds-reset .ds-avatar img {
    display: block;
    width: 50px;
    height: 50px;
    max-width: none;
    box-shadow: 0 1px 3px rgba(0,0,0,0.22);
    -webkit-border-radius: 0;
    border-radius: 0;
    border-radius: 50%;
    border: 3px solid #e7e7e7;
}


#ds-thread #ds-reset .ds-replybox .ds-avatar img {
    width: 50px;
    height: 50px;
    visibility: visible;
    margin: 0;
    border: 3px solid #e7e7e7;
}


#ds-thread #ds-reset .ds-replybox {
    padding: 0 0 0 75px;
    margin: 0;
}


#ds-thread #ds-reset .ds-replybox .ds-avatar {
    margin: 0;
}


#ds-thread.ds-narrow #ds-reset .ds-comment-body, #ds-thread.ds-narrow #ds-reset .ds-replybox {
    padding-left: 60px;
}


#ds-thread.ds-narrow #ds-reset .ds-avatar img {
    width: 50px;
    height: 50px;
}

#ds-thread #ds-reset ul.ds-children .ds-avatar {
    width: 50px;
    height: 50px;
}

#ds-thread #ds-reset ul.ds-children .ds-avatar img {
    width: 50px;
    height: 50px;
}
	
#commentText {
	resize: none;
	width: 100%;
	height:150px;
	max-height:150px;
}	

#fashe{
	
}
	
	</style>
		

<!-- <script type="text/javascript">
	function myfun(){
		
		$.ajax({
			type:"post",
			url:"/1/comment",
			contentType:"application/json",
			dataType:"json",
			data:current=1,
			date:{},
			success:function(date){
				var list = date.list
				for(var p in list){ alert(p);}
				
			}
		
		 
		});
		
		alert("aowu~this is a test!");
	}

	window.onload = myfun;
</script> -->

</head>
<body>
	<!-- <div ng-app="myApp" ng-controller="sitCtrl">
		<ul>
			<li ng-repeat="x in list" >
				{{x.fcommentname}}
				{{','+x.commentinfo+','}}
				{{x.commenttime | date:'yyyy-MM-dd HH:mm:ss'}}
				<ul>
					<li ng-repeat="y in x.replys">
						{{y.preplyname +'回复' + y.freplyname}}
						{{y.replyinfo}}
						{{y.replytime | date:'yyyy-MM-dd HH:mm:ss'}}
					</li>
					
				</ul>
			</li>
			
		</ul>
	
	</div> -->
	
	
<div ng-app="myApp" ng-cloak>
	
	<div id="ds-thread"   ng-controller="sitCtrl">
		用户<input type="text" ng-model="pid">
		<button ng-click="sayHello()">gogogo</button>
		{{greeting}}
		<div>
			<form name="myform" action="" method="post">
			<input  name="pcommentid" ng-model="ppid" ng-show="false">
			<input type="hidden" name="fcommentid" value="${userid}" >
			<div class="ds-textarea-wrapper ds-rounded-top" >
			<textarea id="commentText" name="commentinfo">
			</textarea>
			<pre class="ds-hidden-text"></pre>
			</div>
			<div class="ds-post-toolbar">
			<div class="ds-post-options ds-gradient-bg">
				
			</div>
			
			<!-- <button class="ds-post-button" type="submit" id="fashe" ng-click="comment">发射</button> -->
			<input type="submit" value="发射">
			</div>
			
		</form>
		</div>
		<div id="ds-reset" ng-repeat="x in list">
		<ul class="ds-comments">
		<li class="ds-post">
		<div class="ds-post-self" data-post-id="">
			<div class="ds-avatar" data-user-id="">
				<a rel="" target="" href="" onclick="" title="蓝色初夏">
					<img src="" alt="">
				</a>
			</div>
			<div class="ds-comment-body">
				<div class="ds-comment-header">
					<a class="ds-user-name ds-highlight" data-qqt-account href="" onclick="" rel="nofollow" target="_blank" data-user-id="">{{x.fcommentname}}</a>
				</div>
				<p>{{x.commentinfo}}</p>
				<div class="ds-comment-footer ds-comment-actions">
					<span class="ds-time" >{{x.commenttime | date:'yyyy-MM-dd HH:mm:ss'}}</span>
					<a class="ds-post-reply" href="">
						<span class="ds-icon ds-icon-reply"></span>
						"回复"
					</a>
				</div>
			</div>
		</div>
				<ul class="ds-children" >
				<li class="ds-post" ng-repeat="y in x.replys">
				<div class="ds-post-self" data-post-id="">
					<div class="ds-avatar" data-user-id="">
						<a rel="" target="" href="" onclick="" title="蓝色初夏">
							<img src="" alt="">
						</a>
					</div>
					<div class="ds-comment-body">
						<div class="ds-comment-header">
							<a class="ds-user-name ds-highlight" data-qqt-account href="" onclick="" rel="nofollow" target="_blank" data-user-id="">{{y.preplyname +'回复' + y.freplyname}}</a>
						</div>
						<p>{{y.replyinfo}}</p>
						<div class="ds-comment-footer ds-comment-actions">
							<span class="ds-time" >{{y.replytime | date:'yyyy-MM-dd HH:mm:ss'}}</span>
							<a class="ds-post-reply" href="">
								<span class="ds-icon ds-icon-reply"></span>
								"回复"
							</a>
						</div>
					</div>
				</div> 
				</li>
				</ul>
		 
		</li>
		</ul>
		</div>
	</div>
	
	
	
	
	
	
	
	<script>
		/* 遍历评论 */
		
		 
		var app = angular.module('myApp',[]);
		app.controller('sitCtrl', function($scope, $http){
			
			$scope.pid = ${userid};
			$scope.ppid = $scope.pid;
			$scope.sayHello = function() {
	            $scope.greeting = "Hello~" + $scope.pid + "!";
	            $scope.ppid = $scope.pid;
	            var url = 'http://localhost/'+$scope.pid+'/comment';
				$http({
					method : 'POST',
					url	   : url
					/*headers*/
				}).success(
						function(response, status, headers, config){
							
							/* alert("success"); */
							
							$scope.datas = response;
							
							/* alert(JSON.stringify($scope.datas)); */ 
							
							$scope.list = $scope.datas.list;
							
							$scope.listr = $scope.datas.list.replys
							
							/* alert(JSON.stringify($scope.datas.list[0].replys)) */
							
						});
	        };
			var url = 'http://localhost/'+$scope.pid+'/comment';
			$http({
				method : 'POST',
				url	   : url
				/*headers*/
			}).success(
					function(response, status, headers, config){
						
						/* alert("success"); */
						
						$scope.datas = response;
						
						/* alert(JSON.stringify($scope.datas.count)); */
						
						$scope.list = $scope.datas.list;
						
						$scope.listr = $scope.datas.list.replys
						
						/* alert(JSON.stringify($scope.datas.list[0].replys)) */
						
					});
		})
			
		
		
		var urlz = '/'+${userid}+"/comment/insert";
		alert(urlz);
		document.myform.action = urlz;
		
		
		
		
			
		
	
	</script>
	
	
    
	
	
</body>
</html>