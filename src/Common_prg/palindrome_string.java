package Common_prg;

public class palindrome_string {

	public static void main(String[] args) {
		
		String str="Rohit";
		
		String rev="";
		
		int size=str.length();
		
		for(int i=0; i<size; i++) {
			
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("The given string is palindrome");
		}
		
		else {
			System.out.println("The given string is not palindrome");
		}
		
	}
	
}
