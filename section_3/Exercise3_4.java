import java.util.Scanner;

class Exercise3_4{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����A�F");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F");
		int b=stdIn.nextInt();
		
		if (a>b)
		System.out.println("A�̂ق����傫���ł��B");
		else if (b>a)
		System.out.println("B�̂ق����傫���ł��B");
		else
		System.out.println("A��B�͓����l�ł��B");
		
	}
}