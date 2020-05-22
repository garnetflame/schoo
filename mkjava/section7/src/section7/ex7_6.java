import java.util.Scanner;

public class ex7_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("月を示します");
		System.out.print("1～12の値 : ");
		int m = stdIn.nextInt();
		
		Season(m);

	}
	
	public static void Season(int m) {
	if(m >= 3 && m <= 5) {
		System.out.println("春");
	}else if(m >=6 && m<= 8) {
		System.out.println("夏");
	}else if(m >= 9 && m <= 11) {
		System.out.println("秋");
	}else if(m == 12 || m ==1 || m == 2) {
		System.out.println("冬");
	}
	
	}
}
