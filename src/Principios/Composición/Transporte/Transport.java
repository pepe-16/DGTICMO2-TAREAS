package Principios.Composición.Transporte;

public class Transport
{
    private Engine engine;
    private Driver driver;

    public Transport(Engine engine, Driver driver)
    {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        driver.navigate();
        engine.move();
        System.out.println(cargo + " has been delivered at " + destination);
    }
}