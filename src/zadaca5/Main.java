package zadaca5;

public class Main {

	public static void main(String[] args) {
		Predmet predmet1 = new Predmet();
		predmet1.predmet="Forenzika";
		predmet1.profesor="Simon Avramov";
		predmet1.krediti=5;
		predmet1.semestar=3;
		System.out.println(predmet1.predmet + " " + predmet1.profesor + " " + predmet1.krediti + " " + predmet1.semestar);
		//kreiranje objekt (default constructor), dodeluvanje vrednosti i pecatenje
		Predmet predmet2 = new Predmet("Kriminalistika");
		System.out.println(predmet2.predmet);
		//dinamicki konstruktor
		Predmet predmet3 = new Predmet("Angliski Jazik", "Mila Naumova", 5);
		System.out.println(predmet3.predmet + " " + predmet3.profesor + " " + predmet3.krediti);
	}

}
