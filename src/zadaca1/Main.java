package zadaca1;

public class Main {

	public static void main(String[] args) {
		Student object1 = new Student ();
		
		object1.firstName = "Stefan";
		object1.lastName = "Stefanovski";
		object1.index = 2222;
		
		System.out.println("Podatoci za prv objekt:");
		System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
		
		Student object2 = new Student("Angela","Angeloska",3333);

		System.out.println ("Podatoci za vtor objekt:");
		System.out.println (object2.firstName + " " + object2.lastName + " " + object2.index);
		}
}
