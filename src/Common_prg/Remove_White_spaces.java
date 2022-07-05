package Common_prg;

public class Remove_White_spaces {

	public static void main(String[] args) {

		String s="Pune is the best city";
		
		String s1=s.replaceAll("\\s", "");
		
		System.out.println(s1);
	}

}
