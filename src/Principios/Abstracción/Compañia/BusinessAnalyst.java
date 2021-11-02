package Principios.Abstracción.Compañia;

public class BusinessAnalyst implements Employee
{
    public String doWork(String systemName) {
        return "Here's the business analysis for: " + systemName + "\n";
    }
}