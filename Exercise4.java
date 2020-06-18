
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner erercise = new java.util.Scanner(System.in);

		int input = 0;
		int answer = 50;

		do {
			System.out.println("key in a number");
			input = erercise.nextInt();

			if (input >answer)
				System.out.println("Too big!");

			else if (input < answer)
			System.out.println("Too small!");

		}
		while (input != answer);

		System.out.println("You are right, good boy.");

	}

}
