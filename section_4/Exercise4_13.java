import java.util.Scanner;

class Exercise4_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do{
			System.out.println("1からnまでの和を求めます。");
			n=stdIn.nextInt();
		}while (n<=0);
		int sum =0;
		
		for (int i=0;i<=n;i++){
			sum+=i;
		}
		System.out.println("1から"+n+"までの和は"+sum+"です。");
	}
}
