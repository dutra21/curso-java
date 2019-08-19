package Exercicio2;

import java.util.*;
import javax.swing.JOptionPane;

public class OrdenarNumeros {
	public static void main(String[] args) {
		ArrayList<String> listaNumeros = new ArrayList<>();
		String num = "";
		
		for (int i = 0; i < 5; i++) {
			num = JOptionPane.showInputDialog("digite um número");
			listaNumeros.add(num);
		}

		Collections.sort(listaNumeros);
		String msg = "";
		for (int i = listaNumeros.size() -1; i >= 0; i--) {
			String numeros = listaNumeros.get(i);
			msg += numeros + " ";
		}
		JOptionPane.showMessageDialog(null, msg);

		
//		Collections.sort(listaNumeros, (o1, o2) -> o2.compareTo(o1));
//		msg = "";
//		for (String numeros : listaNumeros) {
//			msg += numeros + " ";
//		}
//		JOptionPane.showMessageDialog(null, msg);
//
//		JOptionPane.showMessageDialog(null, 
//			listaNumeros.stream()
//				.sorted((o1, o2) -> o2.compareTo(o1))
//				.collect(Collectors.joining(" "))
//		);
	}
}