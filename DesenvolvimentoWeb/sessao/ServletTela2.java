package DesenvolvimentoWeb.sessao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletTela2 extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      PrintWriter resposta = response.getWriter();
      
      resposta.write("<html>");
      resposta.write("<head>");
      resposta.write("<title>Confirmação de registro</title>");
      resposta.write("</head>");
      resposta.write("<body>");
      
      HttpSession sessao = request.getSession(false);
      
      if (sessao == null|| sessao.getAttribute(ServletLogin.USUARIO) == null) {
         resposta.write("<a href=\"login.html\">Faça primeiro o seu login</a>");
      } else {
      
         resposta.write("<h3>Registro realizado com sucesso!</h3><BR><BR>");
         resposta.write("<b>Seus dados pessoais:</b><BR>");
      
         DadosPessoais dados = (DadosPessoais) sessao.getAttribute("dadosPessoais"); //Pegando os dados organizados
         
         if (dados == null) {
            resposta.write("<a href=\"ServletLogin\">Dados incompletos. Inicie o sistema novamente.</a>");
         } else {
            
            //! Mostrando as informações que estavam no objeto
            resposta.write(dados.getNome() +" "+ dados.getSobrenome());
            resposta.write("<BR>");
            resposta.write(dados.getRua());
            resposta.write("<BR>");
            resposta.write(dados.getComplemento());
            resposta.write("<BR>");
            resposta.write(dados.getCidade());resposta.write(", ");
            resposta.write(dados.getCep());
            resposta.write(", ");
            resposta.write(dados.getEstado());
            resposta.write("<BR>");

            //! Mostrando as informações que vireram da tela1  
            resposta.write("<b>Seus dados profissionais:</b><BR>");
            resposta.write(request.getParameter("empresa"));
            resposta.write("<BR>");
            resposta.write(request.getParameter("ruaEmpresa"));
            resposta.write("<BR>");
            resposta.write(request.getParameter("complementoEmpresa"));
            resposta.write("<BR>");
            resposta.write(request.getParameter("cidadeEmpresa"));
            resposta.write(", ");
            resposta.write(request.getParameter("cepEmpresa"));
            resposta.write(", ");
            resposta.write(request.getParameter("estadoEmpresa"));
         }
      }
      
      resposta.write("</body></html>");
      
   }
}