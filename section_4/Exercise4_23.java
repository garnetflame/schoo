import java.util.Scanner;

class Exercise4_23{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int m;
		
		do{
			System.out.print("�s���~�b�h���쐬���܂��B�i1�`9�i�j\n���i�H�F");
			m=stdIn.nextInt();
		}while(m<1||m>=10);
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}

		
		