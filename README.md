# Detalhes
* Feito pra quem já sabe um pouco sobre a linguagem.
* Conteúdo extremamente resumido.
* Repositório feito para me auxiliar quando fico muito tempo sem ter contato com a linguagem java.

# Variáveis 

```
  double valor;
  double altura, peso, imc;
  char letra = 'a';
 
```
**Escopo variáveis**
```
  public class ExemploEscopo {
    public static int n1 = 10; //ESCOPO GLOBAL
    private static int n2 = 10; //ESCOPO LOCAL

    public static void main(String[] args){
      ...
    }
  }
```

# Constantes

Usamos a palavra chave ***final*** na declaração das constantes.<br>
`public static final double g = 9.8;`<br>
`final double g = 9.8;`

# Valores padrões

| tipo | valor |
| ----------- | ----------- |
| byte, short, int, long, etc. | 0 |
| flaot, double, etc | 0.0 |
| caractere | '\u0000' |
| String, ou qualquer objeto | null |
| boleano | false |

# EXPRESSÕES ARITMÉTICAS E BOOLEANAS 

|  |  |
| ----------- | ----------- |
| soma | + |
| subtração | - |
| multiplicação | * |
| divisão | / |
| resto da divisão | % |
| diferênça | != |
| igual | == |


# Escrita de strings

Usamos o `System.out.print()` para imprimir dados na tela.<br>
**println()** -> faz a quebra de linha.<br>
**print()** -> não faz a quebra de linha.<br>

| Caractere | representa |
| ----------- | ----------- |
| \n | quebra de linha |
| \" | aspas duplas |
| \t | tabulação |
| \\ | \ |
| \' | aspas simples  |

# Entrada de dados (via console)

Usamos uma função da classe scanner.<br>
```
//Exemplo
import java.util.scanner;
public class ExemploScanner { 
  
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    String nome = leitor.nextLine(); //Entrada de dados e armazenamento na variável nome
  }

}
```
|  |  |
| ----------- | ----------- |
| nextLine() | Lê texto |
| nextInt() | Lê número tipo inteiro |
| nextLong() | Lê número tipo long |
| nextFloat() | Lê número tipo float |
| nextDouble() | Lê número tipo double |
<br>

**Obs:** Para fazer uso de classes que não são padrão do (java.lang), precisamos importá-las, fazemos isso usando a palavra chave **import**
seguida do nome da biblioteca e da classe que queremos(em java chamamos bibliotecas de pacotes).
```
import nome_lib.classe;

public class Exemplo {
  ...
}
```

# Comandos de seleção 

**IF-ELSE**
```
if(expressão booleana){  
  //bloco A
}else {
  //bloco B
}
```
**SWITCH**
```
switch(expressão)
{
  case constante1:
    //bloco_A;
  break;
  case constante2:
    //bloco_B;
  break;
  case constante3:
    //bloco_C;
  break;
  default:
    //bloco_default; 
}

```
**Ternário**
```
(expressão booleana) ? bloco A : bloco B;
```

# Comandos de iteração 

**FOR**
```
for(){
  //Comandos 
}
```
**WHILE**
```
while(){
  //Comandos
}
```
**DO-WHILE**
```
do {
  //Comandos
} while ();
```
- No laço do-while, o código dentro do laço sempre será executado pelo menos uma vez.

# Vetores (Arrays)

é uma estrutura de dados homogênea, ou seja, que armazena valores de um mesmo tipo.

Exemplo:<br>
```
//Declaração de um vetor que armazena três itens; 
int arr[] = new int[3];

```

# CALCULANDO O ESPAÇO OCUPADO NA MEMÓRIA POR UM VETOR

Espaço ocupado = Tamanho ocupado por cada elemento do vetor * tamanho do vetor 

# Matrizes
É uma array bidimensional.

```
//Declarando uma matriz de ordem 2
int matriz[][] = new int[2][2]; 
```

# Comparação de strings

- Em Java, a comparação de Strings é sensivel a letras maiúsculas e minúsculas.<br>

**equals()** - compara strings fazendo distinção entre letras maiúsculas e minúsculas.<br>
**equalsIgnoreCase()** - compara strings sem fazer distinção entre letras maiúsculas e minúsculas.<br>
**toUpperCase()** - transformar todos os caracteres em letras maiúsculas.<br>
**toLowerCase()** - transformar todos os caracteres em letras minúsculas.

```
//comparando duas strings 
public static void main(String[] args){
  String nome1 = "João"; 
  String nome2 = "Maria";
  if(nome1.equals(nome2)){ //nome1.equalsIgnoreCase(nome2)
    System.out.println("nomes iguais");
  }else {
    System.out.println("nomes diferentes");
  }
}
``` 

# Convertendo uma string em uma array de caracteres

**toCharArray()** - retorna uma array de caracteres.<br>
**length()** - retorna a quantidade de caracteres que a string ou array possui.

```
  public static void main(String[] args){
    String nome = "João";
    char[] caracteres = nome.toCharArray(); 
  }
```

# Manipulando uma string como uma array
 
 ```
  public static void main(String[] args){
    String nome = "João Victor Alves";
    System.out.println(nome.charAt(0)); //retorna 'J'
    System.out.println(nome.charAt(5)); //retorna 'V'
    System.out.println(nome.charAt(12)); //retorna 'A'
  }
 ```

# Buscas em strings 

**indexOF()** - retorna a posição da primeira ocorrência, caso não exista retona o valor -1.
 ```
  public static void main(String[] args){
    String nome = "João Victor Alves";
    char caractere = 'J';
    System.out.println(nome.indexOf(caractere)); //retorna 0
  }
 ```

# Funções e Procedimentos  

**Funções** - retornam algo.<br>
**Procedimento** - não retornam nada.

```
//Função
public static int soma( int value1, int value2 ){
  return value1 + value2;
}

//Procedimento
public static void sayHello(){
  System.out.println("Hello!");
}
```

# Registros 

- Devemos colocá-los de forma separada do programa , em uma classe aparte.

```
public class <Nome_da_classe> {
  public <tipo> <nome>;
}
```

# Enumerações 

é uma lista de constante pré-definida.<br>

***Entenda o exemplo do diretório Enums!***.
