import java.util.Scanner;

class Exercise4_21{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//���㒼�p�O�p�`
		
		int l;
		
		do{
			System.out.print("���㒼�p�̎O�p�`���쐬���܂��B\n���i�H�F");
			l=stdIn.nextInt();
		}while(l<=1);
		
		for(int i=l;i>0;i--){
			for(int j=l;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
			l--;
		}
		
		
		//�E�����p�O�p�`
		
		int m;
		
		do{
			System.out.print("�E�����p�̎O�p�`���쐬���܂��B\n���i�H�F");
			m=stdIn.nextInt();
		}while(m<=1);
		
		for(int i=0;i<m;i++){
			for(int j=m-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//�E�㒼�p�O�p�`
		
		int n;
		
		do{
			System.out.print("�E�㒼�p�̎O�p�`���쐬���܂��B\n���i�H�F");
			n=stdIn.nextInt();
		}while(n<=1);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
