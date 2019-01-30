/**
 * Add two fractions. Learn Javadocs. Enter the two fractions as Strings
 * then use String methods to pull out numerator and denominator.
 * Use common denominator to add, then reduce to lowest common denominator
 * (first grade)
 * Add, subtract, multiply, divide = (second grade)
 * WITH JAVA DOCS
 * @author Ashton O'Connor
 * 
 */
public class Fraction {
	
	
	private int numerator1;
	private int denominator1;
	private int numerator2;
	private int denominator2;
	private int finalDenominator;
	private int finalNumerator;

	
	public Fraction (String passFraction, String passFraction2) {
		
		int separatorLocation = passFraction.indexOf("/");
		String strNumerator1 = passFraction.substring(0,separatorLocation);
		String strDenominator1 = passFraction.substring(separatorLocation + 1);
		String strNumerator2 = passFraction2.substring(0,separatorLocation);
		String strDenominator2 = passFraction2.substring(separatorLocation + 1);
		

		this.numerator1 = Integer.parseInt(strNumerator1);
		this.denominator1 = Integer.parseInt(strDenominator1);
		
		this.numerator2 = Integer.parseInt(strNumerator2);
		this.denominator2 = Integer.parseInt(strDenominator2);
	}

	
	public int getNumerator1() {
		return numerator1; 
		
	}
	public int getNumerator2() {
		return numerator2;
	}
	
	public void setNumerator(int numerator1) {
		this.numerator1 = numerator1;
	}
	public void setNumerator2(int numerator2) {
		this.numerator2 = numerator2;
	}
	
	public int getDenominator1() {
		return denominator1;
	}
	public int getDenominator2() {
		return denominator2;
	}
	public void setDenominator1(int denominator1) {
		this.denominator1 = denominator1;
	}
	public void setDenominator2(int denominator2) {
		this.denominator2 = denominator2;
	}
	
	
	
	
	public int gcd() {
		if (finalNumerator == 0 || finalDenominator == 0)
			return 0;

		int a = Math.max(Math.abs(finalNumerator), Math.abs(finalDenominator));
		int b = Math.min(Math.abs(finalNumerator), Math.abs(finalDenominator));

		int rem = a % b;

		while (rem != 0) {
			a = b;
			b = rem;
			rem = a % b;
		}
		System.out.println(b);
		return b;
		
	}
	public int setfinalNumerator(int denominator1, int denominator2, int numerator1, int numerator2, int b) {
		finalNumerator = (denominator1*numerator2) + (denominator2 * numerator1);
		if (finalNumerator != 0 && finalDenominator != 0) {
			
			
			
			
			
			finalNumerator = finalNumerator / b;
		
		}
		return finalNumerator;
	}
	
	
	public int setfinalDenominator(int denomiator1,int denominator2) {
		finalDenominator = denominator1 * denominator2;
		
	
		
		if (finalNumerator != 0 && finalDenominator != 0) {
			int commonDivisor = gcd();
			finalDenominator /= commonDivisor;
		}
		
		return finalDenominator;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


