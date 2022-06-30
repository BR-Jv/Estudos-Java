## Resumo 

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

soma -> +<br>
subtração -> -  
multiplicação -> *<br>
Divisão -> /<br>
Resto da divisão -> %<br>
Igual -> ==<br>
Diferença -> !=

# Escrita de Strings

Usamos o `System.out.print()` para imprimir dados na tela.<br>
*println()* -> faz a quebra de linha.<br>
*print()* -> não faz a quebra de linha.<br>

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

*IF-ELSE*
```
if(){ //Se condição == true, execute o bloco A senão execute bloco B 
  //bloco A
}else {
  //bloco B
}
```
*SWITCH*
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

*Laço For*
```
  public class ForExemplo {
    public static void main(String[] args){
      for(int i = 1; i <= 10; i++>){
        System.out.println(i);
      }
    }    
  }
```
*Laço while*
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
*Laço do-while*
```
public class do-whileExemplo {
    public static void main(String[] args){
      do {
        //comandos
      } while( condição );
    }    
  }
```
No laço do-while, o código dentro do laço sempre será executado pelo menos uma vez.<br>
