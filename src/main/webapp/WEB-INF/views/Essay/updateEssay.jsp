<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<!-- UEditor -->
<script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/ueditor.all.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=basePath%>ueditor/lang/zh-cn/zh-cn.js"></script>
<!-- 实例化编辑器 -->
	<script type="text/javascript">
		var ue = UE.getEditor('fullNameSuffix')
	</script>
	
<script type="text/javascript">
	function get(){
		/* var arr = []; */
		//获取编辑器
		/* arr.push(UE.getEditor('fullNameSuffix').getContent()); */
		/* alert(arr.join("\n"));
		return ture; */
		UE.getEditor('fullNameSuffix').getContent();
	}
	
	var url = "/1/"+ ${esyid} + "/essay/updateesyinfo";
	
	document.myForm.action = url; 

</script>

<title>修改文章</title>
</head>
<body>
	<form action="" name="myForm" method="post">
		<div>
		<table>
			<tr>
				<td>
					<script id="fullNameSuffix" type="text/plain" name="content" style="width:autu;height:auto;min-height:450px;">${esyinfo}</script>
				</td>
			</tr>
		</table>
		</div>
		<div>
		<input type="submit" value="提交" >
		</div>
	</form>
	
	
	

</body>
</html>