package PatronesCreacionales.Clase.FactoyMethod;

import java.util.Scanner;

public class Application {
	
	private Logistic logistic;
	
	public void initialize(String logisticType) throws Exception{
		if( logisticType.equals("road"))
		{
			logistic = new RoadLogistics();
		}
		else if( logisticType.equals("sea"))
		{
			logistic = new SeaLogistics();
		}
		else {
			throw new Exception("Usupported logistics");
		}
	}
	public void main( String logisticType)throws Exception{
		this.initialize(logisticType);
		logistic.planDelivery();
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce una logistica(road/sea): ");
		String logisticType = scanner.nextLine();
		
		Application application = new Application();
		
		try {
			application.main(logisticType);
		}
		catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}

	public Logistic getLogistic() {
		return logistic;
	}

	public void setLogistic(Logistic logistic) {
		this.logistic = logistic;
	}

}
