class ex5_7{

	public static void main(String[] args) {
		
		System.out.println("   íl             2èÊ    ");
		System.out.println("-------------------------");
		float Square = 0.0F;
		int i = 0;
		
		
		do{
			float x =(float)i /1000;
			Square = x*x ;
			System.out.printf("%1.7f",x);
			System.out.printf("       ");
			System.out.printf("%1.7f\n",Square );
			i++;
		}while(i <= 1000);
	}	
}		