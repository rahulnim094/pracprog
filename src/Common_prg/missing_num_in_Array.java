package Common_prg;

public class missing_num_in_Array {

	public static void main(String[] args) {
		
		//array should not have duplicates
		//Array no need to be in sorted order
		//Values should be in range
		
		int[] a= {1,2,4,5};
		
		//1+2+4+5=12
		//1+2+3+4+5=15
		//15-12=3 -----missing number
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		
		for(int i=0; i<=5; i++) {
			
			sum2=sum2+i;
		}
	System.out.println("The missing number is : " +(sum2-sum1));
	}

}
