package org.cuatrovientos;

import java.io.IOException;
import java.util.List;

import org.cuatrovientos.curso.Curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cursos")
public class CursosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Curso> cursos = List.of(
            new Curso(1, "Java desde cero", "Programación", 28, 30),
            new Curso(2, "Desarrollo web con JSP", "Web", 30, 30),
            new Curso(3, "Bases de datos con MySQL", "Datos", 12, 25),
            new Curso(4, "Android con Kotlin", "Móvil", 18, 20),
            new Curso(5, "Git y GitHub", "Herramientas", 5, 25)
        );

        request.setAttribute("cursos", cursos);
        request.getRequestDispatcher("/WEB-INF/views/catalogo.jsp").forward(request, response);
    }
}
