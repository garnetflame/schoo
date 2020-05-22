import java.util.Scanner;

class Exercise7_30 {

  static int min(int a,int b) {
	  return a>b?b:a;
  }
  
  static int min(int a,int b,int c) {
	  int min=a;
	  if(b<min) min=b;
	  if(c<min) min=c;
	  return min;
  }
  
  static int min(int[] a) {
	  int min=a[0];
	  for(int i=1;i<a.length;i++) {
		  if(a[i]<min) min=a[i];
	  }
	  return min;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("����a��b�̍ŏ��l�����߂܂��B");
    System.out.print("a�F");
    int a=stdIn.nextInt();
    System.out.print("b�F");
    int b=stdIn.nextInt();
    System.out.println(min(a,b));
    
    System.out.println("����x��y��z�̍ŏ��l�����߂܂��B");
    System.out.print("x�F");
    int x=stdIn.nextInt();
    System.out.print("y�F");
    int y=stdIn.nextInt();
    System.out.print("z�F");
    int z=stdIn.nextInt();
    System.out.println(min(x,y,z));
    
    System.out.println("�z��a�̍ŏ��l�����߂܂��B");
    System.out.print("�v�f���F");
    int n=stdIn.nextInt();
    int[] A=new int[n];
    for(int i=0;i<n;i++) {
    	System.out.print("A["+i+"]=");
    	A[i]=stdIn.nextInt();
    }
    System.out.println(min(A));
  }
}
