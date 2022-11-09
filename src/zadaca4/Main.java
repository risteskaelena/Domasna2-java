package zadaca4;

public class Main {

	public static void main(String[] args) {
		Avtomobil avtomobil1 = new Avtomobil();
		avtomobil1.marka="opel";
		avtomobil1.model="corsa";
		avtomobil1.kilometri=10000;
		
		Avtomobil avtomobil2 = new Avtomobil("hyundai", "tucson", 20000);
		System.out.println(avtomobil1.marka + " " + avtomobil1.model + " " + avtomobil1.kilometri);
		System.out.println(avtomobil2.marka + " " + avtomobil2.model + " " + avtomobil2.kilometri);

		
	}

}
