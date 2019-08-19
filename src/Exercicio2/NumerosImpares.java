package Exercicio2;

import javax.swing.JOptionPane;

public class NumerosImpares {
		
	public static void main(String[] args) {
		int total = 1;
		String msg = "";
		
		for(int i = 1; i <= 15; i++) {
			int resto = i%2;
			
			if (resto == 1) {
				total *= i;
				msg += i + "x";
				
			}
			
		}
		JOptionPane.showMessageDialog(null, msg + "\n Total: " + total);
	}
}