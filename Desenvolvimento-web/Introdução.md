# Ambiente de desenvolvimento web 

softwares importantes para o desensolvimento<br>
* Apache Tomcat 
* JDK
<br>
Vídeos de como fazer o download e instalação dessas ferramentas integradas com o ambiente de desenvolvimento(IDE) podem ser encontradas na internet.<br>
***Dica:*** ler a documentação do tomcat, passar a vista em tutoriais introdutórios etc. 

# Servlets 

Servlets são classes que herdam código da classe especial HttpServlet existente no pacote javax.servlet.http.<br>
Usamos servlets para criarmos páginas web dinâmicas em java.<br>

***Olhar o exemplo da pasta servlets***

# Ciclo de vida dos servlets 

Quando uma requisição web requer a execução de um servlet, o contêiner web realiza os passos: 
1. Se o Servlet ainda não tiver sido carregado(Primeria vez acessado pelo contêiner): 
   * Carrega a classe do Servlet.
   * Instancia a classe.
   * Executa o método init().
2. Executa o método service() definifo na superclasse HttpServelt. Esse método será responsável por identificar o tipo da requisição web e invocar o método de tratamento apropriado
Por fim, quando os servlets não são mais necessários o contêiner web executa o método destroy() de cada servlet que foi instanciado. 




