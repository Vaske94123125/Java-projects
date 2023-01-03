package fon;

public class TestGeometrijskihTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Kocka k1=new Kocka();
Kvadar kv1=new Kvadar();

k1.setDuzinaStranice(25.5);
kv1.setDuzina(20);
kv1.setSirina(10);
kv1.setVisina(30);

System.out.println("Povrsina kocke je: " +k1.getPovrsina());
System.out.println("Zapremina kocke je: " +k1.getZapremina());

System.out.println("Povrsina kvadra je: " +kv1.getPovrsina());
System.out.println("Zapremina kvadra je: " +kv1.getZapremina());


	}

}
