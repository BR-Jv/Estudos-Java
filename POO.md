Os quatro pilares derivados do princípio da abstração.
1. Encapsulamento
2. Herança
3. Composição 
4. Polimorfismo

### Classes 

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

