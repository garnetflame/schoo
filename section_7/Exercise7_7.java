import java.util.Scanner;

class Exercise7_7{
	
	static void putchars(char c,int n){
		
		while(n-->0){
			System.out.print(c);
		}
	}
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("�������p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n=stdIn.nextInt();
		
		for(int i=0;i<n;i++){
			putchars('*',i+1);
			System.out.println();
		}
	}
}
