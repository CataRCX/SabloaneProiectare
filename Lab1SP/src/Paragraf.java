
public class Paragraf implements Element{

	private String nume;
	private AlignStrategy al;
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
	public AlignStrategy getAl() {
		return al;
	}

	public void setAl(AlignStrategy al) {
		this.al = al;
	}

	public void print() {
		if(al != null){
			al.print(nume);
		}else {System.out.println(nume);}
	}
	public void setAlignStrategy( AlignStrategy n){
		this.al = n;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);

	}
}
