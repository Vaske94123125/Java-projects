package fon;

public abstract class Vozilo {

private String marka;
private String model;

public String getMarka() {
	return marka;
}
public void setMarka(String marka) {
	if(marka!=null)
		this.marka=marka;
	else
		System.out.println("Greska 1");	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	if(model!=null)
		this.model=model;
	else
		System.out.println("Greska 2");
}
public abstract boolean daLiIdePoKopnu();
public abstract boolean daLiIdePoVodi();
public abstract boolean daLiIdePoVazduhu();

public void ispisi() {
	System.out.println("Marka vozila je: " +marka);
	System.out.println("Model vozila je: " +model);
	
if(daLiIdePoKopnu())
	System.out.println("Vozilo ide po kopnu");
if(daLiIdePoVodi())
	System.out.println("Vozilo ide po vodi");
if(daLiIdePoVazduhu())
	System.out.println("Vozilo ide po vazduhu");
}
}
