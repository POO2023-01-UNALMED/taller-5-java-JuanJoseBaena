package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> lista = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		lista.add(this);
	}
	
	
	public Retil() {
		this("", 0, "", "", "", 0);
	}
	
	
	public static int cantidadReptiles() {
		return lista.size();
	}
	
	
	public String movimiento() {
		return "reptar";
	}
	
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero){
		serpientes ++;
		return new Reptil(nombre, edad, "jungla", jungla, genero "blanco", 1)
	}
	
	
	public ArrayList<Reptil>getLista(){
		return lista;
	}
	public void setLista(ArrayList<Reptil> lista) {
		Reptil.lista = lista;
	}
	
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorColorEscamas (String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}