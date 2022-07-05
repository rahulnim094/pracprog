package Common_prg;

public class maximum_num_arr {

	public static void main(String[] args) {
		
		int[] arr= {41,25,78,107,32};
		
		int size=arr.length;
		
		int max=0;
		
		for(int i=0; i<size; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
		}
		System.out.println(max);
	}

}
