
public class BookStatistic implements Visitor {

	private int numarImg=0;
	private int numarPara=0;
	private int numarTabel=0;

	@Override
	public void visit(Imagine img) {
		// TODO Auto-generated method stub
		numarImg++;

	}

	@Override
	public void visit(ImageProxy imgP) {
		// TODO Auto-generated method stub
		numarImg++;
	}

	@Override
	public void visit(Paragraf p) {
		// TODO Auto-generated method stub
		numarPara++;
	}

	@Override
	public void visit(Tabel t) {
		// TODO Auto-generated method stub
		numarTabel++;
	}
	
	public int getNumarImg() {
		return numarImg;
	}

	public void setNumarImg(int numarImg) {
		this.numarImg = numarImg;
	}

	public int getNumarPara() {
		return numarPara;
	}

	public void setNumarPara(int numarPara) {
		this.numarPara = numarPara;
	}

	public int getNumarTabel() {
		return numarTabel;
	}

	public void setNumarTabel(int numarTabel) {
		this.numarTabel = numarTabel;
	}
	public void printStats()
	{
		System.out.println("Number of images "+getNumarImg() );
		System.out.println("Number of tables "+getNumarTabel());
		System.out.println("Number of paragrafe "+getNumarPara());
		
	}
}
