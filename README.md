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

