import java.util.Scanner;

class ex4_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.print("���̐����l : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		while (x >= 0){
			System.out.println(--x);
		}
	}
}		