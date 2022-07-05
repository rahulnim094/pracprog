package Common_prg;

public class sum_of_array {

	public static void main(String[] args) {

		int[] arr= {45,25,87,10,3};
		int sum=0;
		
		int size=arr.length;	

		for(int i=0; i<size; i++) {
			
			sum=sum+arr[i];
			
			
		}
		System.out.println("The sum of array: " +sum);
	}

}
