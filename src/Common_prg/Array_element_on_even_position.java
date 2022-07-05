package Common_prg;

public class Array_element_on_even_position {

	public static void main(String[] args) {
		
		int[] arr= {14,45,98,75,31,29,87,43};
		int size=arr.length;
		
		for(int i=0; i<size; i+=2)
		{
			System.out.print(" "+arr[i]+" ");
			
		}
			
			
	}

}
