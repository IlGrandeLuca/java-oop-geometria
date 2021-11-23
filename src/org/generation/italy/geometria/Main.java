package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Enter base: ");
		int base = in.nextInt();
		System.out.print("Enter height: ");
		int height = in.nextInt();

		Rettangolo rectangle = new Rettangolo(base, height);
		System.out.println("Perimeter: " + rectangle.perimeterCalculator());
		System.out.println("Area: " + rectangle.areaCalculator());
	}

}
