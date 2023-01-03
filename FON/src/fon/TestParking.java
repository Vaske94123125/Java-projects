package fon;

public class TestParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parking p1=new Parking(50);
		p1.uvediNaParking("BG 123-456");
		p1.uvediNaParking("NS 234-56");
		
		p1.ispisi();
		p1.ispisiBG();
	}

}
