package Common_prg;

public class Remove_Duplicates_Unsorted_array {

	public static void main(String[] args) {
int[] a= {1,2,2,7,4,5,3,6,3,5};
		
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
