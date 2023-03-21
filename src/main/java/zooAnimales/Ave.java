package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> lista = new Array List<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String,colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Lista.add(this);
	}
	
	
	public Ave() {
		this("", 0, "", "", "",);
	}
	
	
	public static int cantidadAves() {
		return Lista.size();
	}
	
	
	public String movimiento() {
		return "volar";
	}
	
	
	public static Ave crearHalco(String nombre, int edad, String genero) {
		halcones ++;
		return new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	
	public ArrayList<Ave> getLista(){
		return lista;
	}
	public void setLista(ArrayList<Ave> lista) {
		Ave.Lista = lista;
	}
	public void setLista(ArrayList<Ave> lista) {
		Ave.Lista = lista;
	}
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(Sring colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
