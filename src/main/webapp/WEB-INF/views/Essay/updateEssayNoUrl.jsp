<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css"
			href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>css/theme.css">
		<link rel="stylesheet"
			href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
		<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
		<script src="<%=basePath%>jslib/jquery-1.7.2.min.js"
			type="text/javascript"></script>
		<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
	
}

.brand {
	font-family: georgia, serif;
	
}

.brand .first {
	color: #ccc;
	font-style: italic;
	
}

.brand .second {
	color: #fff;
	font-weight: bold;
	
}

.row-fluid{
	height:600px;
}

.dialog .block{
	height:330px;
}
	</style>
</head>
<body>

		<div class="row-fluid"ng-app="myApp" ng-cloak>
			<div class="dialog">
				<div class="block">
					<p class="block-heading">
						文章修改
					</p>
					<div class="block-body" ng-controller="form">
						<form  action="" name="myForm" method="post">
							
							<input type="hidden" name="esyid" value="${esyid}">
							<input type="hidden" name="userid" value="${userid}" >
							<label>
								文章名
							</label>
							<input type="text" name="esyname" class="span12" maxlength="20"  ng-model="esyname" >
							<label>
								文章状态
							</label>
							<input type="text" name="esysta" class="span12" maxlength="100" ng-model="esysta">
							<label>
								文章概述
							</label>
							<textarea class="span12" name="esysummary" ng-model="esysummary"></textarea>
							<input type="submit" class="btn btn-primary pull-right" value="提交" />
							
						</form>
					</div>
				</div>
			</div>
		</div>
		<script src="<%=basePath%>jslib/bootstrap/js/bootstrap.js"></script>
		
		<script>
		var a = ${esyid}
		var app = angular.module('myApp',[]);
		var urlz =  '/1/'+a+'/getessay';
		/* alert(urlz); */
		app.controller('form', function($scope, $http){
			$http({
				method : 'POST',
				url	   : urlz
			}).success(function(response, status, headers, config){
				
				$scope.datas = response;
				alert($scope.datas.esyname);
				$scope.esyname = $scope.datas.esyname;
				$scope.esysta = $scope.datas.esysta;
				$scope.esysummary = $scope.datas.esysummary;
				$scope.esyid = a;
			});
		});
		
		
		
		var url = '/'+${userid}+'/'+ a + "/essay/updateessay";
		alert(url);
		document.myForm.action = url;
		
		</script>
</body>
</html>