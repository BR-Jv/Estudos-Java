# Ambiente de desenvolvimento web 

## Tecnologias java para web 

* JSP - Java Server Pages 
Tecnologia voltada para a geração de páginas dinâmicas. 
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

**OBS:** procure por detalhes sobre esses e mais métodos na documentação.

## Mantendo o estado do cliente web

Existem duas abordagens para manter o estado do cliente, podemos repassar parâmetros ou usar sessões.<br>

**OBS:** Olhar a documentação para mais detalhes, em especial, olhar o pacote javax.servlet e as interfaces HttpServletRequest e HttpServletResponse.

### Repassando parâmetros 

Usamos o campos ocultos(inputs do tipo hidden) dos formulários.<br>

***Limitações dessa abordagem***<br>
* Não se deve trafegar informações confidenciais dessa forma.
* Em um sistema precisamos repassar dados por várias telas, se usarmos essa abordagem aumentamos muito o tamanho do código com isso temos chances maiores de gerar bugs.
* Se a janela do navegador web for fechada, os dados serão perdidos.

### Sessões 

Com essa abordagem mantemos o estado do cliente(informações) no lado do servidor.<br>
Fazemos isso guardando as informações em um objeto do tipo HttpSession<br>

***Informações importantes***<br>
* Utilizamos a interface javax.servlet.http.HttpSession 
* Cada usuário só pode ter um objeto do tipo HttpSession 
* Usamos o método getSession() da classe HttpServletRequest para criar o objeto 
* Umas das formas de finaliza as sessões é usando o método invalidate() da classe HttpSession

método **getSession()** se comporta da seguinte forma: 
* Se não existir nenhum objeto, será criado um do tipo HttpSession. 
* Caso exista, ele irá retornar o objeto. 

método **getSession(false)** se comporta da seguinte forma: 
* Se como parâmetro passarmos o valor true, ele irá se comportar como o getSession()
* Se o valor do parâmetro for false, ele irá retornar a sessão.
Obs: getSession(false) não cria uma sessão, apenas retorna.<br>

método **invalidate()**
Esse método é utilizado para liberar o objeto do servidor e descartar todo o seu estado.<br>

**[Olhar o exemplo da pasta sessao]**<br>

