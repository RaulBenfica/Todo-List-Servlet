/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ListaTarefas;
import model.Tarefa;

/**
 *
 * @author benfi
 */
@WebServlet(name = "ToDo", urlPatterns = {"/"})
public class TodoList extends HttpServlet {

    private ListaTarefas lista = new ListaTarefas();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        String descricao = req.getParameter("descricao");

        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao(descricao);
        tarefa.setImportante(false);

        if (action == null) {
            action = "read";
        }

        if (action.equals("create")) {
            lista.create(tarefa);
            resp.sendRedirect("/ToDo/");
        } else if (action.equals("read")) {
            List<Tarefa> toDo = lista.read();
            req.setAttribute("toDo", toDo);
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/index.jsp");
            rd.forward(req, resp);
        }

    }
}
