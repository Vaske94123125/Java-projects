package fon;

public class MestoUAvionu {

	private boolean slobodno=true;
	private String imePrezime=null;
	private int starost=0;

public boolean isSlobodno() {
	return slobodno;
}
public String getImePrezime() {
	return imePrezime;
}
public int getStarost() {
	return starost;
}
public void setSlobodno(boolean slobodno) {
	this.slobodno=slobodno;
}
public void setImePrezime(String imePrezime) {
	this.imePrezime=imePrezime;
}
public void setStarost(int starost) {
	this.starost=starost;
}
public String toString() {
	if(slobodno)
		return "Slobodno";
	else 
		return "Ime i Prezime je: " +imePrezime+ "Starost putnika je: " +starost;
}

}
