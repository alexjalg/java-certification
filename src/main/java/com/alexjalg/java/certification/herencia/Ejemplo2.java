/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alexjalg.java.certification.herencia;

/**
 *
 * @author Alejandro Laura Gonzalo ^.^ 
 */
public class Ejemplo2 extends Ejemplo1{
	
	public Ejemplo2() {
		super();
		System.out.println("CONSTRUCTOR EJEMPLO2");		
	}
	
	public void hacerAlgo() {
		super.hacerAlgo();
		System.out.println("LO HICE EN LA SEGUNDA");
	}
	
	public static void main(String[] args) {
		Ejemplo2 ejem = new Ejemplo2();
		ejem.hacerAlgo();
	}

}
