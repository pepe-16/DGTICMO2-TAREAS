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
public class Tester {

    public static void main(String[] args) {
        // write your code here
        Book myBook = new Book("Ahmed Hesham", 120);
        myBook.save();
    }
}
