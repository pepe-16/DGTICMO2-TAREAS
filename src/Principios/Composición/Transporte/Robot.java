package Principios.Composición.Transporte;

public class Robot implements Driver
{
    @Override
    public void navigate()
    {
        System.out.println("Automatically drive");
    }
}