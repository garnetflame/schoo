public class Distance extends Car {
	
	private double alldistance = 0;

	Distance(String name, int width, int height, int length, double fuel, int number, double fillfuel) {
		super(name, width, height, length, fuel, number, fillfuel);
	}
	
	
	
	public double Dista(double n) {
		alldistance = n - getFuel();
		 return this.alldistance;
	}
}	
	

