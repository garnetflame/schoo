import java.util.Scanner;
public class ex7_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		
		int [] a = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			System.out.print("a["+ i + "] = ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("要素a[idx]を削除します");
		int idx = stdIn.nextInt();
		
		
		aryRmv(a, idx); //a[x]を削除
		
		System.out.println("要素a["+idx+"]を削除しました");
		for(int i = 0 ; i < num; i++) {
			System.out.println("a["+ i + "] = " + a[i]);
		}
	}
	
	
	public static void aryRmv(int[] a, int idx) {
		for(int i = idx; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
	}
}
