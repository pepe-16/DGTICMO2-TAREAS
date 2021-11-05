/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesCreacionales.EjercicioClase.FactoyMethod;

/**
 *
 * @author Pepe
 */
public class WindowsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Painting a windows style button.");
    }

    @Override
    public void onClick(String function)
    {
        System.out.println("Executing function " + function + " on windows");
    }
}
