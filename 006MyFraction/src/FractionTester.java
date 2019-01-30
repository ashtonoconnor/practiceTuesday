import javax.swing.JOptionPane;

public class FractionTester {

	public static void main(String[] args) {
		
		
		String msg = "Please enter the first fraction";
		String fraction1 = JOptionPane.showInputDialog(msg);
		String msg1 = "Please enter the second fraction";
		String fraction2 = JOptionPane.showInputDialog(msg1);
	
		
		Fraction myFraction = new Fraction(fraction1, fraction2);
	
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "The sum equals: " + 
		
				myFraction.setfinalNumerator(myFraction.getDenominator1(), myFraction.getDenominator2(), myFraction.getNumerator1(), myFraction.getNumerator2(), myFraction.gcd()) +
				"/" +
				myFraction.setfinalDenominator(myFraction.getDenominator1(), myFraction.getDenominator2()));
		
		
		
		
	}

}
