package DesenvolvimentoWeb.requisições;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExemploRequisicao")
public class Exemplo_doGet extends HttpServlet{
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Servlet {
      PrintWriter resposta = response.getWriter();
      resposta.write("<html><body>");
      resposta.write("Olá, " + request.getParameter("nome") + " !!!"); //Pega o valor da variável indicada, se não existir retorna null.  
      resposta.write("</html></body>");
   }

}
