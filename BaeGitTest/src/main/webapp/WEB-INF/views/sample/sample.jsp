<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript">

//엑셀다운로드 클릭 방식1
$(function(){
	$('#exBt').click(function(){
		var url='data:application/vnd.ms-excel,' + encodeURIComponent($('#exceldownload').html()) 
		location.href=url
		return false
	})
})

function excelread() {
	var form = document.exform;
	form.action = "/excelUp.do"
	form.submit();
}

</script>

<style type="text/css">
#exBt {
	margin: 0;
	padding: 0;
	margin-left: 5px;
}
</style>

<body>
<h3>회원 리스트</h3>
<h3>TEST(배재현)</h3>

<form id="exform" method="post" enctype="Multipart/form-data"  >
	<div id="exceldownload">
		<table border="1">
		    <tr>
		        <%--<td colspan="5" style="text-align:center;">회원명수 : ${resultCount}명</td>--%>
		    </tr>
		    <tr>
		        <th>로그인ID</th>
		        <th>이름</th>
		        <th>이메일</th>
		        <th>전화번호</th>
		        <th>가입일자</th>
		    </tr>
		    <c:forEach var="list" items="${resultList}">
		        <tr>
		            <td>${list.USR_LGN}</td>
		            <td>${list.USR_NM}</td>
		            <td>${list.USR_EML}</td>
		            <td>${list.USR_TEL}</td>
		            <td>${list.CRT_DT}</td>
		
		        </tr>
		    </c:forEach>
		</table>
	</div>
	
		<button id="exBt"> Excel-Download </button>
		<br>
		
		<!-- IE도 됨 -->
		<a href='<c:url value="/exportToExcel.do"/>'>excel-Download</a>
		
		<input type="file" id="files" />
		<input type="button" id="excelread" value="go"/>
		
</form>
	
</body>
</html>