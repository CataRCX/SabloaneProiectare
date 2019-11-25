
public class DocumentManager {

	
	private static DocumentManager obj;
	private   Carte book;
	
	private DocumentManager(){}
	
	public static DocumentManager getInstance(){
		if(obj ==null)
		{
			obj = new DocumentManager();
		}
		return obj;
	}
	
	public  Carte getCarte(){
		return book;
	}
	public void setCarte(Carte c)
	{
		this.book= c;
	}
}
