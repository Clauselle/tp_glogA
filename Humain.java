package iut.bad;

public class Humain implements Consommation{
	private String nom;
	private String prenom;
	private int age;
	
	public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Nom : " + nom + ", Prenom : " + prenom + ", Age : " + age;
	}
	
	@Override
	public void manger() {
		System.out.println("Je mange.");
	}
	@Override
	public void boire() {
		System.out.println("Je bois.");
	}
	
	public void ami(Humain ami, int dureeAmitie) {
		System.out.println(this.nom + " est ami avec " + ami.getNom() + " pour " + dureeAmitie + " jours.");
	}
	public void ami(Humain ami) {
		ami(ami, 100);
	}
	
	public static void main(String[] args) {
		
	}

}
