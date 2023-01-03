package fon;

public class DopuniRecKojaNedostaje implements TestPitanje {

private String tacanOdgovor;
public DopuniRecKojaNedostaje(String tacanOdgovor) {
	this.tacanOdgovor=tacanOdgovor;
}
public boolean odgovorJeTacan(String odgovor) {
	return tacanOdgovor.equalsIgnoreCase(odgovor);
}
public void prikaziTacanOdgovor() {
	System.out.println("Rec: " +tacanOdgovor);	
}
}
