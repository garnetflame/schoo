import java.util.Scanner;

class Exercise4_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		do{
			System.out.print("���̐����l�F");
			n=stdIn.nextInt();
		}while (n<=0);
		int nFirst=n;
		int product=1;
		
		while (n>0){
			product*=n;
			n--;
		}
		System.out.println("1����"+nFirst+"�܂ł̐ς�"+product+"�ł��B");
	}
}

			