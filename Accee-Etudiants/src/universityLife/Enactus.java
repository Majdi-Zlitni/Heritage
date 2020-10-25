package universityLife;

public class Enactus extends EtudIstic{
	private String Badge;
	private boolean EventAcces;
	
	//Constructeur
	public Enactus(String fullName, int numins, String university, int abbTrain, String isticmail, String badge,
			boolean eventAcces) {
		super(fullName, numins, university, abbTrain, isticmail);
		Badge = badge;
		EventAcces = eventAcces;
	}
	

}
