Os quatro pilares derivados do princípio da abstração.
1. Encapsulamento
2. Herança
3. Composição 
4. Polimorfismo

# Classes 

- A classe é o modelo ou molde de construção de objetos.
- O modelo define as características e comportamentos que os objetos irão determinar seus valores e desempenhar suas ações, respectivamente.
- A classe é abstrata (não existe concretamente)

```
class Carro {
   //Atributos
   String cor;
   int numRodas;
   boolean motor;

   Carro(){
    motor = false;  
   }

   //Método
   public void Ligar(){
      motor = true;
   }
}
```

# Objetos

### Métodos Construtores

Toda classe deve ter um construtor, quando não é codificado um, o compilador cria um padrão.<br>

**importante:**
- não tem tipo de retorno. 
- tem que ter o mesmo nome da classe.

```
class Carro {
   Carro(){ //Construtor da classe Carro
      
   }
}

```
**instânciando o objeto**.<br>
`Carro newCar = new Carro()`

### Sobrecarga de Construtores 

No momento da criação do objeto, os valores passados por referência determinam qual o construtor será utilizado. 

```
public class Carro {
   String cor;

   public Carro(){ //Construtor I
      this.cor = "branco";
   }
   public Carro(String cor){ //Construtor II
      this.cor = cor;
   }
}
```

### Troca de mensagem 

A troca de mensagem entre objetos se dar pelo acionamente de métodos, em java essa troca representa: 
- A mudança ou leitura do estado interno do objeto através da alteração de um de seus atributos;
- A chamada a um dos métodos do objeto que representam seu comportamento e as tarefas que são capazes de desempenhar.

# Encapsulamento 

É a característica da Orientação a Objetos capaz de ocultar partes (dados e detalhes) de implementação interna de classes, do mundo exterior.

### modificadores de acesso

[ExemploAgenda]<br>

são palavras-chave ou reservadas da linguagem cuja utilidade é permitir ou proibir o acesso aos atributos e/ou métodos das classes.<br>

**public** - acessado ou executado por qualquer classe.<br>
**private** - acessado, modificado ou executado por métodos da mesma classe.<br>
**protected** - pode ser acessado por classes filhas ou derivadas.

# Composição 

É o mecanismo de reaproveitamento de classes.

significa que se pode usar uma ou várias classes para compor outra classe.<br> 
**Exemplo:** 
```
//Classe Motor 
class Motor{
   private int potencia;
}

//classe Direção 
class Direcao {
   private String cor;
}

//Classe Automóvel 
class Automovel {
   private Motor motor;
   private Direcao direcao;
}
```

### A composição e o Método Construtor 

**[Olhar ExemploComposição]**<br>
Os métodos construtores das classes componentes que fazem parte da classe composta podem ser chamados de três maneiras diferentes: 
1. chamadas nos construtores da classe que é composta;
2. chamadas em qualquer métodos da classe que é composta;
3. chamadas foda da classe que é composta

# Herança 

É o mecanismo que permite a uma classe herdar todos os atributos e métodos de outra classe.

### Termos usados para herança 

|Classes que Fornecem a Herança|Classes que herdam de outras|
|---|---|
|SuperClasse|Subclasse|
|Mãe|Filha|
|Tipo|Subtipo|

Outros termos usados:<br>
***Ancestral:*** é uma classe que aparece na hierarquia de classes em uma posição acima da progenitora(mãe).<br> 
***Descendentes:*** dada uma classe, toda classe que aparece abaixo dela na hierarquia é uma descendente da classe dada.<br>
***Raiz(ou Base):*** é a classe topo da hierarquia.<br>
***Folha:*** é uma classe sem filhas.

### Especialização e Generalização 

**Generalização**- são classes genéricas e abstratas, as quais podem ser usadas para outras descenderem delas.<br>
**Especialização**- indica classes que estão numa posição inferioir na hierarquia e possuem estado e comportamento mais especializados.

### Herança múltipla e simples

**Múltipla**- uma classse possui mais de uma superclasse e herda variáveis e métodos de todas as mães, em java usamos Interfaces para simular esse tipo de herança.<br>
**Simples**- Cada classe tem apenas uma superclasse, em java usamos a palavra *extends* para declarar que uma classe é herdeira de outra.

### Super 

a palavra reservada *super* é usada nos construtores para chamada de construtores em cascata das classes mães.<br>
resumindo: usamos o super dentro de um construtor filho para chamar o construtor da classe mãe.<br>
- Apenas comentários são permitidos antes da palavra super nos construtores.
- Podemos usar super para acessar atributos(ou métodos) da classe mãe, usamos igual o this.

**Exemplo:** 
[uso_super](imgs/uso%20do%20super.png)

# Polimorfismo

É a habilidade de objetos de classes diferentes responderem a mesma mensagem de diferentes maneiras.

o polimorfismo pode ser classificado de três maneiras:

### Sobrecarga

permite que um método de determinado nome tenha comportamentos distintos, em função de diferentes parâmetros que ele recebe.
```
public class sobrecarga {
   private int xInt;
   private int yInt;
   private float xFloat;
   private float yFloat;
   private double xDouble;
   private double yDouble;
   public int calcMaior(intx, int y){...}
   public float calcMaior(float x, float y){...}
   public double calcMaior(double x, double y){...}
   public int calcMaior(double a, double b){...} //ERRO!
}
```
**conversão**
é a capacidade de um tipo ser convertido em outro tipo de maneira automática ou pela força bruta.
[tabela](imgs/convers%C3%A3o_java.png)

***resumindo:*** digamos que têmos um método que recebe parâmetros do tipo float, e na classe main chamamos esse método com parâmetros do tipo int, essa ação é permitida pois o java faz uma conversão dos tipo primitivos. 

### Sobreposição

é a redefinição de métodos em classes descendentes.

```
//Exemplo

public class Brinquedo {
   public void mover();
}

public class Carrinho extends Brinquedo {
   public void mover(){
      System.out.println("Correndo!!");
   }
}
public class Aviãozinho extends Brinquedo {
   public void mover(){
      System.out.println("Voando!!");
   }
}

```

### Inclusão 

usa a capacidade de substituição da herança de uma classe mãe por qualquer classe descendente, para permitir um comportamneto polimórfico nos métodos que usam a classe mãe. 

# Coleções Java 

A linguagem Java possui um conjunto de classes que servem para armazenar na memória vários objetos.<br>
Existem tipos principais de Coleções em Java, cada uma com um propósito diferente, sendo eles :
1. SET
2. LIST
3. MAP

### SET 

- Representa a mesma ideia de conjuntos da matemática.
- Manipulação de conjuntos.
 
### LIST 

- Representa uma lista de objetos.
- Itens podem ser repetidos.
- Nas listas os objetos armazenados mantêm a ordem com que foram adicionados.
   
add([item]) - adiciona um item a lista.<br>
remove([posição]) - remove um item da lista.<br>
get([posição]) - retorna o item da posição passada como referência.
   
```
   public static void main(String[] arg){
      ArrayList<String> list = new ArrayList<String>();
      list.add("chocolate");
      list.add("bala");
      //list.remove(0);
      //list.get(1);
   }
```

### MAP
   
   - São estruturas que relacionam um objeto a outro.

   put([Chave], [item]) - adiciona no MAP uma chave que está relacionada a um objeto 
   get([Chave]) - retorna um objeto.
   
### Iterando sobre coleções 

Usamos o for each, também chamado de "enhancedloop" e for-in.<br>
Olhar o exemplo do Collection.List, nele tem uma aplicação de como iterar uma collection.

```
//Uso do For-each.
int []a = {1, 2, 3, 4}
for(int n : a)
   System.out.print(n);
```

# Tratamento de Exceções 

Assunto complexo, estudar melhor outra hora.
```
try {
   
} catch (Exception ex) {

}
``` 

