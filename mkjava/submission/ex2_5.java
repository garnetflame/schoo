//�Q�̎����l��ǂݍ���Ōv�Z
import java.util.Scanner;

class ex2_5{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("x��y�������揜���܂��B");
		
		System.out.print("x�̒l : "); //x�̒l�̓��͂𑣂�
		double x = stdIn.nextDouble(); //x�Ɏ����l��ǂݍ���
		
		System.out.print("y�̒l : "); //y�̒l�̓��͂𑣂�
		double y = stdIn.nextDouble(); //y�Ɏ����l��ǂݍ���
		
		System.out.println("���v��" + (x + y) + "�ł��B");
		System.out.println("���ς�" + (x + y)/2 + "�ł��B");
	}
}		