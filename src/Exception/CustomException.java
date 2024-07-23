package Exception;

public class CustomException {

	public static void Atm(int rupees) {
		if (rupees > 3000) {
			throw new ArithmeticException("hai tere pass ");

		} else {
			System.out.println("withdraw your money");
		}

	}

	public static void main(String[] args) {
		      
		Atm(300);
		System.out.println("program\t chal\traha\thai");

	}

}
