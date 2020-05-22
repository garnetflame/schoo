import java.util.Random;
import java.util.Scanner;

class ex6_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		
		System.out.print("要素数(10以下) : ");
		do{
		n = stdIn.nextInt();
		}while(n >10 && n <= 0);
		
		int[] a = new int[n];
		int[] b = new int[n];
		int t = 0;
		int key;
		int s;
		
		for(int i = 0; i < n; i++){
			if(i == 0){
			a[i] = rand.nextInt(10) + 1;
			}else if(i > 0){	
			a[i] = rand.nextInt(10) + 1; //7
				
		inner:
			do{
				key = a[i];	
				if(a[t] == key){
					t= 0;
					a[i] = rand.nextInt(10) + 1;
					continue inner;
				}	
				t++;
				if(t >= i) {
					t = 0;
					break;
				}	
			}while(true);
			}
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("シャッフルします");
		
		for(int j = 0; j < n ; j ++){
			s = rand.nextInt(n - j) ;
			b[j] = a[s];
			a[s] = a[n - 1 - j];
		System.out.println("a[" + j + "] = " + b[j]);
		}	
	}	
}		