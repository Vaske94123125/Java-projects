package fon;

public abstract class Zaposleni {

private String imePrezime;
protected double plata;
public String getImePrezime() {
	return imePrezime;
}
public void setImePrezime(String imePrezime) {
	this.imePrezime=imePrezime;
}
public double getPlata() {
	return plata;
}
public abstract void izracunajPlatu(int brSati);
}
