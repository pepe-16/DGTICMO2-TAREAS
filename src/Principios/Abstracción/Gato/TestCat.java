package Principios.Abstracción.Gato;

import java.util.Date;

public class TestCat {

    public static void main(String[] args) {
        Cat benito = new Cat("Benito");

        Date expiration = new Date();
        Sausage sausage = new Sausage(2.3, "rosa", expiration);
        Fish fish = new Fish(5.7, "salmon", expiration);
        Taco taco = new Taco(20,expiration, "suadero");
        Ensalada ensalada = new Ensalada(5, expiration, "kartoffelsalat");
        
        System.out.println("Benito no ha comido" + benito.getEnergy());
        benito.eat(sausage);
        benito.eat(fish);
        benito.eat(taco);
        benito.eat(ensalada);
        
        System.out.println("Benito ya comido" + benito.getEnergy());
    }

}
