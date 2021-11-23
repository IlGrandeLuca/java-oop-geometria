package org.generation.italy.geometria;

public class Rettangolo {
	// Attributes
	int base;
	int height;

	// Methods
	Rettangolo(int base, int height) {
		this.base = base;
		this.height = height;
	}

	int areaCalculator() {
		return base * height;
	}

	int perimeterCalculator() {
		return (base * 2) + (height * 2);
	}
}
