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
instânciando o objeto.<br>
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

