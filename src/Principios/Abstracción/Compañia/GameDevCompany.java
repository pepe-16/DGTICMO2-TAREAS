package Principios.Abstracción.Compañia;

import java.util.ArrayList;

public class GameDevCompany extends Company
{
    public GameDevCompany(String name)
    {
        super(name);
    }

    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Artist());
        employees.add(new Designer());
        employees.add(new Programmer());
        employees.add(new Tester());

        return employees;
    }
}
