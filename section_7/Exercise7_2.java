import java.util.Scanner;

class Exercise7_2{
	
	static int min(int a,int b,int c){
		
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
		
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("3�̐�������͂��Ă��������B");
		
		int a=stdIn.nextInt();
		
		int b=stdIn.nextInt();

		int c=stdIn.nextInt();
		
		System.out.print("�ŏ��l��"+min(a,b,c)+"�ł��B");
	}
}
