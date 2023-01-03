package fon;

public class Avion {

private MestoUAvionu[] mesta;

public Avion(){
	mesta=new MestoUAvionu[120];
	for(int i=0;i<120;i++)
	mesta[i]=new MestoUAvionu();
}
public void uvediPutnika(int brMesta, String imePrezime, int starost) {
	if(brMesta<0 || brMesta>119 || !mesta[brMesta].isSlobodno() ) 
		System.out.println("Greska 1");
	else {
		mesta[brMesta].setImePrezime(imePrezime);
		mesta[brMesta].setSlobodno(false);
		mesta[brMesta].setStarost(starost);
	}
}
public void izvediPutnika(int brMesta) {
	if(brMesta<0 || brMesta>119 || mesta[brMesta].isSlobodno())
		System.out.println("Greska 2");
	else {
		mesta[brMesta].setImePrezime(null);
		mesta[brMesta].setSlobodno(false);
		mesta[brMesta].setStarost(0);
	}
}
public boolean daLiJeAAvionu(String imePrezime, int starost) {
	for(MestoUAvionu mesto : mesta)
		if(!mesto.isSlobodno() && mesto.getImePrezime().equals(imePrezime) && mesto.getStarost()==starost) 
			return true;
		return false;
}
public double procentualnaZauzetost() {
	int b=0;
	for(MestoUAvionu mesto : mesta)
		if(!mesto.isSlobodno()) 
			b++;
	return (120.0/b)*100.0;
}
public boolean daLiImaSlobodnihSedista() {
	for(MestoUAvionu mesto : mesta)
		if(mesto.isSlobodno())
		return true;
	return false;
}
public int prosecnaStarostPutnika() {
	int b=0;
	int g=0;
	for(MestoUAvionu mesto : mesta)
		if(!mesto.isSlobodno()) {
			b++;
	g=g+mesto.getStarost();	
}
	return g/b;
}
public int najstarijiPutnik() {
	int max=0;
	for(MestoUAvionu mesto : mesta)
	if(!mesto.isSlobodno() && mesto.getStarost()>max)
		max=mesto.getStarost();
		return max;
	}
public int najmladnjiPutnik() {
	int min=200;
	for(MestoUAvionu mesto : mesta)
		if(!mesto.isSlobodno() && mesto.getStarost()<min)
			min=mesto.getStarost();
	return min;
}
public void ispisi() {
	for(int i=0;i<120;i++)
		System.out.println("Sediste " +i+ " " +mesta[i]); 
}
public void ispisiJovanovice() {
	String sc;
	String scb;
	for(MestoUAvionu mesto : mesta)
		if(!mesto.isSlobodno()) {
			sc=mesto.getImePrezime();
			scb=sc.substring(sc.indexOf(' ')+1);
			if(scb.equals("Jovanovic"))
				System.out.println(mesto);
		}
}
}

