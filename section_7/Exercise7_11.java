import java.util.Scanner;
import java.util.Random;

class Exercise7_11{
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�����F");
		int a = stdIn.nextInt();
		System.out.print("���r�b�g�V�t�g���܂����F");
		int b = stdIn.nextInt();
		
		System.out.println("����"+b+"�r�b�g�V�t�g�����l�F"+(a<<b));
		System.out.println("�E��"+b+"�r�b�g�V�t�g�����l�F"+(a>>b));
	}
}
