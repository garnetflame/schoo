import java.util.Scanner;

class ex4_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("‰½ŒÂ*‚ð•\Ž¦‚µ‚Ü‚·‚© : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print("*");
		if(i % 5 == 0 && i != 0){
			System.out.println();
			}	
		}	
	}
}		