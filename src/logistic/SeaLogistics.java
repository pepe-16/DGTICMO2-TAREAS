package logistic;

public class SeaLogistics extends Logistic{
	
	public Transport createTransport()
	{
		return new Ship();
	}

}
