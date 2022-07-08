Os quatro pilares derivados do princípio da abstração.
1. Encapsulamento
2. Herança
3. Composição 
4. Polimorfismo

# Classes 

- A classe é o modelo ou molde de construção de objetos.
- O modelo define as características e comportamentos que os objetos irão determinar seus valores e desempenhar suas ações, respectivamente.
- A classe é abstrara(não existe concretamente)

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

Toda classe deve ter um construtor, quando não é codificado um o compilador cria um padrão.<br>

**importante:**
- não tem tipo de retorno. 
- tem que ter o mesmo nome da classe.

```
class Carro {
   Carro(){ //Construtor da classe Carro
      
   }
}

```
instânciando esse objeto, lembrando que deve ser feito na classe main.<br>
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
- A chamada a um dos métodso do objeto quer representam seu comportamento e as tarefas que sação capazes de desempenhar.

# Encapsulamento 

É a característica da OO capaz de ocultar partes (dados e detalhes), de implementação interna de classes, do mundo exterior.
