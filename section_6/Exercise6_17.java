import java.util.Scanner;

class Exercise6_17{
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		
		int [][]score = new int[6][2];
		int sumJapanese=0;
		int sumMath=0;
		int []sumPerson = new int[6];
		int count=0;
		double aveJapanese;
		double aveMath;
		double []avePerson= new double[6];
		
		for(int i = 0; i<6; i++){
			
			System.out.println(i+1+"�l��");
			System.out.print("����F"); score[i][0]=stdIn.nextInt();
			System.out.print("���w�F"); score[i][1]=stdIn.nextInt();
			
			sumJapanese+=score[i][0];
			sumMath+=score[i][1];
			
			sumPerson[i]=score[i][0]+score[i][1];
			
			count++;
			System.out.println();
		}
		
		System.out.println();
		
		aveJapanese=(double)sumJapanese/count; System.out.println("����̕��ϓ_�F"+aveJapanese);
		aveMath=(double)sumMath/count; System.out.println("���w�̕��ϓ_�F"+aveMath);
		
		for(int i=0;i<6;i++){
			avePerson[i]=(double)sumPerson[i]/2;
			System.out.println(i+1+"�l�ڂ̕��ϓ_�F"+avePerson[i]);
		}
	}
}
