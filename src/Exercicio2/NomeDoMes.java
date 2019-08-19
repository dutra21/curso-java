package Exercicio2;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class NomeDoMes {
	
	public static void main(String[] args) {
		String dialog = JOptionPane.showInputDialog("Digite o número referente a um mês");
		int mes = Integer.parseInt(dialog);
		
		Map<Integer, String> mapaMeses = new LinkedHashMap<Integer, String>();
		mapaMeses.put(1, "Janeiro");
		mapaMeses.put(2, "Fevereiro");
		mapaMeses.put(3, "Março");
		mapaMeses.put(4, "Abril");
		mapaMeses.put(5, "Maio");
		mapaMeses.put(6, "Junho");
		mapaMeses.put(7, "Julho");		
		mapaMeses.put(8, "Agosto");
		mapaMeses.put(9, "Setembro");
		mapaMeses.put(10, "Outubro");
		mapaMeses.put(11, "Novembro");
		mapaMeses.put(12, "Dezembro");
		
		if(mes <= 0 || mes > 12) {
			JOptionPane.showMessageDialog(null, "O nome do mês é: inválido");
		} else {
			String resp = mapaMeses.get(mes);
			JOptionPane.showMessageDialog(null, "O nome do mês é: " + resp);
		}
	}

}
