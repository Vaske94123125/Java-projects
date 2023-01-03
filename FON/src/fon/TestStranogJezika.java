package fon;

public class TestStranogJezika {

private TestPitanje[] pitanja;
public TestStranogJezika(int x) {
	pitanja=new TestPitanje[x];
}
public void dodajPitanje(TestPitanje t) {
	for(int i=0;i<pitanja.length;i++) {
		if(pitanja[i]!=null) {
			pitanja[i]=t;
			return;
		}			
}
}
public int[] netacno(String[] vrednosti) {
	int brojNetacnih=0;
	for(int i=0;i<pitanja.length;i++) {
		if(pitanja[i]==null)
			break;
		else if(!pitanja[i].odgovorJeTacan(vrednosti[i]))
			brojNetacnih++;
	}
int[] indeksiNetacnih = new int[brojNetacnih];
int j=0;
for(int i=0;i<pitanja.length;i++) {
	if(pitanja[i]!=null && !pitanja[i].odgovorJeTacan(vrednosti[i]))
		indeksiNetacnih[j++]=i;
}
	return indeksiNetacnih;
}
public double izracunajTestSkor(String [] odgovori) {
	double skor=0;
	for(int i=0;i<pitanja.length;i++) {
		if(pitanja[i]==null)
			break;
		else if(pitanja[i].odgovorJeTacan(odgovori[i])) {
			if(pitanja[i] instanceof IzaberiMedjuPonudjenim)
				skor+=1;
			else skor+=1.5;
		}
}
	return skor;
}
public void prikaziTacneOdgovorePogresnoOdgovorenih(int[] indeksiNetacnih) {
	System.out.println("Tacni odgovori pitanja na koje su dati netacni odgovori: ");
	for(int i=0;i<indeksiNetacnih.length;i++) {
		int redBrPitanja = indeksiNetacnih[i]+1;
		System.out.println("Pitanje br: " +redBrPitanja+ " Tacan odgovor: ");
		pitanja[indeksiNetacnih[i]].prikaziTacanOdgovor();
		
	}
}
}
