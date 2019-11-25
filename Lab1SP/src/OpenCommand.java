
public class OpenCommand implements Command{

	private String s;
	public OpenCommand (String s){
		this.s = s;
	}

	@Override
	public void execute() {
		Carte c = new Carte("Cartea mea");
		// TODO Auto-generated method stub
		JSONBuilder jsonBuilder = new JSONBuilder(s);
	    jsonBuilder.build();

	    Element myBook = jsonBuilder.getResult();
	    c.addContent(myBook);
	    DocumentManager.getInstance().setCarte(c);
	}

}
