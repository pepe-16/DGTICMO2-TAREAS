package Principios.Abstracción.Clase.Compañia;

import java.util.ArrayList;

public abstract class Company
{
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name)
    {
        this.name = name;
    }

    public abstract ArrayList<Employee> getEmployees();

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String createSoftware(String systemName) {
        StringBuilder system = new StringBuilder();
        employees = getEmployees();

        for (Employee employee: employees) {
            system.append(employee.doWork(systemName));
        }

        return system.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}