/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Abstracción.Ejercicio.Gato;

import java.util.Date;

/**
 *
 * @author hallo
 */
public class Ensalada implements Food{
    
    private double nutrition;
    private Date expiration;
    private String tipoTaco;
    
    public double getNutrition() {
        return nutrition;
    }

    public void setNutrition(double nutrition) {
        this.nutrition = nutrition;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getTipoTaco() {
        return tipoTaco;
    }

    public void setTipoTaco(String tipoTaco) {
        this.tipoTaco = tipoTaco;
    }
    public Ensalada (double nutrition, Date expiration, String tipoTaco) {
        this.nutrition = nutrition;
        this.expiration = expiration;
        this.tipoTaco = tipoTaco;
    }
    
}
