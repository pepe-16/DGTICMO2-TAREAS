/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioF.DependencyInversion;

/**
 *
 * @author Pepe
 */
public class Oracle implements IPersistence{
      public void save(Object object) {
        System.out.println("Save Oracle ok...");
    }
}
