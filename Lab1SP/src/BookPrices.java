
public class BookPrices extends BookStatistic{
	
	private int pretImg= 5;
	private int pretPara=7;
	private int pretTab=10;
	
	public void printStats()
	{
		super.printStats();
		System.out.println("Cost  of images "+pretImg+" pret imagini "+getNumarImg()*pretImg );
		System.out.println("Cost of tables "+pretTab + "pret tabele "+ getNumarTabel()*pretTab);
		System.out.println("cost of paragrafe "+pretPara +"pret paragrafe " +getNumarPara()*pretPara);
		
	}
}
