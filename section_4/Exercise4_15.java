import java.util.Scanner;

class Exercise4_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int a,b,c;
		
		do{
			
			System.out.print("��cm����F");
			a=stdIn.nextInt();
			
			System.out.print("��cm�܂ŁF");
			b=stdIn.nextInt();
		
			System.out.print("��cm���ƁF");
			c=stdIn.nextInt();
			System.out.println();
		}while (a<=100 || a>b || c<=0);
		
		System.out.println("�g���@�@�W���̏d");
		
		for(int i=a;i<=b;i+=c){
			System.out.println(i+"     "+((i-100)*0.9));
		}
	}
}
