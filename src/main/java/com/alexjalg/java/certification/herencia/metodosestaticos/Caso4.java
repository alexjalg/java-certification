package com.alexjalg.java.certification.herencia.metodosestaticos;

/*
 * Podemos escribir una subclase con un método estático del mismo nombre 
 * que en la clase padre, pero, eso no es sobreescritura:
 * */
class Caso4W {
	public static void method() {
		System.out.println("W");
	}
}

class Caso4Z extends Caso4W{
	public static void method() {
		System.out.println("Z");
	}
}

public class  Caso4{
	public static void main(String[] args) {
		Caso4W.method();
		Caso4Z.method();
//		System.out.println(Caso4W.method());
	}
}