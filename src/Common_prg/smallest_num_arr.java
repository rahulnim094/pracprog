package Common_prg;

public class smallest_num_arr {

	public static void main(String[] args) {
		
		int[] arr= {14,25,98,21,10,101};
		
		int size=arr.length;
		int min=arr[0];     //here we need to consider any value as smallest and after it will compare with every value in array
		
		for(int i=0; i<size; i++)
		{
			if (arr[i]<min)
			{
				min=arr[i];
			}
			
		}
			System.out.println(min);
	}

}
