package taller3.televisores;

public class Control {
	private TV tele;
	public void turnOff() {
		tele.turnOff();
	}
	public void turnOn() {
		tele.turnOn();
	}
	public void canalUp() {
		if((tele.getCanal()<120) && (tele.getCanal()>0) &&(tele.getEstado()==true)) {
			tele.canalUp();
		}
	}
	public void canalDown() {
		if((tele.getCanal()<121) && (tele.getCanal()>1) &&(tele.getEstado()==true)) {
			tele.canalDown();
		}
	}
	public void volumenUp() {
		if((tele.getVolumen()<7) && (tele.getVolumen()>=0) &&(tele.getEstado()==true)) {
			tele.volumenUp();
		}
	}
	public void volumenDown() {
		if((tele.getVolumen()<8) && (tele.getVolumen()>0) &&(tele.getEstado()==true)) {
			tele.volumenDown();
		}
	}
	public void setCanal(int cha) {
		tele.setCanal(cha);
	}
	public void enlazar(TV tv) {
		tele = tv;
		tv.setControl(this);
	}
	public TV getTV() {
		return tele;
	}
	public void setTV(TV tv) {
		tele = tv;
	}
}
