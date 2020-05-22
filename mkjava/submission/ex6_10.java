import java.util.Random;
import java.util.Scanner;

class ex6_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++ ){
			a[i] = rand.nextInt(10)+1;
			if(i > 0 && a[i] == a[i-1]){
				for(int j = 0; a[i] == a[i-1];j++){
				a[i] = rand.nextInt(10)+1;
				}	
			}	
			System.out.println("a[" + i + "] = " + a[i]);
			
		}
	}	
}		