public class Cubiod {

	private double height;

	public Cubiod(double width, double length, double height){
		super(width, length);
		if(height < 0){
			this.height = 0;
		}else {
			this.height = height;
		}
	}
}