
class Ex8_1ningen {
	private String name;
	private double height;
	private double weight;
	
	Ex8_1ningen(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	void ningenSpec() {
		System.out.println("名前 : " + name);
		System.out.println("身長 : " + height+"cm");
		System.out.println("体重 : " + weight+"kg");
	}
}
