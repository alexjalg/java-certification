package com.alexjalg.java.certification.herencia.implementando;

public class Caso3 {

	/*
	 * La clase padre no puede ser final, debe ser visible para las clases hijas
	 */
	// final class Parent {
	// }
	// class Child extends Parent { //compile error
	// }

	class Parent {
	}

	final class Child extends Parent { // Ok
	}

}
