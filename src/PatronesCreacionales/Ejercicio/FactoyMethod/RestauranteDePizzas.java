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
public class RestauranteDePizzas {
    public Pizza OrdenarPizza(String tipoDePizza) throws Exception {
        Pizza pizza = null;
        
        if(tipoDePizza.equals("Queso")){
            return new PizzaDeQueso();
        }
        else if(tipoDePizza.equals("Mexicana")){
            return new PizzaMexicana();
        }
        else{
            throw new Exception("Lo Sentimos no tenemos la pizza ***"+ tipoDePizza.toUpperCase() +"*** en nuestro menú áun. \nPero te lo haremos saber en cuanto la tengamos!");
        }
    }
}