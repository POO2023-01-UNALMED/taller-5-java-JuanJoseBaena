package gestion;

import java.awt.List;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<List> zonas = new ArrayList<Zona>();
	
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico () {
		this(null, null);
	}
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int contador = 0;
		for (int i = 0; i<zonas.size(); i++) {
			contador += zonas.get(i).cantidadAnimales();
		}
		return contador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}