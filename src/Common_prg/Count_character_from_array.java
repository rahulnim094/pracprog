package Common_prg;

public class Count_character_from_array {

	public static void main(String[] args) {
		
		String str="Never Give up";
		int size=str.length();
		int count=0;
		for(int i=0; i<size; i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
}
