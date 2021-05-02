public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;

	public PC(Case theCase, Monitor monitor, MotherBoard motherBoard){
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}

	public void powerUp(){
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo(){
		// Fancy grpahics
		monitor.drawPixelAt(1200, 50, "yellow");
	}

	// private Case getTheCase(){
	// 	return this.theCase;
	// }

	// private Monitor getMonitor(){
	// 	return this.monitor;
	// }

	// private MotherBoard getMotherBoard(){
	// 	return this.motherBoard;
	// }
}