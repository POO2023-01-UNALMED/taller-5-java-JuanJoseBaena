package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> lista = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		lista.add(this);
	}
     
	
	public Mamifero() {
		this("", 0, "", "", false, 0);
	}
	
	
	public static int cantidadMamiferos() {
		return lista.size();
	}
	
	
	public estatic Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	public static Mamifeo crearLeon(String nombre, inr edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	
	public ArrayList<Mamifero> getLista(){
		return lista;
	}
	public void setLista (ArrayList<Mamifero> lista) {
		Mamifero.lista = lista;
	}
	
	
	public boolean esPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}