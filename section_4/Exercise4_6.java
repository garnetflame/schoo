import java.util.Scanner;

class Exercise4_6{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//List4-7
		
		System.out.print("����*��\�����܂����F");
		int n=stdIn.nextInt();
		int i=0;
		
		while (i<n){
			System.out.print("*");
			i++;
		}
		if(n>1){
			System.out.println();
		}
		
		
		
		
		System.out.println();//List4-7��List4-8�𕪂��邽�߂̉��s
		
		
		//List4-8
		
		System.out.print("����*��\�����܂����F");
		int m=stdIn.nextInt();
		int j=1;
		
		while (j<=m){
			System.out.print('*');
			j++;
		}
		if(m>=1)
			System.out.println();
	}
}
