package PracticeCoding;

public class ThreeVariableCall {
	int a = 10;
	int d = 30;
	static int b = 20;

	public static void main(String[] args) {
		int c = 30;

		System.out.println(ThreeVariableCall.b);
		System.out.println(c);
		ThreeVariableCall threeVariableCall = new ThreeVariableCall();

		System.out.println(threeVariableCall.a);

	}

}
