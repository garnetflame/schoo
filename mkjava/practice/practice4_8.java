import java.util.Scanner;

class practice4_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("整数値 : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		int t = n;
		
		do{
			t = n / 10;
			i++;
		}while(t >= 10);	
		System.out.println("その値は" + i + "桁です。");
	}	
}		