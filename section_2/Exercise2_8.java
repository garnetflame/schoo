import java.util.Random;
import java.util.Scanner;

class Exercise2_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("�����l�F");
		int x = stdIn.nextInt();
		
		int a = rand.nextInt(11);
		int b = a-5;
		
		System.out.print("���̒l�́}5�̗����𐶐����܂����B\n���̒l��"+(x-b)+"�ł��B");
	}
}
