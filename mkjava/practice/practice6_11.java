import java.util.Random;
import java.util.Scanner;

class practice6_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{	
		System.out.print("óvëfêî(10à»â∫) : ");
		n = stdIn.nextInt();
		}while(n<=0 ||n>10);
	
		System.out.println();
	
		int[] a = new int[n];
	
		for(int i = 0; i < n; i++){
		if(i==0 ){
			
			int random =rand.nextInt(10) + 1;
			a[i] = random;
			
		}else if(i>0){
			
		roop:
			while(true){
				int random= rand.nextInt(10) + 1;
				
				for(int j = 0; j < i ; j++){
					
					if(random == a[j]){
						continue roop;
					}
				}
				a[i] = random;
				break;
			}
		}
			System.out.println("a[" + i + "] = " + a[i]);	
	
		}
	}	
}		