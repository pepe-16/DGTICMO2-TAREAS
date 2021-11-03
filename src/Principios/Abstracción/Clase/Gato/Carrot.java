package Principios.Abstracción.Clase.Gato;

public class Carrot implements Food
{
    private double nutrition;

    public Carrot(double nutrition)
    {
        this.nutrition = nutrition;
    }

    @Override
    public double getNutrition()
    {
        return nutrition;
    }

    public void setNutrition(double nutrition)
    {
        this.nutrition = nutrition;
    }
}
