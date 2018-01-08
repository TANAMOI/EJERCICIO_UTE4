package com.cip.prog;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ims;
		System.out.println("Introduce el peso: ");
		double peso = sc.nextDouble();
		System.out.println("Introduce la altura: ");
		double altura = sc.nextDouble();

		ims = (peso / Math.pow(altura, 2.0));

		System.out.println("El IMS es: " + ims);
		System.out.printf("El IMS es: %.2f", ims);
		System.out.println("Practica correcta");

	}

}
