package entidades;

import interfaz.FormatoPrecio;



public abstract class Vehiculo implements Comparable,FormatoPrecio{
	

	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {			
		this.precio = precio;
	}

	
	public int compareTo(Object obj){
		 		
		Vehiculo vehiculoTemporal=(Vehiculo) obj;
 
		if(this.precio>vehiculoTemporal.getPrecio())
			return -1;
		else if(this.precio<vehiculoTemporal.getPrecio())
			return 1;
		return 0;
	}
	
	
}
