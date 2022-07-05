package Common_prg;

public class EvenOdd_from_Array {

	public static void main(String[] args) {
		int[] a= {45,848,65,217,32,98};
		
		int size=a.length;
		
		System.out.print("Even numbers in array are: ");
		for(int i=0; i<size; i++) {
			
			if(a[i]%2==0) {
				
				System.out.print(" "+a[i]+" ");
				
			}
			
		}
		System.out.println();
			System.out.print("The odd numbers in array are: ");
			for(int i=0; i<size; i++) {
				if(a[i]%2!=0){
				System.out.print(" "+a[i]+" ");
				}
			
			}
	
		
	
	
	}

}
