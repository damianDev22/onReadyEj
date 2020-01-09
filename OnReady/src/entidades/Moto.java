package entidades;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {
	
	private int cilindrada;
	
	public Moto(String marca, String modelo, double precio,int cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada=cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
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
		return "Marca:"+ getMarca()+"//"+"Modelo:"+getModelo()+"//"+"Cilindrada:"+getCilindrada()+"Cc"+"//"+"Precio:"+formateadorPrecio(getPrecio())+"\n";
	}



	
	
}
