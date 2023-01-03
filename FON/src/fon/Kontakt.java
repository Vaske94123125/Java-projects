package fon;

public class Kontakt {

	private String imePrezime=null;
	private String adresa=null;
	private int telefon=0;

public String getImePrezime() {
	return imePrezime;
}
public String getAdresa() {
	return adresa;
}
public int getTelefon() {
	return telefon;
}
public void setImePrezime(String imePrezime) {
	if(imePrezime==null)
		System.out.println("Greska 1");
	else
		this.imePrezime=imePrezime;
}
public void setAdresa(String adresa) {
	if(adresa==null)
		System.out.println("Greska 2");
	else
		this.adresa=adresa;
}
public void setTelefon(int telefon) {
	if(telefon<=0)
		System.out.println("Greska 3");
	else
		this.telefon=telefon;
}
public String toString() {
	return "Ime i prezime je: " +imePrezime+ " Adresa je: " +adresa+ " Telefon je: " +telefon;
}
}
