import java.util.Random;
import java.util.Scanner;

class ex6_4 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("óvëfêî : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		int t;
		
		for(int i = 0; i < n; i++){
			a[i] = 1 + rand.nextInt(10);
		}
		
		for(int j = 0; j < 10; j++){
			for(int i = 0; i < n; i++){
				if(a[i] >= 10 - j && i != n){
				System.out.print("* ");
				}else if(a[i] < 10 - j && i != n){
				System.out.print("  ");
				}else if(a[i] >= 10 - j && i == n){
				System.out.print("*");
				}else if(a[i] < 10 - j && i == n){
				System.out.print(" ");	
				}
			}	
			System.out.println();
			
		}	
			
		for(int i = 0; i < n; i++){
			if(i == 0){
			System.out.print("-");
			}else{
			System.out.print("--");
			}
		}
			System.out.println();
		
		for(int i = 0; i < n; i++){
			if(i < 10 && i != n){
				System.out.print(i + " ");
				}else if(i >= 10 && i != n){
				t = i % 10;
				System.out.print(t + " ");
				}else if(i < 10 && i == n){	
				System.out.print(i);
				}else if(i >= 10 && i == n){
					t = i % 10;
					System.out.print(t);
				}	
		}
	}	
}		