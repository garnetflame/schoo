import java.util.Scanner;

public class Exercise7_23 {
	
	static int[] arySrchIdx(int []a,int x) {
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				count++;
			}
		}
		
		int []b=new int[count];
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				b[k]=i;
				k++;
			}
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
		
		System.out.println("�z��a�̒��Œl��x�ł���S�v�f�̃C���f�b�N�X��擪���珇�Ɋi�[�����z���\�����܂��B");
		System.out.print("x�̒l�́H�F");
		int x=stdIn.nextInt();
		int []b=arySrchIdx(a,x);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		
	}

}
