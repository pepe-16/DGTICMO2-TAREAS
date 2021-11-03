package Principios.Abstracción.Clase.Compañia;

public class Designer implements Employee
{
    public String doWork(String systemName) {
        return "Here's the architecture for: " + systemName + "\n";
    }
}