package fon;

public class IzaberiMedjuPonudjenim implements TestPitanje{

private char tacnaOpcija;
private String tacanPunOdgovor;

public IzaberiMedjuPonudjenim(char tacnaOpcija, String tacanPunOdgovor) {
	this.tacnaOpcija=tacnaOpcija;
	this.tacanPunOdgovor=tacanPunOdgovor;
}
public boolean odgovorJeTacan(String odgovor) {
	return String.valueOf(tacnaOpcija).equals(odgovor);
}
public void prikaziTacanOdgovor() {
	System.out.println("Tacan odgovor je: " +tacanPunOdgovor+ " slovo je: " +tacnaOpcija);
}
}
