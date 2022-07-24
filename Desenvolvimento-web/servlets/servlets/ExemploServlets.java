
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletExemplo") //define o webservlet e o mapeamento (no web.xml) de acordo com o nome do arquivo java
public class ExemploServlets extends HttpServlet{
   private static final long serialVersionUID = 1L;

   //método do HttpServlet sendo sobre posto pela classe ExemploServlets
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Servlet {
      // TODO Auto-generated method stub
      PrintWriter saida = response.getWriter(); //O objeto saida representa o canal de comunicação do servidor para o cliente
      saida.write("<HTML><BODY>Olá!</BODY></HTML>"); 
      saida.close();
   }
   
}
