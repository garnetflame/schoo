import java.util.Scanner;

class Exercise6_13{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		int []a={1,2,3,4,5};
		int []b=new int[5];
		
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("�z��a�̒l��z��b�ɋt���ɃR�s�[���܂��B");
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-1-i];
			System.out.println("b["+i+"]="+b[i]);
		}
	}
}

		
		
		
		