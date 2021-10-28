package logistic;

public class RoadLogistics extends Logistic{
	
	public Transport createTransport()
	{
		return new Truck();
	}

}
