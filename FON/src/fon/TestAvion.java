package fon;

public class TestAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Avion a1=new Avion();

a1.uvediPutnika(20,"Jovan Jovanovic", 53);
a1.uvediPutnika(30,"Milos Milosevic", 23);
a1.uvediPutnika(40,"Ana Jovanovic", 22);

a1.ispisiJovanovice();
System.out.println("prosecna starost putnika je: " +a1.prosecnaStarostPutnika());
	}

}
