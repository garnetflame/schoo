import java.util.Scanner;
public class Ex8_2CarTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("車1のデータを入力せよ。");
		System.out.print("名前は : ");
		String name = stdIn.next();
		System.out.print("車幅は : ");
		int width = stdIn.nextInt();
		System.out.print("高さは : ");
		int height = stdIn.nextInt();
		System.out.print("長さは : ");
		int length = stdIn.nextInt();
		System.out.print("ガソリン量は : ");
		double fuelmain = stdIn.nextDouble();
		double fillfuel = fuelmain;
		System.out.print("ナンバーは : ");
		int number = stdIn.nextInt();
		
		
		Car Car1 = new Car(name,width,height,length,fuelmain,number,fillfuel);
		
			Car1.putSpec();
			Car1.Idou();
	}		
}
