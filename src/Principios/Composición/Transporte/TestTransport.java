package Principios.Composición.Transporte;

public class TestTransport
{
    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Driver driver = new Robot();
        Engine fusionEngine = new FusionEngine();

        Transport transport = new Transport(engine, driver);
        transport.deliver("Merida", "Libros");

        Transport transport2 = new Transport(fusionEngine, driver);
        transport2.deliver("Merida", "Libros");
    }
}