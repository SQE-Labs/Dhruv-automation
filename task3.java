package training;
//Program to find vowels count in string
import java.util.HashSet;

public class task3 {

	public static void main(String[] args) {
		
		String str = "hello world";
        int count = 0;
        HashSet<Character> vowels = new HashSet<>();
        
        // Adding vowels to HashSet
        for (char v : "aeiou".toCharArray()) {
            vowels.add(v);	
        }

        // Counting vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (vowels.contains(ch)) {
                count++;
            }
        }

        System.out.println("Vowel count: " + count);
	}

}
