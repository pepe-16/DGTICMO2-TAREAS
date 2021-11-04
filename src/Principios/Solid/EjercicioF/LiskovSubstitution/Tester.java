/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioF.LiskovSubstitution;

/**
 *
 * @author hallo
 */
public class Tester {
      public static void main(String[] args) {
        Adulto adulto = new Adulto("12345678A", "Cesar", "Robles","4050-5090...");
        Niño niño = new Niño("ana","sanchez", adulto);
        adulto.pagar();
        niño.getTutor().pagar();
      }
    }

