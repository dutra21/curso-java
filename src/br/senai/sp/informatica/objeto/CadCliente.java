package br.senai.sp.informatica.objeto;

import javax.swing.JOptionPane;

public class CadCliente {
	public static void main(String[] args) {
		
		Cliente novo = new Cliente();
		String temp = JOptionPane.showInputDialog("Informe o nome");
		novo.setNome(temp);
		
		temp = JOptionPane.showInputDialog("Informe o email");
		novo.setEmail(temp);
		
		temp = JOptionPane.showInputDialog("Informe a idade");
		novo.setIdade(Integer.parseInt(temp));
		
		System.out.println(novo);
	}
}
