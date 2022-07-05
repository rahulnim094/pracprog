package Common_prg;

public class count_num_of_even_odd_digits {

	public static void main(String[] args) {
		
		//counting number of even and odd digits in number
		
		int num=1616133769;
		
		int even=0;
		int odd=0;
		
		while(num>0) {
			
			int rem=num%10;
			if(rem%2==0) {
				even++;
			}
			
			else {
				odd++;
			}
			
			num=num/10;
			
		}
		System.out.println("The even count: " +even);
		System.out.println("The odd count: " +odd);
	}
}
