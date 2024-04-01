package iut.bad;

public class Femme extends Humain{
	
	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	public static void main(String[] args) {
		Humain Maria = new Femme("Maria","Jeanne",25);
		Humain Jean = new Homme("Jean","Marie",29);
		
		Maria.ami(Jean);
	}
}
