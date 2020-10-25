package universityLife;

public class EtudIstic extends Etudiants {
	private int AbbTrain;
	private String Isticmail;
	
	//Constructeur
	public EtudIstic(String fullName, int numins, String university, int abbTrain, String isticmail) {
		super(fullName, numins, university);
		AbbTrain = abbTrain;
		Isticmail = isticmail;
	}
	

}
