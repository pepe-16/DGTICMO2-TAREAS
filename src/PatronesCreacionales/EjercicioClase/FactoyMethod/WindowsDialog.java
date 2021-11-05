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
public class WindowsDialog extends Dialog
{
    @Override
    public Button createButton()
    {
        return new WindowsButton();
    }
}