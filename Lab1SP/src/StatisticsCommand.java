
public class StatisticsCommand implements Command{


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		BookStatistic stats= new BookStatistic();
		Element e = DocumentManager.getInstance().getCarte().getElem(0);
		e.accept(stats);
		stats.printStats();
	}
}
