<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Lista Clientes</title>
</head>
<body>
	<%@ page isELIgnored="false"%>
<h1>Lista Clientes</h1>
	<!--  div class="alert alert-primary" role="alert">
	  ${requestScope.mensaje}
	</div-->

	<table class="table table-bordered table-dark">
		<thead class="thead-dark">
			<tr>
			
				<th scope="col">ID</th>
				<th scope="col">Nombre</th>
				<th scope="col">Apellido</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="customer" items="${requestScope.lista}">
				<tr>
					<td>${customer.idCustomer}</td>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}  <a class="btn btn-primary" href="VerClienteServlet?idCustomer=${customer.idCustomer}" role="button">Ver Cliente</a></td>	
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>