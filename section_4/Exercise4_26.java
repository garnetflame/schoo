import java.util.Scanner;

class Exercise4_26{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("���������Z���A���ϒl���o�͂��܂��B");
		System.out.print("�����Z���܂����F");
		int n=stdIn.nextInt();
		
		int sum=0;
		double ave=0;
		int count=0;
		
		for(int i=0;i<n;i++){
			System.out.print("�����F");
			int t=stdIn.nextInt();
			
			if (t<0){
				System.out.println("���̐��͉��Z���܂���B");
			}else{
				count++;
				sum+=t;
			}
		}
		
		ave=(double)sum/(count);
		
		System.out.println("���v��"+sum+"�ł��B");
		System.out.println("���ς�"+ave+"�ł��B");
	}
}
