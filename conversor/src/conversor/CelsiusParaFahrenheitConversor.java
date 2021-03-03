package conversor;

public class CelsiusParaFahrenheitConversor {
	public static void main (String[] args) {
		
		double Celsius = 35;
		double Fahrenheit;
		
		Fahrenheit = ((Celsius * 9) + 160) /5;
		
		System.out.println(Fahrenheit + " graus Fahrenheit");
		System.out.println(Celsius + " " + Fahrenheit);
		
	}

}

