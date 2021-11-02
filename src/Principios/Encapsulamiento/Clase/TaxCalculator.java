package Principios.Encapsulamiento.Clase;

public class TaxCalculator {
    public double getTaxRate(String country) {
        if (country == "MX") {
            return 0.16;
        }
        else if (country == "US") {
            return 0.07;
        }
        else if (country == "EU") {
            return 0.20;
        }
        else if (country == "JP") {
            return 0.10;
        }
        else {
            return 0;
        }
    }
}