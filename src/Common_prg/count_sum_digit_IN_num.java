package Common_prg;

public class count_sum_digit_IN_num {
public static void main(String[] args) {
	
	int num=4316;
	
	int sum=0;
	
	while(num>0) {
		
		sum=sum+num%10;
		num=num/10;
		
	}
System.out.println("The sum of digits in number: " +sum);

}
	
}
