package training;
//First non repeating Character in string
public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                break;
            }
        }
	}

}
