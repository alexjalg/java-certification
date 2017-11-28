package com.alexjalg.java.certification.herencia.ejercicios;

import java.io.*;
/*
 * los modificadores de las clases en las clases hijas pueden tener mayor visibilidad.
 * las Excepciones pueden ser las mismas en las clases hijas o mas especificas
 * 
 * */
public class Ejercicio2 {
	protected void turnon() throws IOException {
	}
}

class Ejercicio22 extends Ejercicio2 {
	public void turnon() throws FileNotFoundException {
	}
}