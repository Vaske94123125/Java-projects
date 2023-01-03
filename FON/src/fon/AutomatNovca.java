package fon;

public class AutomatNovca implements AutomatNovcaInterfejs {

private double stanje=5000.0;
public void uloziNovac(double iznos) {
	if(iznos<=0)
		System.out.println("Greska 1");
	else
		stanje+=iznos;
	}
public void podigniNovac(double iznos) {
	if(iznos<=0)
		System.out.println("Greska 2");
	else 
		stanje-=iznos;
}
public void ispisi() {
	System.out.println("Trenutno stanje u automatu je: " +stanje+ " dinara.");
}
}
