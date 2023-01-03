package fon;

public abstract class GeometrijskoTelo {

protected double povrsina;
protected double zapremina;

public abstract void izracunajPovrsinu();
public abstract void izracunajZapreminu();
public double getPovrsina() {
	izracunajPovrsinu();
	return povrsina;
}
public double getZapremina() {
	izracunajZapreminu();
	return zapremina;
}
}
