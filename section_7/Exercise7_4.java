import java.util.Scanner;

class Exercise7_4{
	
	static int sumUp(int n){
		
		int tmp=0;
		
		while (n > 0){
			tmp += n;
			n--;
		}
		
		return tmp;
		
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("��������͂��Ă��������B�F");
		int n=stdIn.nextInt();
		
		System.out.println(1+"����n�܂ł̑S�����̘a�����߂܂��B");
		
		System.out.print(sumUp(n));
	}
}
