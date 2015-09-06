<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<fieldset>
		<legend>Daftar User</legend>
		<table border="1">
			<thead>
				<tr>
					<td>ID</td>
					<td>UserName</td>
					<td>Edit</td>
					<td>Hapus</td>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${fn:length(users) > 0 }">
						<c:forEach items="${users}" var="user">
							<tr>
								<td>${user.id}</td>
								<td>${user.username}</td>
								<td>
									<a href="/nadisaweb/user/edit/${user.id}">
										Edit
									</a>
								</td>
								<td>
									<a href="/nadisaweb/user/delete/${user.id}">
										Hapus
									</a>
								</td>
							</tr>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="4">No Data</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="4" align="right"><a href="/nadisaweb/user/add">+ </a></td>
				</tr>
			</tfoot>
		</table>
	</fieldset>
</body>
</html>