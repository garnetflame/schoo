import java.util.Scanner;

class Exercise4_12{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int x;
		
		System.out.println("�J�E���g�A�b�v���܂��B");
		do{
			System.out.print("���̐����l�F");
			x=stdIn.nextInt();
		}while (x<0);
		
		for(int i=0; i<=x; i++){
			System.out.println(i);
		}
	}
}
