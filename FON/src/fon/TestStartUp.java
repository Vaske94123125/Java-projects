package fon;

public class TestStartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StartUp s1=new StartUp(3);

Menadzer m1=new Menadzer();
m1.setImePrezime("Dragan Jakovljevic");
s1.dodajZaposlenog(m1);


KancelarijskiRadnik r1=new KancelarijskiRadnik();
r1.setImePrezime("Jovan Novic");
s1.dodajZaposlenog(r1);

KancelarijskiRadnik r2=new KancelarijskiRadnik();
r2.setImePrezime("Dragutin Ivanic");
s1.dodajZaposlenog(r2);

s1.obracunajPlate(21);
s1.prikaziIzvestajOPlati();

	}

}
