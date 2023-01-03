package fon;

public class NapredniAutomatNovca implements AutomatNovcaInterfejs{
	private double stanje=20000.0;
public void uloziNovac(double iznos) {
if(iznos > 0) {
	if(iznos <=20000)
	stanje+=iznos;
	else 
		System.out.println("max je 20000");
}
else
	System.out.println("Greska 2");
}
public void podigniNovac(double iznos) {
	if(iznos > 0) {
		if(iznos<=10000)
			stanje-=iznos;
		else 
			System.out.println("max je 10000");
	}
	else
	System.out.println("Greska 3");
	}
public void ispisi() {
	System.out.println("Trenutno ima : " +stanje+ " dinara u automatu.");
}
}


