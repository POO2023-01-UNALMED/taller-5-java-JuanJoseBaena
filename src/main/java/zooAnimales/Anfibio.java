package zooAniamales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> lista = new Arraylist<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		lista.add(this);
	}
	
	
	public Anfibio() {
		this("",0,"","","",false);
	}
	
	
	public static int cantidadAnfibios() {
		return lista.size();
	}
	
	
	public String movimiento() {
		return "saltar";
	}
	
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	
	public ArrayList<Anfibio>getLista(){
		return lista;
	}
	public void setLista(ArrayList<Anfibio> lista) {
		Anfibio.lista = lista;
	}
	
	
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}