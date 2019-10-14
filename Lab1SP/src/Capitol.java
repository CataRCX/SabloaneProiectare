import java.util.ArrayList;
import java.util.List;

public class Capitol {
	private String nume;
	private ArrayList<SubCapitol> listaSubCapitole = new ArrayList<SubCapitol>();
	public Capitol() {
		
	}
	public Capitol(String nume)
	{
		this.nume = nume;

	}
	public int setSubCapitol(String nume)
	{
		SubCapitol subC = new SubCapitol(nume);
		this.listaSubCapitole.add(subC);
		return this.listaSubCapitole.indexOf(subC);
	}
	public SubCapitol getSubCapitol(int index)
	{
		return this.listaSubCapitole.get(index);
	}
	@Override
	public String toString() {
		return   nume + ",\n" + listaSubCapitole;
	}
}
