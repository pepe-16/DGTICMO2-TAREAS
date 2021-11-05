package PatronesCreacionales.Clase.FactoyMethod;

public class RoadLogistics extends Logistic{
	
	public Transport createTransport()
	{
		return new Truck();
	}

}
