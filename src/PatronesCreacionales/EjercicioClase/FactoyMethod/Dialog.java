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
public abstract class Dialog
{
    public void render() {
        Button okButton = createButton();
        okButton.onClick("close");
        okButton.render();
    }

    public abstract Button createButton();
}
