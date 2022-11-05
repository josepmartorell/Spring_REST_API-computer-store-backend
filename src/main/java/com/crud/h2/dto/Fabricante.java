package com.crud.h2.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="fabricante")
public class Fabricante  {
 
	//ENTITY ATRIBUTES
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha = new Date();//CURRENT DATE
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Articulo> articulo;
	
	//CONSTRUCTORS
	
	public Fabricante() {
	
	}
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param fecha
	 * @param articulo
	 */
	public Fabricante(Long id, String nombre, Date fecha, List<Articulo> articulo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.articulo = articulo;
	}

	//Getters y Setters
	

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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the articulo
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}


	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}


	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}



	
	
	
	
}
