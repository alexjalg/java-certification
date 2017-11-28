package com.alexjalg.java.certification.herencia.metodosestaticos;

public class Caso6 extends Object {
	String color = "ROJO";

	public String toString() {
		return "Color = " + this.color;
	}

	public static void main(String[] args) {
		Caso6 caso6 = new Caso6();
		System.out.println(caso6);
		
		String string = "Color = " + caso6;
		System.out.println(string);
	}
}
