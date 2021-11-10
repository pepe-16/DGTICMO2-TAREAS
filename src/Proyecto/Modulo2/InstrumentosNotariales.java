/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Modulo2;

/**
 *
 * @author Pepe
 */
public interface InstrumentosNotariales {

    boolean capturaRegistro();

    boolean buscarRegistro();

    boolean borrarRegistro();

    boolean actualizarRegistro();
  
    public String toString();

    public boolean equals(Object otro);
}
