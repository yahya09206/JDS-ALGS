public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;

	private PC(Case theCase, Monitor monitor, MotherBoard motherBoard){
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	private Case getTheCase(){
		return this.theCase;
	}

	private Monitor getMonitor(){
		return this.monitor;
	}

	private MotherBoard getMotherBoard(){
		return this.motherBoard;
	}
}