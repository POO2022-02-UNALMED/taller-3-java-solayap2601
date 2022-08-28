package taller3.televisores;

public class TV {
	private static int numTV;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	public TV (Marca brand, Boolean prend) {
		marca = brand;
		estado = prend;
		numTV += 1;
	}
	public Marca getMarca () {
		return marca;
	}
	public void setMarca (Marca nom) {
		marca = nom;
	}
	public Control getControl () {
		return control;
	}
	public void setControl(Control nom) {
		control = nom;
	}
	public int getPrecio () {
		return precio;
	}
	public void setPrecio (int nom) {
		precio = nom;
	}
	public int getVolumen () {
		return volumen;
	}
	public void setVolumen (int nom) {
		if((nom>=0) && (nom<=7) && (estado==true)) {
			volumen = nom;
			}
	}
	public int getCanal () {
		return canal;
	}
	public void setCanal (int nom) {
		if((nom>0) && (nom<121) && (estado==true)) {
		canal = nom;
		}
	}
	public static void setNumTV(int nom) {
		numTV = nom;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if((canal<120) && (canal>0) &&(estado==true)) {
			canal+=1;
		}
	}
	public void canalDown() {
		if((canal<121) && (canal>1) &&(estado==true)) {
			canal-=1;
		}
	}
	public void volumenUp() {
		if((volumen<7) && (volumen>=0) &&(estado==true)) {
			volumen+=1;
		}
	}
	public void volumenDown() {
		if((volumen<8) && (volumen>0) &&(estado==true)) {
			volumen-=1;
		}
	}
}

