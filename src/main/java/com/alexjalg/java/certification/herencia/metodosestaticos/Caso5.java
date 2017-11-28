package com.alexjalg.java.certification.herencia.metodosestaticos;

public class Caso5 {
	public static void main(String[] args) {
		Caso5W w = new Caso5W();
		w.method();
		
		Caso5Z z = new Caso5Z();
		z.method();
		
		Caso5W zPolimorphedAsW = z;
		zPolimorphedAsW.method();		
	}	
}

class Caso5W {
	
	public static void method() {
		System.out.println("W");		
	}
}

class Caso5Z extends Caso5W{
	public static void method() {
		System.out.println("Z");
	}
}