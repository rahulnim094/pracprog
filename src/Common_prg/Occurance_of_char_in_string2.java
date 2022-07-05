package Common_prg;

public class Occurance_of_char_in_string2 {

	public static void main(String[] args) {
		
		String s ="Java is one of the best programming language";
		
	
		int org_size=s.length();
		
		String s1=s.replaceAll("a", "");
		
		int new_size_after_removing_a=s1.length();
		
		int occurance=org_size-new_size_after_removing_a;
		
		System.out.println("The occurance of character 'a' :" +occurance);
	}
	
	
}
