package Common_prg;

public class Remove_Duplicates_sorted_array {

	public static void main(String[] args) {
		
		int[] a= {1,2,2,3,4,5,5,6};
		
		int[] temp=new int[a.length];
		int size=a.length;
		int j=0;
		
		for(int i=0; i<size-1; i++) {
			
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
				
			}
			
			
			}
		
		temp[j++]=a[size-1];
		
		for(int k=0; k<j; k++) {
			System.out.print(" "+temp[k]+" ");
		}

	}

}
