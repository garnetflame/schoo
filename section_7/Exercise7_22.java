import java.util.Scanner;

public class Exercise7_22 {
	
	static int[] aryClone(int []a) {
		
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�z��a�̗v�f���F");
		int n=stdIn.nextInt();
		
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("�z��a�̃N���[�����쐬���܂��B");
		int []b=aryClone(a);
		
		for(int i=0;i<n;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
