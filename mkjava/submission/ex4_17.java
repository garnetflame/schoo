import java.util.Scanner;

class ex4_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("®”’l : ");
		int n = stdIn.nextInt();
		int x = 0;
		
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				System.out.println(i);
			x++;
			}
		}
		System.out.println("–ñ”‚Í"+ x +"ŒÂ‚Å‚·B");
	}
}		