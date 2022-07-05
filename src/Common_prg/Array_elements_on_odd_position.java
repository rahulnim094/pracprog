package Common_prg;

public class Array_elements_on_odd_position {

	public static void main(String[] args) {
		int[] arr= {43,77,52,18,4,127,49};
		int size=arr.length;
		
		for(int i=1; i<size; i+=2)
		{
			System.out.print(" "+arr[i]+" ");
		}
	}

}
