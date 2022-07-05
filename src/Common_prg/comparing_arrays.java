package Common_prg;

import java.util.Arrays;

public class comparing_arrays {

	public static void main(String[] args) {
		int[] a1= {45,848,65,217,32,98};
		int[] a2= {61,87,914,62,30,4,92};
		
		boolean status=Arrays.equals(a1, a2);
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
