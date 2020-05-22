import java.util.Scanner;

public class ex7_1 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("nの値 : ");
		int n = stdIn.nextInt();
		int a = signOF(n);
		
		System.out.println(a);

	}
	
	
	public static int signOF(int b) {
	if(b < 0) {
		return -1;
	}
	else if(b == 0) {
		return 0;
	}
	else {
		return 1;
	}
	}
}
