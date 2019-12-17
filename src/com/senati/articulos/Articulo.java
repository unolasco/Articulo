package com.senati.articulos;

public class Articulo {

	
		// ------------ Declaracion de los atributos ---------- //
		String codigo;
		String descripcion;
		String marca;
		float precio;
		
		// ------------- Declaración de los constructores --------//
		public Articulo(String codigo, String descripcion, String marca, float precio) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.marca = marca;
			this.precio = precio;
		}

		public Articulo() {
			super();
		}


		
		// ------------ Declarar los Getters y Setters -------------------- //
		
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		// ----------- Metodo toString() con todos los campos ---------- //
		
		//@Override
		public String toString1() {
			return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precio="
					+ precio + "]";
		}
		
		// ----------- Metodo toString() con descripcion y marca ---------- //	
		//@Override
		public String toString2() {
			return "Articulo [descripcion=" + descripcion + ", marca=" + marca + "]";
		}
		
	
		
		
		
		
		
		
		
	

}
