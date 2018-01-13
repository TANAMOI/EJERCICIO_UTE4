package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Mostrar el menor de dos numeros que pido por pantalla

		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdusca el numero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdusca el numero 2"));

		System.out.println("El mayor de los dos numeros es: " + Math.min(num1, num2));

	}

}
