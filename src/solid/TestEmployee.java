package solid;
public class TestEmployee {
	
	public static void main(String[] args) {
	Employee lola = new Employee("lola");
	TimeSheetReport reporte = new TimeSheetReport();
	reporte.printTimeSheetReport(lola);
	TimeSheetSSN reporte2 = new TimeSheetSSN();
	lola.setSsn("123456789");
	reporte2.printTimeSheetReport(lola);
	
	
	}
}
