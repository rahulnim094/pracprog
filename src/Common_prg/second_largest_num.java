package Common_prg;

public class second_largest_num {

	public static void main(String[] args) {
		
		int[] arr= {14,5,12,78,32,41,27};
		int size=arr.length;
		int temp;
		
		for(int i=0; i<size; i++) 
		{
			
			for(int j=i+1; j<size; j++) 
			{
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}System.out.println(+arr[i]);
		}
		
	}

}
