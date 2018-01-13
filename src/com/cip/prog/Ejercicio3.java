package com.cip.prog;

import javax.swing.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Usar la funcion Math Max

	int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdusca el numero 1"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdusca el numero 2"));
	
	System.out.println("El mayor de los dos numeros es: "+Math.max(num1, num2));
	

	}

}
