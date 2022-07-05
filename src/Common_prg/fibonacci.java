package Common_prg;

public class fibonacci {

	public static void main(String[] args) {
		
		int first_num=0;
		int second_num=1;
		
		int iteration=7;
		
		int new_num;
		
		System.out.print(" "+first_num+" ");
		System.out.print(" "+second_num+" ");

		for(int i=0; i<iteration; i++) {
		new_num=first_num+second_num;
		
		System.out.print(" "+new_num+" ");
		
		first_num=second_num;
		second_num=new_num;
		}
	}

}
