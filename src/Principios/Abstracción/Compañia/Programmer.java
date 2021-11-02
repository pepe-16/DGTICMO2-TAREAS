package Principios.Abstracción.Compañia;

public class Programmer implements Employee
{
    public String doWork(String systemName) {
        return "Here's the code for: " + systemName + "\n";
    }
}
