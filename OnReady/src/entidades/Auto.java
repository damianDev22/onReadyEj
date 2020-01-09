package entidades;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {
	
	private int puertas;
	
	public Auto(String marca, String modelo, double precio,int puertas) {
		super(marca, modelo, precio);
		this.puertas=puertas;
	}


	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	@Override
	public String formateadorPrecio(double precio) {
		
		DecimalFormat formateador = new DecimalFormat("###,###.00");
		
		String precioFormateado =null;
		
		precioFormateado ="$"+ formateador.format(precio);
		
		
		return precioFormateado;
	}

	
	@Override
	public String toString() {
		return "Marca:"+ getMarca()+"//"+"Modelo:"+getModelo()+"//"+"Puertas:"+getPuertas()+"//"+"Precio:"+formateadorPrecio(getPrecio())+"\n";
	}


	


	
	
	
}
