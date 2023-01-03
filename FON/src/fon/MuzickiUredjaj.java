package fon;

public abstract class MuzickiUredjaj {

protected boolean ukljucen;
protected int jacinaTona=0;

public void ukljuci() {
	ukljucen=true;
}
public void iskljuci() {
	ukljucen=false;
}
public void pojacajTona() {
	if(jacinaTona<40)
	jacinaTona++;
}
public void smanjiTon() {
	if(jacinaTona>0)
		jacinaTona--;
}
}
