package taller3.televisores;

public class Marca {
	private String nombre;
	public Marca (String str) {
		this.nombre = str; 
	}
	public String getNombre () {
		return this.nombre;
	}
	public void setNombre (String nom) {
		this.nombre = nom;
	}
}
