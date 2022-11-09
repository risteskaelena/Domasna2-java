package zadaca3;

public class Main {

	public static void main(String[] args) {
		Covek covek = new Covek ();
		covek.firstName = "Aleksandar";
		covek.lastName = "Spirovski";
		covek.maticenBroj = "2204997454962";
		
		System.out.println("Imeto na covekot e:" + " " + covek.firstName);
		System.out.println ("Prezimeto na covekot e:" + " " + covek.lastName);
		System.out.println ("Negoviot maticen broj e:" + " " + covek.maticenBroj);

		}
}
