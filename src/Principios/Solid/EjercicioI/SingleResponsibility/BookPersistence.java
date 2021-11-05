/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioI.SingleResponsibility;

/**
 *
 * @author Pepe
 */
public class BookPersistence {

    public void save(Book book) {
        System.out.println("Saving the book " + book);
    }
}
