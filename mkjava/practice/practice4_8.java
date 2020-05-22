import java.util.Scanner;

class practice4_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("®”’l : ");
		int n = stdIn.nextInt();
		
		int i = 1;
		int t = n;
		
		do{
			t = n / 10;
			i++;
		}while(t >= 10);	
		System.out.println("‚»‚Ì’l‚Í" + i + "Œ…‚Å‚·B");
	}	
}		