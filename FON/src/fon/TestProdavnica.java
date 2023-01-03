package fon;

public class TestProdavnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Prodavnica p1=new Prodavnica();
Skladiste s1=new Skladiste();
Dobavljac d1=new Dobavljac();

p1.ispisi();

d1.izvrsiIsporuku(p1, 100);
d1.izvrsiIsporuku(s1, 500);

p1.ispisi();
	}

}
