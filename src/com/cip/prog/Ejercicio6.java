package com.cip.prog;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Formatear la salida de un decimal por pantalla
		
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Introdusca el primer numero");
		double x = sc.nextDouble();
		System.out.println("Introdusca el segundo numero");
		double y = sc.nextDouble();
		
		double d = (x/y);
		
		
		System.out.printf("El resultado de la division es:%.2f", d);
				
		

	}

}
