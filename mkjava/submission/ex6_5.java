import java.util.Scanner;

class ex6_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî  : ");
		int n = stdIn.nextInt();
		
		int[] a =new int[n];
		
		for(int i = 0; i < n ; i++){
			System.out.print("a["+ i +"] : ");
			a[i] = stdIn.nextInt();
		}
	
				System.out.print("a = {");
		for(int i = 0; i < n ; i++){		
				System.out.print(a[i]);
			if(i < n - 1){		
				System.out.print(",");
			}else{
				System.out.println("}");
		}
		}	
	}
}		