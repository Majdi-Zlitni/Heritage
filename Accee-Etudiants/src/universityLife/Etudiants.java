package universityLife;
import java.util.Scanner;
public class Etudiants {
	private String FullName;
	private int numins;
	private String university;
	static Scanner cont = new Scanner(System.in);
	//constructeur
	public Etudiants(String ch, int numins, String university) {
		while (ch=="1") {
		System.out.println("Write your full name");
		ch=cont.next();
		}
		FullName = ch;
		this.numins = numins;
		this.university = university;
	}
	
	//Getters and Setters
	public String getFullName() {
		return FullName;
	}


	public void setFullName(String fullName) {
		FullName = fullName;
	}


	public int getNumins() {
		return numins;
	}


	public void setNumins(int numins) {
		this.numins = numins;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}
	
	

	
	//Methodes
	public void display() {
		System.out.println("Student name is:"+FullName+" Enrol ID:"+numins+" University:"+university);
	}


	
}
