package by.htp.fraction.entity;

public class Fraction {

	private int m;
	private int n;
	private double f;
	private static double[] fractions;
	
	public Fraction(){
	
	}

	public Fraction(double[] fractions) {
		super();
		this.fractions = fractions;
	}

	public double getF() {
		this.f =(double) m/n;
		return  f;
	}

	public void setF(int m,int n) {
		this.m = m;
		this.n = n;
		this.f =(double) m/n;
	}

	public static double[] getFractions() {
		return fractions;
	}

	public static void setFractions(double[] fractions) {
		Fraction.fractions = fractions;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int generate(){
		int a;
		do{
		a = -100 + (int) (Math.random() * (100+100)+1);
		}
		while(a == 0);	
		return a;
	}
	
}
