public class Wall {
	private double width;
	private double height;

	public Wall(){

	}

	public Wall(double width, double height){
		if(width < 0){
			this.width = 0;
		}else {
			this.width = width;
		}
		if(height < 0){
			this.height = 0;
		}else {
			this.height = height;
		}
	}

	public Double getWidth(){
		return this.width;
	}

	public Double getHeight(){
		return this.height;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.width = width;
	}

	public double getArea(){
		return width * height;
	}
}