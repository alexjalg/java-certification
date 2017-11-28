package com.alexjalg.java.certification.herencia.ejercicios;

public class Ejercicio1 {
/*leccion aprendida >> si el atributo del metodo method de la clase Ejercicio12 
 * fuera  int , no compilaria because, Cannot reduce the visibility of the inherited 
 * method from Ejercicio1.
 * inherited  = heredado
 *  
 *  */
	public void method(int i) {
		System.out.println("ejercicio1 "+i);
	}

	public static void main(String[] args) {
//		j=i; jota es menor que i
//		i=j; i es mayor que jota
//		System.out.println("Aloha");
		int i = 10;
//		long x = 20;
		new Ejercicio1().method(i);
//		new Ejercicio12().method(x);
	}
}

class Ejercicio12 extends Ejercicio1 {
//	protected void method(long i) {
//		System.out.println("ejercicio12 "+i);
//	}
	protected void method(long i) {
		System.out.println("ejercicio12 "+i);
	}
}
