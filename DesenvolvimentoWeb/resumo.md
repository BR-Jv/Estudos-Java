# Ambiente de desenvolvimento web 

## Tecnologias java para web 

* JSP - Java Server Pages 
Tecnologia voltada para a geração dinâmica de páginas HTML
* Servlet - São pequenos programas rodando no lado servidor e responsável por receber e processar as requisições HTTP.
* MVC(Modelo-Visão-Controlador) - Arquitetura utilizada para separar as responsabilidades dos códigos. 

## softwares importantes para o desensolvimento<br>

* Apache Tomcat 
* JDK

<br>Vídeos de como fazer o download e instalação dessas ferramentas integradas com o ambiente de desenvolvimento(IDE) podem ser encontradas na internet.<br>

***Dica:*** ler a documentação do tomcat, passar a vista em tutoriais introdutórios etc. 

# Servlets 

Servlets são classes que herdam código da classe especial HttpServlet existente no pacote javax.servlet.http.<br>
Usamos servlets para criarmos páginas web dinâmicas em java.<br>

**[Olhar o exemplo da pasta servlets]**

## Ciclo de vida dos servlets 

Quando uma requisição web requer a execução de um servlet, o contêiner web realiza os passos: 
1. Se o Servlet ainda não tiver sido carregado(Primeria vez acessado pelo contêiner): 
   * Carrega a classe do Servlet.
   * Instancia a classe.
   * Executa o método init().
2. Executa o método service() definifo na superclasse HttpServelt. Esse método será responsável por identificar o tipo da requisição web e invocar o método de tratamento apropriado
Por fim, quando os servlets não são mais necessários o contêiner web executa o método destroy() de cada servlet que foi instanciado. 

## Processando as requisições 

Requisições GET são processadas pelo método doGet(), e requisições POST são processadas pelo método doPost().<br>
O método doPost() funciona parecido com o doGet().<br>

**[Olhar o exemplo da pasta requisições]**<br>

métodos que podem ser utilizados para pegar informações das requisições. <br>
* getParameter()
* gerParameterNames()<br>

**OBS:** procure por detalhe sobre esses e mais métodos na documentação.

## Mantendo o estado do cliente web

Existem duas abordagens para manter o estado do cliente, podemos repassar parâmetros ou usar sessões.<br>

**OBS:** Olhar a documentação para mais detalhes, em especial, olhar o pacote javax.servlet e as interfaces HttpServletRequest e HttpServletResponse.

### Repassando parâmetros 

Usamos o campos ocultos(inputs do tipo hidden) dos formulários.<br>

***Limitações dessa abordagem***<br>
* Não se deve trafegar informações confidenciais dessa forma.
* Um sistema em que precisamos repassar dados podem ter várias telas, se usarmos essa abordagem podemos aumentar muito o código dos servlets, com isso aumenta as chances de bugs.
* Se a janela do navegador web for fechada,os dados serão perdidos.

