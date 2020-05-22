import java.util.Scanner;

class ex6_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		for (int i = 0 , j = n - 1; i < n ; i++ , j-- ){	
			b[i] = a[j];
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}	
}		