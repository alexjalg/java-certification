package com.alexjalg.java.certification.herencia.ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		Ejercicio5B ejercicio5b = Ejercicio5B.Ejercicio5B("t");
	}

}

class Ejercicio5B {
	private Ejercicio5B() {
	}

	static Ejercicio5B Ejercicio5B(String s) {
		return new Ejercicio5B();
	}
}
