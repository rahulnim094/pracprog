package Common_prg;

public class Remove_junk_specialChar {

	public static void main(String[] args) {
		
		String s="@$%#%&*^$JK PATILrs 44683138";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s1);
	}

}
