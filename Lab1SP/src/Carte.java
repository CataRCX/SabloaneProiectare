import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String nume;
	private ArrayList<Autor> listaAutor = new ArrayList<Autor>();
	private ArrayList<Capitol> listaCapitol = new ArrayList<Capitol>();
	public Carte(String nume) {
		this.nume = nume;
	
	}
	public void setAutor(Autor autor){
		if(autor != null){
			this.listaAutor.add(autor);
		}	
	}
	public int setCapitol(String s){
		Capitol c = new Capitol(s);
		this.listaCapitol.add(c);
		return this.listaCapitol.indexOf(c);
	}
	public Capitol getCapitol(int index){
		return this.listaCapitol.get(index);
	}
	public String toString() {
		return  nume + "\n " + listaAutor + "\n " + listaCapitol;
	}

}
