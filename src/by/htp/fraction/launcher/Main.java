package by.htp.fraction.launcher;

import by.htp.fraction.logic.Operation;

public class Main {

	public static void main(String[] args){
		
		Operation op = new Operation();
		op.initialize();
		op.showFractions();
		op.changeArray();
		op.showFractions();
	
	}
}
