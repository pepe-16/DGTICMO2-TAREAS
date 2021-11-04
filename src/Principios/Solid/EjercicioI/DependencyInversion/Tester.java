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
public class Tester {
    
    
    public static void main(String[] args) {
        
    Person person = new Person();
    ServicePerson serviceperson = new ServicePerson();
    
    person.setName("Ian");
    serviceperson.savePerson(person);
    
    }
}
