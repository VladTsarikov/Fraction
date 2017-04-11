package by.htp.fraction.logic;

import java.util.Scanner;

import by.htp.fraction.entity.Fraction;

public class Operation {
	
	public void initialize(){
		
		Fraction fr = new Fraction();
		
		System.out.println("Enter the count of arrays element: ");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		double[] fractions = new double[n];
		
		for(int i = 0; i < fractions.length;i++){
			fr.setF(fr.generate(), fr.generate());
			fractions[i] = fr.getF();
			
		}
		Fraction.setFractions(fractions);
	}
	
	public void showFractions(){
		for(int i = 0; i < Fraction.getFractions().length;i++){
			System.out.printf("%.2f",Fraction.getFractions()[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public void changeArray(){
		for(int i = 0; i < Fraction.getFractions().length; i++){
			if(i!=0 && i%2==0 && Fraction.getFractions()[i] != Fraction.getFractions()[Fraction.getFractions().length-1] ){
				Fraction.getFractions()[i] = Fraction.getFractions()[i]+Fraction.getFractions()[i+1];
			}
		}
	}
	
}
