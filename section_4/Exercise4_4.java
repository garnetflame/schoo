import java.util.Scanner;

class Exercise4_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�J�E���g�_�E�����܂��B\n");
		
		int x;
		
		do{
			System.out.print("-1�ȏ�̐����l�F");
			x=stdIn.nextInt();
		}while (x<-1);
		
		while (x>=-1){
			System.out.println(x);
			x--;
		}
	}
}
