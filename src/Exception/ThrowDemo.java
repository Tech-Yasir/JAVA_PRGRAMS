package Exception;

public class ThrowDemo {
	public static void voter(int age) {
		if (age <= 18) {
			throw new NullPointerException("not eligible for vote");

		} else {
			System.out.println("these person is eligible for vote");
		}

	}

	public static void main(String[] args) {
		voter(19);
		System.out.println("suar");

	}

}
