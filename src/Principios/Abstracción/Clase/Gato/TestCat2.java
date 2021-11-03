package Principios.Abstracción.Clase.Gato;

import java.util.Date;

public class TestCat2
{
    public static void main(String[] args) {
        Cat2 benito = new Cat2("Benito");
        Date expiration = new Date();
        Sausage2 sausage = new Sausage2(2.3, "rosa", expiration);
        Fish fish = new Fish(5.7, "salmon", expiration);
        Carrot carrot = new Carrot(1.3);

        System.out.println("Benito no ha comido: " + benito.getEnergy());
        benito.eat(sausage);
        benito.eat(fish);
        benito.eat(carrot);
        System.out.println("Benito ya comio: " + benito.getEnergy());
    }
}
