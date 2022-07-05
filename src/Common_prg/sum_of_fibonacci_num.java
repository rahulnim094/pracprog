package Common_prg;

public class sum_of_fibonacci_num {

	public static void main(String[] args) {
//		int first_num=0;
//		int second_num=1;
//		int sum=0;
//		int iteration=7;
//		
//		int new_num;
//		
//		System.out.println(first_num);
//		System.out.println(second_num);
//
//		for(int i=0; i<iteration; i++) {
//		new_num=first_num+second_num;
//		
//		System.out.println(new_num);
//		
//		sum=sum+new_num;
//		
//		first_num=second_num;
//		second_num=new_num;
//		
//		}
//		System.out.println("The sum of fibonacci number: "  +sum);
		
		int i,f=1,s=0,sum=0,t;
		for(i=1;i<8;i++)
		{
			t=f+s;
			sum+=t;
			f=s;
			s=t;
		}
		System.out.print("Sum="+sum);
	}

}
