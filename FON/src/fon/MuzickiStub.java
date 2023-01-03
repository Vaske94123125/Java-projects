package fon;

public class MuzickiStub extends MuzickiUredjaj implements RadioKomponenta, CDKomponenta {

private double frekvencija=87.5;
private int brojPesme;
private boolean ukljucenRadio;
private boolean ukljucenCD;

public void promeniStanicu(double frekvencija) {
	ukljucenRadio=true;
	ukljucenCD=false;
	if(frekvencija<87.5 && frekvencija>108.0)
	this.frekvencija=87.5;
	else
		this.frekvencija=frekvencija;
}
public void pustiPesmu(int brojPesme) {
	ukljucenCD=true;
	ukljucenRadio=false;
	if(brojPesme>=1 && brojPesme<=21)
		this.brojPesme=brojPesme;
	else
		this.brojPesme=1;
}
public void ispisi() {
	if(ukljucen) {
		System.out.println("Trenutna jacina tona je: " +jacinaTona);
		if(ukljucenRadio)
			System.out.println("Frekvencija stanice je: " +frekvencija);
		if(ukljucenCD)
			System.out.println("Broj pesme je: " +brojPesme);
	}
	else
		System.out.println("Stub je iskljucen");
}
		
}



