

public class Runner {
	
	public static void main(String[] args) {
		
		JOptionPane
		
		// Instantiate each class

		Triangle myTriangle = new Triangle();
		myTriangle.setVarsToZero();
		//myTriangle.showVars();
		myTriangle.setSides();
		//myTriangle.showVars();
		myTriangle.calcPerimeter();
		//myTriangle.showVars();
		myTriangle.calcArea();
		myTriangle.showVars();
		myTriangle.calcAngles();
		myTriangle.showVarsAngles();
		
		Circle myCircle = new Circle();
		myCircle.setVarstoZero();
		
	}
}
