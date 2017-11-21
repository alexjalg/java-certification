package com.alexjalg.java.certification.herencia.metodosestaticos;

/*
 * No existe  herencia de métodos estáticos. Más cuando heredamos 
 * de una clase con métodos estáticos, podemos llamar al metodo de la 
 * clase Padre si usamos el nombre de la hija (ojo no es una buena practica).
 * */
public class Caso1 {
	public static void main(String[] args) {
		W1.method();
		Z1.method();
		Y1.method();
		X1.method();
	}
}

class W1{
	static void method() {
		System.out.println("W1");
	}	
}
class Z1 extends W1{	
}
class Y1 extends Z1{	
}
class X1 extends Y1{	
}