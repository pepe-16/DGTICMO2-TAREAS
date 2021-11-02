package Principios.Abstracción.Compañia;

public class TestCompany
{
    public static void main(String[] args) {
        Company gameDevCompany = new GameDevCompany("A tu medida");
        System.out.println(gameDevCompany.createSoftware("Pokemon"));

        Company businessSwDevCompany = new BusinessSwDevCompany("A tu medida");
        System.out.println(businessSwDevCompany.createSoftware("Nomina"));
    }
}