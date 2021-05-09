public class Car {

	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name){
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public int getCylinders(){
		return this.cylinders;
	}

	public String getName(){
		return this.name;
	}

	public String startEngine(){
		return "Car -> startEngine()";
	}

	public String accelerate(){
		return "Car -> accelerate()";
	}

	public String brake(){
		return "Car -> brake()";
	}

}

//Main Class
public class Main5 {
	public static void main(String[] args){

	}
}