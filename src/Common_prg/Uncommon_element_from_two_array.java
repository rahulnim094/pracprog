package Common_prg;
	
public class Uncommon_element_from_two_array {

	public static void main(String[] args) {
		int[] arr1= {41,52,73,18,64,98};
		int[] arr2= {78,18,41,98,10,32,79};
		

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]!=arr2[j])
				{
					System.out.print(" "+arr2[i]+" ");
				}
			
			}
		}
	}
	
}

