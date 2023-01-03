package fon;

public class Avionn extends Vozilo {

public boolean daLiIdePoKopnu() {
		return false;
}
public boolean daLiIdePoVodi() {
		return false;
}
public boolean daLiIdePoVazduhu() {
		return true;
}
public void ispisi() {
System.out.println("U pitanju je avion");
System.out.println("Marka aviona je: " +getMarka());
System.out.println("Model aviona je: " +getModel());
	
}
}
