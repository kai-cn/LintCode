import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.print(fizzBuzz(15));
	}

	public static ArrayList<String> fizzBuzz(int n) {

		ArrayList<String> output = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output.add("fizz buzz");
			} else {
				if (i % 3 == 0) {
					output.add("fizz");
				} else {
					if (i % 5 == 0 ) {
						output.add("buzz");
					} else {
						output.add(String.valueOf(i));
					}
				}
			}

		}

		return output;
	}

}
