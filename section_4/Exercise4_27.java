import java.util.Scanner;
import java.util.Random;

class Exercise4_27{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand =new Random();
		
		int no=rand.nextInt(100);
		int n;
		int count=0;
		System.out.println("�����ăQ�[��");
		System.out.print("�`�����X�񐔁F");
		int x=stdIn.nextInt();
		
	Outer:
		while(true){
			for(int i=0;i<x;i++){
				if(count==x){
					System.out.println("������"+no+"�ł����B\n�Q�[�����I�����܂��B");
					break Outer;
				}
				
				System.out.print("0�`99�̐�������͂��Ă��������B");
				n=stdIn.nextInt();
				count++;
				
				if (no>n){
					System.out.println("�����Ƒ傫�Ȑ��ł��B");
				}else if (no<n){
					System.out.println("�����Ə����Ȑ��ł��B");
				}else{
					System.out.println("�����ł��B���߂łƂ��������܂��B");
					break Outer;
				}
			}
		}
	}
}
