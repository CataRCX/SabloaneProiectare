
public class Test {

	public static void main (String [] args){
		
		Carte myBook = new Carte("Poveste");
		Autor autor = new Autor("Tolstoi");
		myBook.setAutor(autor);
		int indexCapitol = myBook.setCapitol("Capitol1");
		Capitol cap1 = myBook.getCapitol(indexCapitol);
		int indexSubcapitol = cap1.setSubCapitol("Subcapitol1");
		SubCapitol subcap1 = cap1.getSubCapitol(indexSubcapitol);
		int indexImag = subcap1.setImagine("Imagine1");
		int indexPar = subcap1.setParagraf("Paragraf1");
		int indexTabel = subcap1.setTabel("Tab");
		System.out.print(myBook);
		//System.out.print(subcap1);
	}
}
