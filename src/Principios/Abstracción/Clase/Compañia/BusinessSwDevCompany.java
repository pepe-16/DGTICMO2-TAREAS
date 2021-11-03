package Principios.Abstracción.Clase.Compañia;

import java.util.ArrayList;

public class BusinessSwDevCompany extends Company
{
    public BusinessSwDevCompany(String name)
    {
        super(name);
    }

    public ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new BusinessAnalyst());
        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());

        return employees;
    }
}