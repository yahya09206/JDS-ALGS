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

	public int addToner(int tonerAmount){
		if(tonerLevel > 0){
			if(tonerAmount > 0 && tonerAmount <= 100){
				if(this.tonerLevel + tonerAmount > 100){
					return -1;
				}
				this.tonerLever += tonerAmount;
				return this.tonerLevel;
			}else {
				return -1;
			}
		}
	}

	public int printPages(int pages){
		
	}
}