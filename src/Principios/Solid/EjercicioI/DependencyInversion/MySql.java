/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioI.DependencyInversion;

/**
 *
 * @author Pepe
 */

/**
 * 
 * Guarda la información de la persona en base de datos
 */
public class MySql {

    public void savePerson(Person person) {
        System.out.println(person.getName() + " save person in MySql is Ok...");
    }

}
