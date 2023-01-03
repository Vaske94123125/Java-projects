package fon;

public class Parking {

private ParkingMesto[] mesta;
public Parking(int max) {
	if(max>0) {
		mesta=new ParkingMesto[max];
	}
	else {
		mesta=new ParkingMesto[40];
		System.out.println("Greska 1");
	}
	for(int i=0;i<mesta.length;i++) {
		mesta[i]=new ParkingMesto();
		mesta[i].setSlobodno(true);
	}
}
public void ispisiPrvo() {
	if(mesta[0].isSlobodno())
		System.out.println("Prvo mesto je slobodno");
	else
		System.out.println("Registarski broj kola je: " +mesta[0].getRegistarskiBroj());
}
public void ispisiPoslednje() {
	if(mesta[mesta.length-1].isSlobodno())
		System.out.println("Poslednje mesto je slobodno");
	else
		System.out.println("Registarski broj kola je: " +mesta[mesta.length-1].getRegistarskiBroj());
}
public boolean imaSlobodnih() {
	for(ParkingMesto mesto : mesta)
		if(mesto.isSlobodno())
			return true;
	return false;
}
public int brojSlobodnih() {
	int b=0;
	for(ParkingMesto mesto : mesta)
		if(mesto.isSlobodno()) 
			b++;
	return b;
		
}
public boolean daLiJeNaParkingu(String registarskiBroj) {
	String reg;
	for(ParkingMesto mesto : mesta)
		if(!(mesto.isSlobodno())) {
			reg=mesto.getRegistarskiBroj();
			if(reg.equals(registarskiBroj)) 
				return true;
		}
return false;
		}
public void uvediNaParking(String registarskiBroj) {
		if(!imaSlobodnih())
				System.out.println("Nema slobodnih mesta");
		else {
			for(ParkingMesto mesto : mesta)
				if(mesto.isSlobodno()) {
					mesto.setRegistarskiBroj(registarskiBroj);
					mesto.setSlobodno(false);
					break;
				}
		}
	
}
public void izvediSaParkinga(String registarskiBroj) {
	if(!daLiJeNaParkingu(registarskiBroj))
		System.out.println("Vozilo nije na parkingu");
	else {
		for(ParkingMesto mesto : mesta)
			if(!(mesto.isSlobodno()) && mesto.getRegistarskiBroj().equals(registarskiBroj)) {
				mesto.setRegistarskiBroj(null);
				mesto.setSlobodno(true);
				break;
	}
}
}
public void ispisi() {
	for(int i=0;i<mesta.length;i++)
		if(!mesta[i].isSlobodno())
		System.out.println("Registarski brojevi vozila su: " +mesta[i].getRegistarskiBroj()+" na mestu broj " +i);
}
public void ispisiBG() {
	String sc;
	for(int i=0;i<mesta.length;i++)
		if(!mesta[i].isSlobodno()) {
			sc=mesta[i].getRegistarskiBroj().substring(0, 2);
	if(sc.equals("BG"))
		System.out.println("Mesto br: " +i+ " reg br" +mesta[i].getRegistarskiBroj());
		}
	

}
}
