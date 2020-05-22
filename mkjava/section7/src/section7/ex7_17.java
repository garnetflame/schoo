import java.util.Scanner;

public class ex7_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("配列の要素数 : ");
		int n = stdIn.nextInt();

		int[] a = new int[n];
		System.out.println("要素を入力せよ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("探す値 : ");
		int ky = stdIn.nextInt();

		int idx = LinearSearch(n, a, ky);
		
		if(idx == -1) {
			System.out.println("その値の要素は存在しません。");
		}else {
			System.out.println("その値はa["+idx+"]にあります。");
		}

		
	}

	public static int LinearSearch(int n,int[] a, int key) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
