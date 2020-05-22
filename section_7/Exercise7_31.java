import java.util.Scanner;

class Exercise7_31 {

  static int absolute(int x) {
	  return x>0?x:-x;
  }
  
  static long absolute(long x) {
	  return x>0?x:-x;
  }
  
  static float absolute(float x) {
	  return x>0?x:-x;
  }
  
  static double absolute(double x) {
	  return x>0?x:-x;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("int�^�����F");
    int a=stdIn.nextInt();
    System.out.println(absolute(a));
    
    System.out.print("long�^�����F");
    long b=stdIn.nextLong();
    System.out.println(absolute(b));
    
    System.out.print("float�^�����F");
    float c=stdIn.nextFloat();
    System.out.println(absolute(c));
    
    System.out.print("double�^�����F");
    double d=stdIn.nextDouble();
    System.out.println(absolute(d));
  }
}
