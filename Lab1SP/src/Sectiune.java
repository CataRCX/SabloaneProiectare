import java.util.ArrayList;

public class Sectiune implements Element{

	private String sectionTitle;
	ArrayList<Element> listaElem = new ArrayList<Element>();
	public Sectiune(String nume){
		this.sectionTitle=nume;
	}
	
	public int addElement(Element nume)
	{
		this.listaElem.add(nume);
		return this.listaElem.indexOf(nume);
	}
	public Element getElement(int index)
	{
		return this.listaElem.get(index);
	}
	public void removeElem(int index){
		this.listaElem.remove(index);
	}
	public void print(){
		System.out.println(sectionTitle);
		for(Element i:listaElem){
			i.print();
		}
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		for(Element i:listaElem){
			i.accept(v);
		}
		
		
	}
}
