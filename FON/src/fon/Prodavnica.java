package fon;

public class Prodavnica implements SluzbaNabavke, SluzbaProdaje {

private int brojProizvoda=0;

public void dodajRobu(int kolicina) {
	if(kolicina>0)
	brojProizvoda+=kolicina;
	else
		System.out.println("Greska 1");
}
public void prodajRobu(int kolicina) {
	if(kolicina>0 && brojProizvoda>=kolicina)
		brojProizvoda-=kolicina;
	else 
		System.out.println("Greska 2");
}
public void ispisi() {
	System.out.println("U prodavnici ima " +brojProizvoda);
}
}
