import java.util.Scanner;

public class Triangle {
	
	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	Scanner keyboard = new Scanner(System.in);
	
	// constructor (where class begins) goes here, its a constructor because nothing before name ->
	public Triangle() {
		
	}

	// methods go here
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		
	} // end of setVarsToZero
	
	public void showVars() {
		
	//ystem.out.println("side A = " + sideA);
	//ystem.out.println("Side B = " + sideB);
	//ystem.out.println("Side C = " + sideC);
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + theArea); 
		
	} // end of showVars
	
	public void setSides() {
		System.out.println("Please enter the value for side A:");
		sideA = keyboard.nextDouble();
		System.out.println("Please enter the value for side B:");
		sideB = keyboard.nextDouble();
		System.out.println("Please enter the value for side C:");
		sideC = keyboard.nextDouble();
		
	}
	
	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	}
	
	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p-sideC));
		
	}
	
	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0, cosB = 0.0, Bcos = 0.0, Bdeg = 0.0, cosC= 0.0, Ccos = 0.0, Cdeg = 0.0;
		
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/
				(2.0 * sideB * sideC);
		Acos = Math.acos(cosA);
		Adeg = Math.toDegrees(Acos);
		
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/
				(2.0 * sideC * sideA);
		Bcos = Math.acos(cosB);
		Bdeg = Math.toDegrees(Bcos);
		
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/
				(2.0 * sideA * sideB);
		Ccos = Math.acos(cosC);
		Cdeg = Math.toDegrees(Ccos);
		
		System.out.println("Angle A = " + Adeg);
		System.out.println("Angle B = " + Bdeg);
		System.out.println("Angle C = " + Cdeg);
		
				
		
		
	}
	
	public void showVarAngles() {
		
	}

	public void showVarsAngles() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	} // end of class