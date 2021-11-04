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
/**}
 * 
 * @ Creamos la Interfaz IPersitence para abstraer la clase Mysql y
 * lograr desacoplar el codigo.
 */
public interface IPersistence {
    public void save(Object object);
}
