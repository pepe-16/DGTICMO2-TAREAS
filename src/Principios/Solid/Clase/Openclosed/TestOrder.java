package Principios.Solid.Clase.Openclosed;

public class TestOrder
{
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 150, 2);
        Item funkoPopHegel = new Item(2, 450.50, 150, 3);
        Item pin = new Item(3, 55.90, 0.5, 1);

        Shipping groundShipping = new GroundShipping();
        Shipping airShipping = new AirShipping();
        Order order = new Order("MX", groundShipping);
        order.addItem(pin);
        System.out.println("Costo de envio en MX compra pequena por tierra: " + order.getShippingCost());

        order.setShipping(airShipping);
        System.out.println("Costo de envio en MX compra pequena por aire: " + order.getShippingCost());

        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);
        System.out.println("Costo de envio en MX compra grande por aire: " + order.getShippingCost());

        order.setShipping(groundShipping);
        System.out.println("Costo de envio en MX compra grande por tierra: " + order.getShippingCost());
    }
}
