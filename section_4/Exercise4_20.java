import java.util.Scanner;

class Exercise4_20{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.print("�����`���쐬���܂��B\n���i�H�F");
			n=stdIn.nextInt();
		}while(n<=0);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
