<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>功能列表</title>
	<link rel="stylesheet" type="text/css"
		href="<%=basePath%>jslib/bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css"
		href="<%=basePath%>css/theme.css">
	<link rel="stylesheet"
		href="<%=basePath%>jslib/font-awesome/css/font-awesome.css">
	<script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
	<script src="<%=basePath%>jslib/jquery-1.7.2.min.js" type="text/javascript"></script>
</head>
<body>
	<div class="container-fluid" ng-app="myapp" ng-cloak>
		<div class="row-fluid">
			<div class="span12">
				<table class="table">
					<thead>
						<tr>
							<th>
								功能id
							</th>
							<th>
								功能名
							</th>
							<th>
								功能地址
							</th>
							<th>
								功能状态
							</th>
							<th>
								父功能id
							</th>
							<th>
								父功能名
							</th>
							<th>
								编辑
							</th>
							<th>
								删除文章
							</th>
						</tr>
					</thead>
					<tbody ng-controller="tbody">
						<tr ng-repeat="x in list">
							<td>
								{{x.funid}}
							</td>
							<td>
								{{x.funname}}
							</td>
							<td>
								{{x.funurl}}
							</td>
							<td>
								{{x.funsta}}
							</td>
							<td>
								{{x.funpid}}
							</td>
							<td>
								{{x.funpname}}
							</td>
							<td>
								<a href="1/${w.esyid}/essay/updateesyinfo">编辑</a>
							</td>
							<td>
								<a href="">删除</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script>
		
		var url = '/'+${userid}+'/'+'getfunction'
		var app = angular.module('myapp',[]);
		app.controller('tbody',function($scope, $http){
			$http({
				method : 'POST',
				url	   : url
			}).success(function(response, status, headers, config){
				
				$scope.datas = response;
				alert($scope.datas);
				$scope.list = $scope.datas
			});
			
		});
	
	</script>


</body>
</html>