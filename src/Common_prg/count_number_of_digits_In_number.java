package Common_prg;

public class count_number_of_digits_In_number {

	public static void main(String[] args) {
		
		int num=4166616;
		
		int count=0;
		
		while(num>0) {
			
		num=num/10;
		count++;
		
		}
	System.out.println("The number of digits in given number is: " +count);
	}
	

}
