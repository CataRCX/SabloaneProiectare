import java.util.ArrayList;
import java.util.List;

public class Carte {
	private String nume;
	private ArrayList<Autor> listaA = new ArrayList<Autor>();
	private ArrayList<Element> lista = new ArrayList<Element>();
	public Carte(String nume) {
		this.nume = nume;
	
	}
	public void setAutor(Autor autor){
		if(autor != null){
			this.listaA.add(autor);
		}	
	}
	public void addContent(Element elm){
		this.lista.add(elm);
	}
	public void print() {
		System.out.println(nume);
		System.out.println(listaA);
		for(Element x: lista){
			x.print();
		}
	}

}
