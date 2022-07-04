## Resumo do conteúdo
* Repositório para consultas rápidas
* Feito pra quem já sabe sobre a linguagem java, mas ás vezes precisa relembrar algo de forma rápida.
* Se você está querendo aprender sobre java, eu índico procurar um material mais completo.
* Exemplos de aplicação > resumo escrito sobre tópico. 

# Variáveis 

**Forma geral** <br>
`tipo_da_var nome_da_var`<br>
**Exemplo<br>**
`double preco;` <br>
`char letra, inicial;` <br>
`double altura, peso, imc;` <br>

- variáveis podem ser declaradas e já inicializadas <br>
- Variáveis podem ter escopo: <br>
  - *Global:*
 `public static`  
  - *Local:* 
 `private static`<br>
```
//Exemplo
public class ExemploEscopo {
  public static int n1 = 10;
  private static int n2 = 10;
  
  public static void main(String[] args){
    ...
  }
}
```

# Constantes

Usamos a palavra chave **final** na declaração das constantes.<br>
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

# Expressões aritméticas e boleanas 

|  |  |
| ----------- | ----------- |
| soma | + |
| subtração | - |
| multiplicação | * |
| divisão | / |
| resto da divisão | % |
| diferênça | != |
| igual | == |


# Escrita de Strings

Usamos o `System.out.print()` para imprimir dados na tela.<br>
* *println()* -> faz a quebra de linha.<br>
* *print()* -> não faz a quebra de linha.<br>

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
**Obs:**
Para fazer uso de classes que não são padrão do (java.lang), precisamos importá-las, fazemos isso usando a palavra chave **import**
seguida do nome da biblioteca e da classe que queremos (em java chamamos bibliotecas de pacotes)

|  |  |
| ----------- | ----------- |
| nextLine() | Lê texto |
| nextInt() | Lê número tipo inteiro |
| nextLong() | Lê número tipo long |
| nextFloat() | Lê número tipo float |
| nextDouble() | Lê número tipo double |

# Comandos de seleção 

**IF-ELSE**
```
if(){  
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

# Comandos de iterações 

**FOR**
```
  public class ForExemplo {
    public static void main(String[] args){
      for(int i = 1; i <= 10; i++>){
        System.out.println(i);
      }
    }    
  }
```
**WHILE**
```
public class WhileExemplo {
    public static void main(String[] args){
      int i = 1;
      while(i <= 10){
        System.out.println(i);
        i = i + 1;
      }
    }    
  }
```
**DO-WHILE**
```
public class do-whileExemplo {
    public static void main(String[] args){
      do {
        //comandos
      } while( condição );
    }    
  }
```
- No laço do-while, o código dentro do laço sempre será executado pelo menos uma vez.

# VETORES

é uma estrutura de dados homogênea, ou seja, que armazena valores de um mesmo tipo.

Exemplo:<br>
```
import java.util.Scanner;

public class ArrExemplo {
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    int arr[] = new int[3]; 
    arr[0] = leitor.nextInt();
    arr[1] = leitor.nextInt();
    arr[2] = leitor.nextInt();
  }
}
```

# CALCULANDO O ESPAÇO OCUPADO NA MEMÓRIA POR UM VETOR

Espaço ocupado = Tamanho ocupado por cada elemento do vetor * tamanho do vetor 

# MATRIZES

```
public class ExemploMatriz {
  public static void main(String[] args){
    int matriz[][] = new int[2][2]; //Matriz de ordem 2
  }
}

```

# COMPARAÇÃO DE STRINGS

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

# Convertendo uma String em uma array de caracteres

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

 # Buscas em Strings 

**indexOF()** - retorna a posição da primeira ocorrência, caso não exista retona o valor -1.
 ```
  public static void main(String[] args){
    String nome = "João Victor Alves";
    char caractere = 'J';
    System.out.println(nome.indexOf(caractere)); //retorna 0
  }
 ```
