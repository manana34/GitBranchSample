package gitbranchsample;

public class MainApp {
	public static void main(String[] args) {
		System.out.print("1st Version :)");
		System.out.print("2nd Version :)");
		// 這是一個新加的數學運算版本
		Math cMath = new Math();
		System.out.print(cMath.add(10, 5));
		System.out.print(cMath.add(20, 10));
	}
}

class Math {
	int add(int a, int b) {
		return a + b;
	}
}