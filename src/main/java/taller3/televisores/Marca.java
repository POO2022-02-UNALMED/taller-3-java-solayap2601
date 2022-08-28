package taller3.televisores;

public class Marca {
	private String nombre;
	public Marca (String str) {
		this.nombre = str; 
	}
	public String getMarca () {
		return this.nombre;
	}
	public void setMarca (String nom) {
		this.nombre = nom;
	}
}
