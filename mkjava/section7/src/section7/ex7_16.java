import  java.util.Scanner;

public class ex7_16 {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("配列の要素数 : ");
	int n = stdIn.nextInt();
	
	int[] a = new int[n];
	 System.out.println("要素を入力せよ");
	 for(int i = 0; i < a.length ; i++) {
		 System.out.print("a["+ i + "] = ");
		 a[i] = stdIn.nextInt();
	 }
	 int x = 0;
	 int min =minOf(a,x);
	 
	 System.out.println("全要素の最小値は"+ min + "です");
	}

	public static int minOf(int[] a , int x) {
		x = a[0];
		for(int i = 1 ; i < a.length ; i++) {
			if(a[i] < x) {
				x = a[i];
			}
		}
		return x;
	}
}
