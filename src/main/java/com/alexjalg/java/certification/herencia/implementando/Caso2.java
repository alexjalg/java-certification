package com.alexjalg.java.certification.herencia.implementando;

public class Caso2 {

	public static void main(String[] args) {
		Caso2 caso = new Caso2();
		caso.new Child();
		/*
		 * Imprime:
		 * 
		 * GRANDPARENT 
		 * PARENT
		 * CHILD
		 * 
		 * Ya que implicitamente el constructor de Child invoca al constructor de Parent
		 * y este a su vez a la clase padre
		 * Ademas el constructor del Padre es lo primero que se ejecuta si codeamos para que
		 * el constructor se ejecutara en segundo orden o mas con respecto a 
		 * otra sentencia no compilaria 
		 * el programa
		 * */

	}

	class GrandParent{
		public GrandParent() {
			System.out.println("GRANDPARENT");
		}
	}
	
	class Parent extends GrandParent{
		public Parent() {
			System.out.println("PARENT");
		}
	}

	class Child extends Parent{
		public Child() {
			System.out.println("CHILD");
		}
	}
}
