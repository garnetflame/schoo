import java.util.Scanner;

class ex3_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("�ϐ�a : ");
		int a = stdIn.nextInt();
		
		System.out.print("�ϐ�b : ");
		int b = stdIn.nextInt();
		
		if (a < b){
			int t = a;
			a = b;
			b = t;
		}	
			System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
			System.out.println("�ϐ�a�̒l��" + a + "�ł��B");
			System.out.println("�ϐ�b�̒l��" + b + "�ł��B");	
	}
}		