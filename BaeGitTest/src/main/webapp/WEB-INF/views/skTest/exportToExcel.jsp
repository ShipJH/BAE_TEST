<%@ page language="java" contentType="application/vnd.ms-excel;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%
response.setHeader("Content-Disposition","attachment;filename=member.xls");
response.setHeader("Content-Description", "JSP Generated Data");
%>
	
		<table border="1">
		    <tr>
		        <%--<td colspan="5" style="text-align:center;">회원명수 : ${resultCount}명</td>--%>
		    </tr>
		    <tr>
		        <th>로그인ID sk</th>
		        <th>이름 sk</th>
		        <th>이메일 sk</th>
		        <th>전화번호 sk</th>
		        <th>가입일자 sk</th>
		    </tr>
		    <c:forEach var="list" items="${excelList}">
		        <tr>
		            <td>${list.USR_LGN}</td>
		            <td>${list.USR_NM}</td>
		            <td>${list.USR_EML}</td>
		            <td>${list.USR_TEL}</td>
		            <td>${list.CRT_DT}</td> 
		   <%--         <td><c:out value="${ list.USR_LGN }"/></td>
		            <td><c:out value="${ list.USR_NM }"/></td>
		            <td><c:out value="${ list.USR_EML }"/></td>
		            <td><c:out value="${ list.USR_TEL }"/></td>
		            <td><c:out value="${ list.CRT_DT }"/></td> --%>
		
		        </tr>
		    </c:forEach>
		</table>
