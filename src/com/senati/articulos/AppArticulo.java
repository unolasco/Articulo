package com.senati.articulos;

public class AppArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo articulo1 = new  Articulo("11111","mouse","hp",50);
		System.out.println(articulo1.toString1());
		System.out.println(articulo1.toString2());
		
		
		Articulo articulo2 = new  Articulo("22222","teclado","acer",80);
		System.out.println(articulo2.toString1());
		System.out.println(articulo2.toString2());
		
		Articulo articulo3 = new  Articulo("33333","monitor","lg",270);
		System.out.println(articulo3.toString1());
		System.out.println(articulo3.toString2());
		
	}

}
