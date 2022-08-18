package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")

public class Articulo {
	
	//ENTITY ATRIBUTES
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "precio")
		private float precio;
		
		@ManyToOne
	    @JoinColumn(name="fab_id")
	    private Fabricante fabricante;

		//CONTRUCTORS
		/**
		 * 
		 */
		public Articulo() {
			//super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param id
		 * @param nombre
		 * @param precio
		 * @param fabricante
		 */
		public Articulo(Long id, String nombre, float precio, Fabricante fabricante) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricante = fabricante;
		}

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the precio
		 */
		public float getPrecio() {
			return precio;
		}

		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(float precio) {
			this.precio = precio;
		}

		/**
		 * @return the fabricante
		 */
		public Fabricante getFabricante() {
			return fabricante;
		}

		/**
		 * @param fabricante the fabricante to set
		 */
		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}

		@Override
		public String toString() {
			return "Articulo [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante
					+ "]";
		}
		
		


		
		
		
		
		
		
		
	

}
