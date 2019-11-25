import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Test {

	public static void main (String [] args) throws JsonParseException, JsonMappingException, IOException, InterruptedException{
		
//		Carte myBook = new Carte("Poveste");
//		Autor autor = new Autor("Tolstoi");
//		myBook.setAutor(autor);
//		int indexCapitol = myBook.setCapitol("Capitol1");
//		Capitol cap1 = myBook.getCapitol(indexCapitol);
//		int indexSubcapitol = cap1.setSubCapitol("Subcapitol1");
//		SubCapitol subcap1 = cap1.getSubCapitol(indexSubcapitol);
//		int indexImag = subcap1.setImagine("Imagine1");
//		int indexPar = subcap1.setParagraf("Paragraf1");
//		int indexImag2 = subcap1.setImagine("Imagine3");
//		int indexTabel = subcap1.setTabel("Tab2");
//		int indexImag3 = subcap1.setImagine("Imagine2");
//		int indexTabel2s = subcap1.setTabel("Tab");
//		System.out.print(myBook);
		//System.out.print(subcap1);
		
		//LABORATOR 3
//		Carte noapteBuna = new Carte("Noapte buna, copii!");
//		Autor rpGheo = new Autor("Radu Pavel Gheo");
//		noapteBuna.setAutor(rpGheo);
//		Sectiune cap1 = new Sectiune("Capitolul 1");
//		Sectiune cap11 = new Sectiune("Capitolul 1.1");
//		Sectiune cap111 = new Sectiune("Capitolul 1.1.1");
//		Sectiune cap1111 = new Sectiune("Subchapter 1.1.1.1");
//		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
//		noapteBuna.addContent(cap1);
//		cap1.addElement(new Paragraf("Moto capitol"));
//		cap1.addElement(cap11);
//		cap11.addElement(new Paragraf("Text from subchapter 1.1"));
//		cap11.addElement(cap111);
//		cap111.addElement(new Paragraf("Text from subchapter 1.1.1"));
//		cap111.addElement(cap1111);
//		cap1111.addElement(new Imagine("Image subchapter 1.1.1.1"));
//		noapteBuna.print();
		
		// LABORATOR 4
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Sectiune playboyS1 = new Sectiune("Front Cover");
//		playboyS1.addElement(img1);
//		Sectiune playboyS2 = new Sectiune("Summer Girls");
//		playboyS2.addElement(img2);
//		playboyS2.addElement(img3);
//		Carte playboy = new Carte("Playboy");
//
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		
//		
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		//LABORATOR 5s
		
	/*
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.addElement(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.addElement(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.addElement(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.addElement(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		*/
		//LABORATOR 6
		
		
		
		/*
		 * Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.addElement(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.addElement(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.addElement(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.addElement(p4);
		cap1.addElement(new ImageProxy("ImageOne"));
		cap1.addElement(new Imagine("ImageTwo"));
		cap1.addElement(new Paragraf("Some text"));
		cap1.addElement(new Tabel("Table 1"));
		BookPrices stats2 = new BookPrices();
		BookStatistic stats = new BookStatistic();
		cap1.accept(stats);
		cap1.accept(stats2);
		stats2.printStats();
		*/
		
		//LABORATOR 6
//		String s = "C:\\Users\\Cata\\Downloads\\book.json";
//		JSONBuilder jsonBuilder = new JSONBuilder(s);
//	    jsonBuilder.build();
//
//	    Element myBook = jsonBuilder.getResult();
//	    myBook.print();
	    
	    
	    // LABORATOR 7
	    Command cmd1 = new OpenCommand("C:\\Users\\Cata\\Downloads\\book.json");
	    cmd1.execute();
	    
	    Command cmd2 = new StatisticsCommand();
	    DocumentManager.getInstance().getCarte().print();
	    cmd2.execute();
	    
	 
	} 
}
