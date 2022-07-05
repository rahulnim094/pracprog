package Common_prg;

public class swap_two_num_without_third_variable {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		
		
		System.out.println("The Values before swapping");
		System.out.println("The value of a :"  +a);
		System.out.println("The value of b :"  +b);
	
		System.out.println("-------------------------------------------------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Values before swapping");
		System.out.println("The value of a :"  +a);
		System.out.println("The value of b :"  +b);

		
	}

}
