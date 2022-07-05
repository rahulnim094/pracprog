package Common_prg;

public class Occurance_of_character_In_string {

	public static void main(String[] args) {
		
		String s ="Java is one of the best programming language";
		char some_char='a';
		int count=0;
		
		int size=s.length();
		
		for(int i=0; i<size; i++) {
			
			if(some_char==(s.charAt(i))) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
}
