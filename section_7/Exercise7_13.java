import java.util.Scanner;
import java.util.Random;

class Exercise7_13{
	
	
	static void printBits(int x){
		for (int i=31;i>=0;i--){
			System.out.print(((x>>>i&1)==1)?"1":"0");
		}
	}
	
	
	static int set(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		x=a|x;
		return x;
	}
	
	
	static int reset(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		x=~a&x;
		return x;
	}
	
	
	static int inverse(int x,int pos){
		int a=1;
		for(int i=0;i<pos-1;i++){
			a*=2;
		}
		if((x&a)==0){
			x=x|a;
		}else{
			x=x&~a;
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
		
		System.out.print("���r�b�g�ځF");
		int b = stdIn.nextInt();
		
		int c;
		do{
			System.out.println("�ǂ����܂���\n0�F1�ɂ���\n1�F0�ɂ���\n2�F���]����\n");
			c=stdIn.nextInt();
		}while(c<0||2<c);
		
		
		System.out.println();
		
		if(c==0){
			
			System.out.println("1�ɂ����l�F"+set(a,b));
			System.out.println("1�ɂ����l�i2�i���\���j");
			printBits(set(a,b));
		}else if(c==1){
			System.out.println("0�ɂ����l�F"+reset(a,b));
			System.out.println("0�ɂ����l�i2�i���\���j");
			printBits(reset(a,b));
		}else if(c==2){
			
			System.out.println("���]�����l�F"+inverse(a,b));
			System.out.println("���]�����l�i2�i���\���j");
			printBits(inverse(a,b));
		}
	}
}
