import java.util.Scanner;

public class Exercise7_26 {
	
	static int[] aryInsOf(int []a,int idx,int x) {
		
		int []b=new int[a.length+1];
		
		for(int i=0;i<=idx-1;i++) {
			b[i]=a[i];
		}
		for(int i=b.length-2;i>=idx;i--) {
			b[i+1]=a[i];
		}
		b[idx]=x;
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
		
		System.out.println("�z��a�̗v�fidx��x��}�������z���\�����܂��B");
		System.out.print("idx�̒l�́H�F");
		int idx=stdIn.nextInt();
		System.out.print("x�̒l�́H�F");
		int x=stdIn.nextInt();
		
		int []b=aryInsOf(a,idx,x);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
