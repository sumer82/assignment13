<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table,tr,th,td
	{
		border:1px solid black;
		padding:5px;
	}

	table
	{
		border-collapse:collapse;
	}
</style>
</head>
<body bgcolor="beige">
	<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Organization</th>
			<th>Blood Group</th>
		</tr>
		
		<tr>
			<td>${bloodgroups.name}</td>
			<td>${bloodgroups.email}</td>
			<td>${bloodgroups.organization}</td>
			<td>${bloodgroups.bloodGroup}</td>
		
		</tr>
	</table>
</body>
</html>