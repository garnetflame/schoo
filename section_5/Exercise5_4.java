import java.util.Scanner;

class Exercise5_4{
	public static void main(String[]args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("����1�F"); int a=stdIn.nextInt();
		System.out.print("����2�F"); int b=stdIn.nextInt();
		System.out.print("����3�F"); int c=stdIn.nextInt();
		
		System.out.println("���v�F"+(a+b+c));
		System.out.println("���ρF"+(a+b+c)/3.0);
	}
}
