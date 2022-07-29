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

Usando sessões mantemos o estado do cliente(informações) no lado do servidor, fazemos isso guardando as informações em um objeto do tipo HttpSession. <br>

***Informações importantes***<br>
* Utilizamos a interface javax.servlet.http.HttpSession 
* Cada usuário só pode ter um objeto do tipo HttpSession 
* Usamos o método getSession() da classe HttpServletRequest para criar o objeto 
* Umas das formas de finaliza as sessões é usando o método invalidate() da classe HttpSession

método **getSession()** se comporta da seguinte forma:<br>
Quando chamado verifica se existe algum objeto do tipo HttpSession, se existir o método irá retorná-lo, se não, ele será criado.<br>
 
método **getSession(false)** se comporta da seguinte forma:<br> 
Quando passado como parâmetro o valor true, esse método irá se comportar como o getSession, caso o valor seja false, o método retorna a sessão.<br>

***Obs:*** getSession(false) não cria uma sessão.<br>

método **invalidate()**<br>
Esse método é utilizado para liberar o objeto do servidor e descartar todo o seu estado.<br>

**[Olhar o exemplo da pasta sessao]**<br>

# JSP (JavaServer Pages) 

Tecnologia utiliazada pra se criar conteúdo web tanto estático como dinâmico.<br>

O marcador <code><%= %></code> delimita um espaço que deve ser preenchido com uma expressão Java, ou seja, uma instrução que retorne algo.<br>

**[olhar exemplo do diretório jsp]**<br> 

## Ciclo de vida do JSP 

Ao ser acessado pela primeira vez pelo servidor, o arquivo JSP será traduzido para um Servlet.<br>
 
 [Tradução_jsp](/imgs/jsp.png);<br>

 Pontos importantes que devemos notar no arquivo servlet gerado: 
 * Todo o conteúdo da página de resposta será escrito através de uma variável de nome out. Ela se comporta de forma semelhante à classe PrintWriter 
 * Conteúdos estáticos serão traduzidos pelo comando out.write(), passando o conteúdo estático como parâmetro
 * Conteúdos dinâmicos, representados por marcadores e diretivas JSP, são traduzidos de forma equivalente a de códigos que normalmente escreveriamos nos servlets

 **Obs:** Esse processo de tradução é feita de forma automática e transparente, como programadores devemos ter uma noção de como ela funciona! 

 ## JSP e variáveis declaradas 

O método _jspService() do servlet, gerado apartir de uma página jsp, é responsável pela geração da página de resposta.<br> 
Esse método possui os parâmetros **request** e **response**, nele temos algumas variáveis locais ao método sendo essas: 
* session - referênciando ao objeto sessão, se o mesmo tiver sido criado
* application - referente ao objeto do tipo ServletContext
* config - referente ao objeto do tipo ServletConfig, o qual dá acesso a informações de configuração do Servlet
* out - referente ao objeto de escrita na página de resposta a ser gerada

**obs:** tanto os parâmetros como as variáveis do método _jspService() podem ser acessadas pelo código JSP.<br> 

**obs:** Ao usar arquivos JSP, os objetos sessão são criados se não existirem.<br>

**[Olhar o exemplo2 do diretório jsp]**

## Scriptlets

Os scriptlets são blocos de código Java delimitados pelos marcadores <code><% %></code>. Dentro desse bloco de código, pode existir qualquer comando Java válido.<br> 

**OBS:** variavéis que são criados dentro dos scriptlets são locais ao método _jspService().<br>

Para fazer com que uma variável seja um variável de instância(atributo do servlet) devemos usar um elemento JSP chamado de declaração. Uma declaração é delimitada pelos marcadores <code><%! %></code>.<br>

**[olhar o exemplo3 do diretório JSP]**

## Comentários 

Usamos os marcadores <code><%-- --%></code> para apresentar comentários dentro de um arquivo JSP, também podemos usar o <code><!- --></code> do html.<br> 

**OBS:** Comentários usando os marcadores JSP não são colocados na página HTML de resposta. 

## Reutilizando códigos de outro arquivo

No JSP conseguimos modularizar o código, ou seja, dividir o conteúdo de seus arquivos em partes menores que depois serão compostas para resultar nas páginas do sistema.<br>

Usamos o marcador <code><%@ include file="<nome_do_arquivo>"%></code> para inclusões estáticas.<br>

**[Olhar os exemplos4 e 4.1]**

Outra forma é usando a diretiva <code><jsp:include></code>. Essa diretiva faz a inclusão tanto estática como dinâmica de outros arquivos.<br>

Como se comportam os tipos de inclusões: 
* Estática 
   O código do arquivo referenciado é colocado no Servlet gerado para o arquivo JSP que está querendo executar.
* Dinâmica 
   Na hora em que o arquivo que faz a inclusão é executado, ele executa o arquivo incluído e seu resultado (código da página de resposta) é colocado dentro da resposta final a ser montada.
