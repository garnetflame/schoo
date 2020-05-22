class ex5_6{

	public static void main(String[] args) {
		
		System.out.println("  float             int     ");
		System.out.println("-------------------------");
		float sum1 = 0.0F;
		float sum2 = 0.0F;
		float x = 0.0F;
		int i = 0;
		
		
		do{
			float y =(float)i /1000;
			System.out.printf("%8.7f",x);
			System.out.printf("       ");
			System.out.printf("%8.7f\n",y );
			x += 0.001F;
			i++;
		}while( x <= 1.0F &&  i <= 1000);
	}	
}		