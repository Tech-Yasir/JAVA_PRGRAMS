package TaskQuestion;

public class VowelsCount {

	public static void main(String[] args) {
		String str = "I love in India";
		String lower = str.toLowerCase();
		int count = 0;

	
		for (int i = 0; i < lower.length(); i++) {

			if (lower.charAt(i) == 'a' || lower.charAt(i) == 'e' || lower.charAt(i) == 'i' ||lower.charAt(i) == 'o' || lower.charAt(i) == 'u') {

				count++;
				System.out.println(lower.charAt(i));
			}
		}
		System.out.println("vowel " + count + " time........");

	}

}
