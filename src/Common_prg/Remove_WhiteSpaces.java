package Common_prg;

public class Remove_WhiteSpaces {
	public static void main(String[] args) {


		String s="Pune is the best city";

		System.out.println("String before removing white spaces:"  +s);

		String s1=s.replaceAll("\\s", "");

		System.out.println("String after removing white spaces:"  +s1);
	}	



}


