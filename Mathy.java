package edu.neumont.csc110.EquationParsing;

public class Mathy {
	
	//this class is solely to run the program
	public static void main(String[] args) {
		Polynomial p = new Polynomial("","x^2-2x+1+x^3-x^4");
		p.sortIntoStandardOrder();
		System.out.println(p);
		System.out.println(p.giveOutput(1));
	}

}