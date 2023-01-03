package fon;

public class StartUp {

private Zaposleni[] zaposleni;

public StartUp(int max) {
	zaposleni=new Zaposleni[max];
}
public void dodajZaposlenog(Zaposleni z) {
	for(int i=0;i<zaposleni.length;i++) {
		if(zaposleni[i]==null) {
			zaposleni[i]=z;
	break;
		}
}
}
public void obracunajPlate(int brDana) {
	for(int i=0;i<zaposleni.length;i++) {
		if(zaposleni[i]!=null) 
			zaposleni[i].izracunajPlatu(8*brDana);
}
}
public void prikaziIzvestajOPlati() {
	for(int i=0;i<zaposleni.length;i++) {
		if(zaposleni[i]!=null)
			System.out.println("Plata " +zaposleni[i].getImePrezime()+ " je : " +zaposleni[i].getPlata() );
}
}
}
