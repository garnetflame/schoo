import java.util.Scanner;

public class Exercise7_25 {
	
	static int[] aryRmvOfN(int []a,int idx,int n) {
		
		int []b=new int [a.length-n];
		for(int i=0;i<=idx-1;i++) {
			b[i]=a[i];
		}
		for(int i=idx;i+n<a.length;i++) {
			b[i]=a[i+n];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�z��a�̗v�f���F");
		int N=stdIn.nextInt();
		
		int []a=new int[N];
		
		for(int i=0;i<N;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("�z��a����v�fidx��擪�Ƃ���n�̗v�f���폜�����z���\�����܂��B");
		System.out.print("idx�̒l�́H�F");
		int idx=stdIn.nextInt();
		System.out.print("n�̒l�́H�F");
		int n=stdIn.nextInt();
		
		int []b=aryRmvOfN(a,idx,n);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
