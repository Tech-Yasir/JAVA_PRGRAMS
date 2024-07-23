package PracticeCoding;

import java.util.jar.Attributes.Name;

public class ThreeVariable {
	float show() {

		int yasir = 160;
		int Yasir = 360;
		System.out.println(yasir + "" + Yasir);
		return 0;
	}

	static int aame() {
		int tufail = 300;
		int gadar = 33;
		System.out.println(tufail + "" + gadar);
		return 13;

	}

	public static void main(String[] args) {
		int b = 10;
		System.out.println(b);
		ThreeVariable threeVariable = new ThreeVariable();
		threeVariable.show();
		System.out.println(threeVariable.aame());

	}
}
