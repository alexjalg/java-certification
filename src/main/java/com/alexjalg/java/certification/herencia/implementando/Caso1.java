package com.alexjalg.java.certification.herencia.implementando;

/*
 * Podemos heredar de una clase, dicha clase debe ser visible por la clase hija y 
 * de sus constructores también. El ejemplo, a continuación, no compila pues existe 
 * un constructor estándar (constructor por defecto) que se llama el constructor 
 * sin argumentos que en la clase padre no existe:
 * */
public class Caso1 {
	
	class Parent{
		Parent(int x){			
		}	
	}
//	class Child extends Parent{ compile error
//	implicit Child(){ super(); }
//	}

}
