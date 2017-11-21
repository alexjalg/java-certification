package com.alexjalg.java.certification.herencia.metodosestaticos;

public class Caso2 {

}
/*
 * El super no compila pues en el contexto estático no existe objeto 
 * donde el método sea llamado.
 * */
class W2 {
	public static void method() {
	}
}

class Z2 extends W2 {
	public static void method() {
//		super.method();
	}
}