import java.util.Random;

class Car {
	Random rand=new Random();
	
	private String name;
	private int width;
	private int height;
	private int weight;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private double fuelEco;//�R��
	private String weather;//�ԊO�̓V�C
	
	Car(String name,int width,int height,int weight,int length,double fuel,double fuelEco){
		this.name=name;
		this.width=width;
		this.height=height;
		this.weight=weight;
		this.length=length;
		this.fuel=fuel;
		this.fuelEco=fuelEco;
		
		x=y=0.0;
	}
	
	double getX() {return x;}
	double getY() {return y;}
	double getFuel(){return fuel;}
	double getFuelEco() {return fuelEco;}
	String getWeather() {
		int a=rand.nextInt(3);
		if(a==0) return "����";
		else if(a==1) return "�J";
		else return "�܂�";
	}
	
	void putSpec() {
		System.out.println("���O:"+name);
		System.out.println("�ԕ�:"+width+"mm");
		System.out.println("�ԍ�:"+height+")mm");
		System.out.println("�Ԓ�:"+length+"mm");
		System.out.println("�d��:"+weight+"kg");
		System.out.println("�R��:"+fuelEco);
	}
	
	boolean move(double dx,double dy,double fuelEco) {
		double dist=Math.sqrt(dx*dx+dy*dy);
		
		if(dist/fuelEco > fuel) return false;
		else {
			fuel-=(dist/fuelEco);
			x+=dx;
			y+=dy;
			return true;
		}
	}
}


