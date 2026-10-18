<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Catálogo</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
    <header>
        <h1>Catálogo de cursos</h1>
        <a href="index.jsp">Inicio</a>
    </header>

    <c:choose>
        <c:when test="${empty cursos}">
            <p>No hay cursos disponibles.</p>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Categoría</th>
                    <th>Participantes</th>
                    <th>Plazas</th>
                    <th>Estado</th>
                </tr>
                <c:forEach items="${cursos}" var="curso">
                    <tr>
                        <td>${curso.id}</td>
                        <td><c:out value="${curso.nombre}"/></td>
                        <td><c:out value="${curso.categoria}"/></td>
                        <td>${curso.participantes}</td>
                        <td>${curso.plazas}</td>
                        <td>
                            <c:if test="${curso.plazasLibres == 0}">Completo</c:if>
                            <c:if test="${curso.plazasLibres > 0}">${curso.plazasLibres} plazas libres</c:if>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>

    <footer>
        <p>Proyecto de Desarrollo Web</p>
    </footer>
</body>
</html>
