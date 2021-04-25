public class Cylinder {
	private double radius;	

	public Cylinder(double radius){
		if(radius < 0){
			this.radius = 0;
		}else {
			this.radius = radius;
		}
	}
}