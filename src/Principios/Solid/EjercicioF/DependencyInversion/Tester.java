/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioF.DependencyInversion;

import Principios.Solid.EjercicioI.DependencyInversion.*;

/**
 *
 * @author Pepe
 */
public class Tester {
    
    
    public static void main(String[] args) {
    
    MySql mysql = new MySql();
    Oracle oracle = new Oracle();
    
    Person person = new Person();
    person.setName("Ian");
    
    ServicePerson serviceperson1 = new ServicePerson(mysql);
    ServicePerson serviceperson2 = new ServicePerson(oracle);

    serviceperson1.savePerson(person);
    serviceperson2.savePerson(person);
    }
}
