package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> lista = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	public String colorEscamas;
	private int cantidadAletas;
	
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		lista.add(this);
	}
	
	
	public Pez() {
		this ("", 0, "", "", "", 0);
	}
	
	
	public static int cantidadPeces() {
		return lista.size();
	}
	
	
	public String movimiento() {
		return "nadar";
	}
	
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos ++;
		return new Pez(nombre, edad, " oceano", genero, "gris", 6);
	}
	
	
	public ArrayList<Pez> getLista(){
		return lista;
	}
	public void setLista(ArrayList<Pez> lista) {
		Pez.lista = lista;
	}
	
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas (String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}