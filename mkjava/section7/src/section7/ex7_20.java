import java.util.Scanner;
public class ex7_20 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数 : ");
		int num = stdIn.nextInt();
		
		int [] a = new int[num];
		
		for(int i = 0 ; i < num; i++) {
			System.out.print("a["+ i + "] = ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("要素a[idx]に追加します");
		int idx = stdIn.nextInt();
		System.out.print("要素a[idx]に入れる要素 : ");
		int n = stdIn.nextInt();
		
		
		
		aryRmv(a, num,idx,n); //a[x]を追加
		
		System.out.println("要素a["+idx+"]にa["+n+"]追加しました");
		for(int i = 0 ; i < num; i++) {
			System.out.println("a["+ i + "] = " + a[i]);
		}
	}
	
	
	public static void aryRmv(int[] a,int num, int idx,int n) {
		for(int i = num - 1 ; i >= idx; i--) {
			if(i > idx ) {
				a[i] = a[i-1];
			}else {
				a[i] = n;
			}
		}
	}
}
