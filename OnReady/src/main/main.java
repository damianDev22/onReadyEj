package main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import entidades.*;




public class main  {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo>vehiculos= new ArrayList<Vehiculo>(); 
		
		
		vehiculos.add(new Auto("Peugeot","206",200000.00,4));
		vehiculos.add(new Moto("Honda","Titan",60000.00,125));
		vehiculos.add(new Auto("Peugeot","208",250000.00,5));
		vehiculos.add(new Moto("Yamaha","YBR",80500.50,160));
		
		
		System.out.println(vehiculos);
		vehiculoMasCaro(vehiculos);
		System.out.println("\n");
		vehiculoMasBarato(vehiculos);
		System.out.println("\n");
		buscarLetra(vehiculos,"Y");
		System.out.println("\n");
		ordenarXPrecio(vehiculos);
		
		
        
	}

	
	public static void vehiculoMasCaro(ArrayList<Vehiculo> vehiculos) {
		
		Vehiculo vehiculoMasCaro =null;
		double mayorPrecio = -999999999;
		
		Iterator<Vehiculo> it=  vehiculos.iterator();
		
		while(it.hasNext()) {	
			
			Vehiculo v =it.next();
			
			if(v.getPrecio() > mayorPrecio) {
				mayorPrecio=v.getPrecio();
				vehiculoMasCaro = v;
			}
		
		}
		
		System.out.println("Vehiculo mas caro:"+vehiculoMasCaro.getMarca()+" "+vehiculoMasCaro.getModelo());
		
	}

	public static void vehiculoMasBarato(ArrayList<Vehiculo> vehiculos) {
		
		Vehiculo vehiculoMasBarato =null;
		double menorPrecio = 999999999;
		
		Iterator<Vehiculo> it=  vehiculos.iterator();
		
		while(it.hasNext()) {	
			
			Vehiculo v =it.next();
			
			if(v.getPrecio() < menorPrecio) {
				menorPrecio=v.getPrecio();
				vehiculoMasBarato = v;
			}
		
		}
		
		System.out.println("Vehiculo mas barato:"+vehiculoMasBarato.getMarca()+" "+vehiculoMasBarato.getModelo());
		
	}
	
	public static void buscarLetra(ArrayList<Vehiculo> vehiculos,String letra){
		
		Vehiculo v =null;
		
		Iterator<Vehiculo> it=  vehiculos.iterator();
		
		while(it.hasNext()) {	
			
			Vehiculo v1 =it.next();
			int n=v1.getModelo().indexOf(letra);
			
			if(n!= -1) {
				v=v1;
			}
		
		}
		System.out.println("Vehiculo que contiene en el modelo la letrar 'Y': "
				+v.getMarca()+" "+v.getModelo()+" "+v.formateadorPrecio(v.getPrecio()));
	}

	
	public static void ordenarXPrecio(ArrayList<Vehiculo> vehiculos) {
		
		Collections.sort(vehiculos);
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		
		for(Vehiculo v :vehiculos) {
			System.out.println(v.getMarca()+" "+v.getModelo());
			
		}
		
	}

}
