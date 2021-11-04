package Principios.Solid.Clase.SingleResponsibility;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee lola = new Employee("Lola");
        lola.printTimeSheetReport();
    }
}