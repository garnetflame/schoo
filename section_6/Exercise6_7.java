import java.util.Scanner;
import java.util.Random;

class Exercise6_7{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		final int n=12;
		int []a= new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=rand.nextInt(10);
		}
		
		//print element
		System.out.print("�z��a�̑S�v�f�̒l\n{ ");
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println("}");
		
		System.out.print("�T�����l�F"); int key=stdIn.nextInt();
		
		//search
		int i;
		for(i=n-1;i>=0;i--){
			if(a[i]==key){
				break;
			}
		}
		if(i<=0){
			System.out.println("�����a["+i+"]�ɂ���܂��B");
		}else{
			System.out.println("����͂���܂���B");
		}
	}
}
