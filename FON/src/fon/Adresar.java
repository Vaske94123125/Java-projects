package fon;

public class Adresar {

private Kontakt[] kontakti;
public Adresar() {
	kontakti = new Kontakt[250];
	
}
public boolean imaSlobodnih() {
	for(Kontakt kontakt : kontakti)
		if(kontakt==null)
			return true;
	return false;
}
public void unesiUAdresar(Kontakt k) {
	if(!imaSlobodnih())
		System.out.println("Nema slobodnih");
	else 
		for(int i=0;i<kontakti.length;i++)
			if(kontakti[i]==null) {
				kontakti[i]=k;
				break;
		
	}
}
public void unesiUAdresar(String imePrezime, String adresa, int telefon) {
if(!imaSlobodnih())
	System.out.println("Nema mesta u adresaru");
else
	for(int i=0;i<kontakti.length;i++)
		if(kontakti[i]==null) {
			kontakti[i]=new Kontakt();
			kontakti[i].setAdresa(adresa);
			kontakti[i].setImePrezime(imePrezime);
			kontakti[i].setTelefon(telefon);
			break;
		}
}
public void izbaciIzAdresara(String imePrezime) {
		for(int i=0;i<kontakti.length;i++)
			if(kontakti[i]!=null && kontakti[i].getImePrezime().equals(imePrezime)) {
				kontakti[i]=null;
				break;
			}
}
public void ispisi() {
	for(Kontakt kontakt : kontakti)
		if(kontakt !=null)
			System.out.println(kontakt);
}
}