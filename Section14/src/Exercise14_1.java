import java.util.Scanner;

public class Exercise14_1 {
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�����`�̒�ӁF");
		int a = stdIn.nextInt();
		System.out.print("�����`�̍����F");
		int b = stdIn.nextInt();
		
		Rectangle x = new Rectangle(a,b);
		
		System.out.print("���s�l�ӌ`�̒�ӂ̕��F");
		int c = stdIn.nextInt();
		System.out.print("���s�l�ӌ`�̍����F");
		int d = stdIn.nextInt();
		
		Parallelogram y = new Parallelogram(c,d);
		
		x.draw();
		System.out.println("�����`�̖ʐρF"+x.getArea());
		
		y.draw();
		System.out.println("���s�l�ӌ`�̖ʐρF"+y.getArea());
	}

}
