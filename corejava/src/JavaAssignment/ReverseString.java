package JavaAssignment;

public class ReverseString {
	public static void main(String[] args) {
		
	
	String input = "evol";
	
    char[] lol = input.toCharArray();

    for (int i = lol.length-1; i>=0; i--)
        System.out.print(lol[i]);

	}
}

