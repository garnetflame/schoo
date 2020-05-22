import  java.util.Scanner;

public class ex7_15 {

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
	 int sum =sumOf(a,x);
	 
	 System.out.println("全要素の合計は"+ sum + "です");
	}

	public static int sumOf(int[] a , int x) {
		for(int i = 0 ; i < a.length ; i++) {
			x += a[i];
		}
		return x;
	}
}
