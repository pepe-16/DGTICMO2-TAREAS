package Principios.Solid.Clase.SingleResponsibility;

public class TimeSheetReport
{
    public void print(Employee2 employee) {
        System.out.println("Time sheet of " + employee.getName());
        System.out.println("Hours worked: ...");
        System.out.println("Holidays: ...");
        System.out.println("Days off: ...");
    }
}