<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form enctype="multipart/form-data" action="upload" method="post">  
    <input type="file" name="file1" /> <input type="text" name="alais" /><br />  
    <input type="file" name="file2" /> <input type="text" name="alais" /><br />  
    <input type="file" name="file3" /> <input type="text" name="alais" /><br />  
    <input type="submit" value="上传" />  
</form>  

</body>
</html>