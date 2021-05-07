public class Printer {

	private double tonerLevel;
	private int numOfPages;
	private boolean isDuplex;

	public Printer(double tonerLevel, int numOfPages, boolean isDuplex){
		this.tonerLevel = tonerLevel;
		this.numOfPages = numOfPages;
		this.isDuplex = isDuplex;
	}
}