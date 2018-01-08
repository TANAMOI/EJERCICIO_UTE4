package com.cip.prog;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		// calcular el area de un circulo

		double area;
		double radio;
		Scanner sc = new Scanner(System.in);

		System.out.println("introdusca el radio :");
		radio = sc.nextDouble();
		double r = Math.pow(radio, 2);

		area = Math.PI * r;

		System.out.println("el Area es: " + area);
		System.out.printf("El area es: %.2f", area);
	}

}
