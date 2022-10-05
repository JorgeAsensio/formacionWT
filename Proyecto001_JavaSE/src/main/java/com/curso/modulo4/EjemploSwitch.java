package com.curso.modulo4;

import java.util.Scanner;

public class EjemploSwitch {
	public static void main(String[] args) {
		
		System.out.println("Dime un numero");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		switch (s) {
		case "1":
			System.out.println("Caso 1");

			break;
		case "2":
			System.out.println("Caso 2");

			break;

		default:
			System.out.println("Default");
			break;
		}
	}
}
