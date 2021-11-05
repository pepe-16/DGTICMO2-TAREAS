package PatronesCreacionales.Clase.FactoyMethod;

public class SeaLogistics extends Logistic{
	
	public Transport createTransport()
	{
		return new Ship();
	}

}
