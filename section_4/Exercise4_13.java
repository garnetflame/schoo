import java.util.Scanner;

class Exercise4_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("1����n�܂ł̘a�����߂܂��B");
			n=stdIn.nextInt();
		}while (n<=0);
		int sum =0;
		
		for (int i=0;i<=n;i++){
			sum+=i;
		}
		System.out.println("1����"+n+"�܂ł̘a��"+sum+"�ł��B");
	}
}
