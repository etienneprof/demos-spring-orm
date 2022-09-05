package bo;

public class Bidon {
	private int id;
	private String nom;
	private float volume;
	
	public Bidon(int id, String nom, float volume) {
		super();
		this.id = id;
		this.nom = nom;
		this.volume = volume;
	}

	public Bidon() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Bidon [id=" + id + ", nom=" + nom + ", volume=" + volume + "]";
	}
}
