package Common_prg;

public class count_words_In_String {

	public static void main(String[] args) {
		
		String s="Java is one of the best programming language";
		
		int size= s.length();
		int count=1;
		
		for(int i=0; i<size; i++) {
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("The number of words in string is " +count);
	}

}
