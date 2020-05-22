import java.util.Scanner;
import java.util.Random;

class Exercise7_14{
	
	
	static void printBits(int x){
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
	}
	
	
	static int setN(int x,int pos){
		x=x|1;
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			
			x=a|x;
		}
		
		return x;
	}
	
	
	static int resetN(int x,int pos){
		x=~1&x;
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			
			x=~a&x;
		}
		
		return x;
	}
	
	
	static int inverseN(int x,int pos){
		if((x&1)==0){
			x=x|1;
		}else{
			x=x&~1;
		}
		
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
			if((x&a)==0){
				x=x|a;
			}else{
				x=x&~a;
			}
		}
		
		return x;
	}
	
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�����F");
		int a = stdIn.nextInt();
		System.out.println("2�i���\��");
		printBits(a);
		
		System.out.println();
		
		System.out.print("���r�b�g�܂ŁF");
		int b = stdIn.nextInt();
		
		int c;
		do{
			System.out.println("�ǂ����܂���\n0�F1�ɂ���\n1�F0�ɂ���\n2�F���]����\n");
			c=stdIn.nextInt();
		}while(c<0||2<c);
		
		
		System.out.println();
		
		if(c==0){
			
			System.out.println("1�ɂ����l�F"+setN(a,b));
			System.out.println("1�ɂ����l�i2�i���\���j");
			printBits(setN(a,b));
		}else if(c==1){
			System.out.println("0�ɂ����l�F"+resetN(a,b));
			System.out.println("0�ɂ����l�i2�i���\���j");
			printBits(resetN(a,b));
		}else if(c==2){
			
			System.out.println("���]�����l�F"+inverseN(a,b));
			System.out.println("���]�����l�i2�i���\���j");
			printBits(inverseN(a,b));
		}
	}
}
