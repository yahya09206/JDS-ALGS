public class Printer {

	private int tonerLevel;
	private int numOfPages;
	private boolean isDuplex;

	public Printer(int tonerLevel, boolean isDuplex){
		if(tonerLevel > -1 && tonerLevel <= 100){
			this.tonerLevel = tonerLevel;
		}else {
			this.tonerLevel = -1;
		}
		this.isDuplex = isDuplex;
		this.numOfPages = 0;
	}
}