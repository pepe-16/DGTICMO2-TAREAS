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
import java.util.Scanner;

public class Application
{
    private Dialog dialog;

    public void initialize(String operatingEnvironment) throws Exception {
        if (operatingEnvironment.equals("browser")) {
            dialog = new HTMLDialog();
        }
        else if (operatingEnvironment.equals("windows")) {
            dialog = new WindowsDialog();
        }
        else {
            throw new Exception("Unsupported operating environment.");
        }
    }

    public void main(String operatingEnvironment) throws Exception {
        this.initialize(operatingEnvironment);
        dialog.render();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Identificando entorno de ejecucion(browser/windows): ");
        String operatingEnvironment = scanner.next();

        Application application = new Application();

        try
        {
            application.main(operatingEnvironment);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
