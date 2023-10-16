package n1ex2;

public class Persona {
	
	private String nom, cognom;
	private int edat;
	
	public Persona(String nom, String cognom, int edat) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}
	
	
	
	
}
