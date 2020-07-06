<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="memberList">
	<table id="memberlist_table">

		<tr>
			<th>No.</th>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>

		<c:forEach var="member" items="${members}" varStatus="status">
			<tr>
				<td>`${status.count}`</td>
				<td>`${member.memberId}`</td>
				<!-- getter -->
				<td>`${member.memberName}`</td>
				<td>`${member.email}`</td>
			</tr>
		</c:forEach>
	</table>
</div>

<script src="${javascript}/store/member.js"></script>
<script>

</script>

<style>
#memberlist_table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#memberlist_td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

#memberlist_tr:nth-child(even) {
  background-color: #dddddd;
}
</style>