<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>TO DO Dinamico</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div style="margin: 0 auto; width: 480px;">
            <h1>TO DO Dinamico</h1>

            <h2>Lista de tarefas web dinamica</h2>
            <h3>Insira suas tarefas na lista abaixo e controle o que precisa fazer</h3>

            <ul>
                <c:forEach var="tarefa" items="${toDo}">
                    <li><c:out value="${tarefa.descricao}" /></li>
                    <hr/>
                </c:forEach>
            </ul>

            <form action="/ToDo/">
                <input id="descricao" name="descricao" placeholder="Insira sua nova tarefa aqui"/>
                <input type = "checkbox" id ="importante" name ="importante" value ="importante"/>
                <label for = "importante"> Dar prioridade? </label>
                <input type="hidden" name="action" value="create"/>
                <button type="submit"> Salvar </button>
            </form>
        </div>
    </body>
</html>
