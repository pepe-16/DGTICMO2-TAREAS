package Principios.Abstracción.Clase.Compañia;

public class Tester implements Employee
{
    public String doWork(String systemName) {
        return "Tested: " + systemName + "\n";
    }
}