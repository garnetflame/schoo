import java.util.Scanner;

class Exercise4_25{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		
		//List4-17
		
		System.out.print("���������Z���A���ϒl���o�͂��܂��B");
		System.out.print("�����Z���܂����F");
		int n=stdIn.nextInt();
		
		int sumA=0;
		double aveA;
		int i;
		
		for(i=1;i<=n;i++){
			System.out.print("�����i0�ŏI���j�F");
			int t=stdIn.nextInt();
			
			if (t==0){
				
				break;
			}
			sumA+=t;
		}
		aveA=(double)sumA/(i-1);
		System.out.println("���v��"+sumA+"�ł��B");
		System.out.println("���ς�"+aveA+"�ł��B");
		
		
		
		//List4-18
		
		System.out.print("���������Z���A���ϒl���o�͂��܂��B");
		System.out.print("�����Z���܂����F");
		int m=stdIn.nextInt();
		
		int sumB=0;
		double aveB;
		int j;
		
		for(j=1;j<=m;j++){
			System.out.print("�����F");
			int s=stdIn.nextInt();
			
			if (sumB+s>1000){
				System.out.println("���v��1,000�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sumB+=s;
		}
		aveB=(double)sumB/(j-1);
		System.out.println("���v��"+sumB+"�ł��B");
		System.out.println("���ς�"+aveB+"�ł��B");
	}
}
