import java.util.Scanner;

class Exercise6_19{
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�N���X���F"); int Class=stdIn.nextInt();
		int []Person=new int[Class];
		int [][]Score;
		Score=new int[Class][];
		
		int []sum=new int[Class];
		double []ave=new double[Class];
		
		int sumAll=0;
		double aveAll;
		
		
		for(int i=0;i<Class;i++){
			System.out.print(i+1+"�g�̐l���F"); Person[i]=stdIn.nextInt();
			Score[i]=new int[Person[i]];
		}
		
		System.out.println();
		
		for(int i=0;i<Class;i++){
			for(int j=0;j<Person[i];j++){
				
				System.out.print(i+1+"�g"+(j+1)+"�Ԃ̓_���F");
				Score[i][j]=stdIn.nextInt();
				
			}
			System.out.println();
		}
		
		System.out.println("  �g |   ���v   ���� \n-----+---------------");
		
		for(int i=0;i<Class;i++){
			for(int j=0;j<Person[i];j++){
				
				sum[i]+=Score[i][j];
				
			}
			ave[i]=(double)sum[i]/(Person[i]);
			System.out.printf(" %d�g |   %4d   %4.1f\n",i+1,sum[i],ave[i]);
		}
		
		System.out.println("-----+---------------");
		
		for(int i=0;i<Class;i++){
			
			sumAll+=sum[i];
			
		}
		
		aveAll=(double)sumAll/Class;
		
		System.out.printf("  �v |   %4d   %4.1f",sumAll,aveAll);
	}
}

		