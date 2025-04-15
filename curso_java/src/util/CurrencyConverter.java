package util;

public class CurrencyConverter {
	
	public static double Converter(double dolar, double qnt) {
		return dolar * qnt + (0.06 * dolar * qnt);
	}
	
	
	
}
