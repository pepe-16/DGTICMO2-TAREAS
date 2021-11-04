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
public class Calculadora {

    public void calculate(Operacion operation) throws Exception {

        if (operation == null) {
            throw new Exception("Can not perform operation");
        }

        operation.ejecutaroperacion();
    }

    public static void main(String[] args) throws Exception {
        Calculadora obj = new Calculadora();

        Suma add = new Suma(10, 5);
        obj.calculate(add);

        System.out.println("resultado: " + add.result);

        Resta subs = new Resta(10, 5);
        obj.calculate(subs);
        System.out.println("resultado: " + subs.result);

        Multiplicacion mul = new Multiplicacion(10, 5);
        obj.calculate(mul);
        System.out.println("resultado: " + mul.result);

        Divison div = new Divison(10, 5);
        obj.calculate(div);
        System.out.println("resultado: " + div.result);
    }

}
