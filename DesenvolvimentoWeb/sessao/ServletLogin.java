package DesenvolvimentoWeb.sessao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Imagine que tenhamos uma página inicial de login, com um form aonde temos os campos de nome usuario e senha.

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
   
   private static final long serialVersionUID = 1L;
   
   public static final String USUARIO = "usuario";
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
   }
   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      PrintWriter resposta = response.getWriter();
      
      resposta.write("<html><body>");
      
      String nomeUsuario = request.getParameter(USUARIO);
      String senhaUsuario = request.getParameter("senha");
      
      // Login e senha corretos
      if (autenticar(nomeUsuario, senhaUsuario)) {
         HttpSession sessao = request.getSession(); 
         
         sessao.setAttribute(USUARIO, nomeUsuario); 
         /*
          * Usamos o método setAttribute para armazenar as informações
          * setAttribute recebe como primeiro parâmetro o nome do atributo e o segundo é seu valor. 
         */

         request.getRequestDispatcher(“ServletMenu”).forward(request, response);
         /*
          * toda a resposta do servidor será gerado pelo servlet que é passado como parâmetro, no caso "ServletMenu". 
          */

      } else {
         resposta.write("Usuário e senha inválidos");
      }
      resposta.write("</body></html>");
   }
   private boolean autenticar(String nomeUsuario, String senhaUsuario) {
      // Aqui entraria o código de autenticação.
      // Está verificando apenas se é diferente de nulo ou vazio
      return !("".equals(nomeUsuario) || "".equals(senhaUsuario)
      || nomeUsuario == null || senhaUsuario == null);
   }
}