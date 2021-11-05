/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales.Ejercicio.FactoyMethod;

/**
 *
 * @author Pepe
 */
public class TesterPizza {
    public static void main(String []args) throws Exception {
        RestauranteDePizzas LuigisPizzas = new RestauranteDePizzas();
        Pizza pizzaAPreparar;

        // Ordenamos una Pizza de Queso
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Queso");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());

        // Ordenamos una Pizza Mexicana
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Mexicana");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());

        // Ordenamos una Pizza Hawaiana
        pizzaAPreparar = LuigisPizzas.OrdenarPizza("Hawaiana");
        System.out.println("La pizza que ordenó es una: " + pizzaAPreparar.obtenerNombreDeLaPizza());
    }
    
}
