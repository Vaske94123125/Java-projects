package fon;

public class TestZaposleni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

KancelarijskiRadnik k1=new KancelarijskiRadnik();
k1.izracunajPlatu(250);
System.out.println("Plata kancelarijskog radnika je: " +k1.getPlata());
Menadzer m1=new Menadzer();
m1.izracunajPlatu(200);
System.out.println("Plata Menadzera je: " +m1.getPlata());
	}

}
