import java.util.Scanner;
import java.util.Random;

class ex2_8{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("x��y�������揜���܂��B");
		
		System.out.print("�����l : "); //x�̒l�̓��͂𑣂�
		int x = stdIn.nextInt(); //x�ɐ����l��ǂݍ���
		
		int y = rand.nextInt(11) -5 ; //-5�`5�܂ł̗���
		
		System.out.println("���̒l�́}5�̗����𐶐����܂����B�����" + (x + y) + "�ł��B");
	}
}		