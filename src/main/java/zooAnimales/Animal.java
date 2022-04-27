package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		this (null, 0, null, null);
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	//getters and setters
	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	//método Movimiento
	public String movimiento() {
		return "desplazarse";
	}

	//método totalPorTipo
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
                "Aves: " + Ave.cantidadAves() + "\n" +
                "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
                "Peces: " + Pez.cantidadPeces() + "\n" +
                "Anfibios: " + Anfibio.cantidadAnfibios();
		
	}
	
	//Método toString sobreescrito
	@Override 
	public String toString() {
		if(zona != null) 
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
					" y mi genero es " + genero + ", la zona en la que me ubico es" + zona + ", en el "+ zona.getZoo().getNombre();
		else
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
					" y mi genero es " + genero;
	}
	
	
}