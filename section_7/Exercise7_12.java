import java.util.Scanner;
import java.util.Random;

class Exercise7_12{
	
	static void printBits(int x){
		
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
		System.out.println();
	}
	
	
	static int rRotate(int x,int n){
		
		int a=x>>>n;
		x<<=32-n;
		
		x=a|x;
		return x;
		
	}
	static int lRotate(int x,int n){
		
		int a=x<<n;
		x>>>=32-n;
		
		x=a|x;
		return x;
	}
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�����F");
		int a = stdIn.nextInt();
		System.out.println("2�i���\��");
		printBits(a);
		
		System.out.print("���r�b�g�V�t�g���܂����F");
		int b = stdIn.nextInt();
		
		System.out.println();
		
		System.out.println("����"+b+"�r�b�g��]�����l�F"+lRotate(a,b));
		System.out.println("����"+b+"�r�b�g��]�����l�i2�i���\���j");
		printBits(lRotate(a,b));
		
		System.out.println();
		
		System.out.println("�E��"+b+"�r�b�g��]�����l�F"+rRotate(a,b));
		System.out.println("����"+b+"�r�b�g��]�����l�i2�i���\���j");
		printBits(rRotate(a,b));
	}
}
