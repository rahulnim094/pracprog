package Common_prg;

public class Palindrome_num {
public static void main(String[] args) {
	
	int num=61616;
	
	int rev=0;
			
	int original_num=num;		
	
	while(num>0) {
		
		rev=rev*10+num%10;
		num=num/10;
	}
	
	if(original_num==rev) {
		System.out.println("The num is palindrome number");
	}
	
	else {
		System.out.println("The num is not palindrome number");
	}
	
}
}
