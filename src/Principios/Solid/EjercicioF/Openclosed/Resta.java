/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principios.Solid.EjercicioF.Openclosed;

/**
 *
 * @author hallo
 */
public class Resta implements Operacion{

    public double a;
    public double b;
    public double result = 0.0;

    public Resta(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void ejecutaroperacion()
    {
    	this.result = this.a - this.b;
    }
}