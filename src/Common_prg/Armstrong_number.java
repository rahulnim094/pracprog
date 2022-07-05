package Common_prg;

public class Armstrong_number {
public static void main(String[] args) {
	
	int c=0;
	int temp;
	int a;
	
	int num=371;
	temp=num;
	
	while(num>0) {
		
		a=num%10;
		num=num/10;
		
		c=c+(a*a*a);
	}
	
	if(temp==c) {
		System.out.println("the given num is Armstrong number");
	}
	else {
		System.out.println("The given num is not Armstrong number");
	}
}
}
