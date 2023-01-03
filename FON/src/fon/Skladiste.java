package fon;

public class Skladiste implements SluzbaNabavke {
	
private int stanjeNaSkladistu=1000;

public void dodajRobu(int kolicina) {
	if(kolicina>0)
		stanjeNaSkladistu+=kolicina;
	else
		System.out.println("Greska 3");
}
public void skiniSaStanja(int kolicina) {
	if(kolicina>0 && stanjeNaSkladistu>=kolicina)
		stanjeNaSkladistu-=kolicina;
	else
		System.out.println("Greska 4");
}


}
