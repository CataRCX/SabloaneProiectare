
public class Paragraf {

	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Paragraf(String nume) {
		super();
		this.nume = nume;
	}
	public String toString() {
		return "Paragraf =" + nume;
	}
}
