package horus.test;

/**
 * Hello world!
 *
 */
public class App {

	public App() {
		super();
	}

	static int i;
	int j;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int num = 70;
		if (num < 100) {
			System.out.println("number is less than 100");
			if (num > 50) {
				System.out.println("number is greater than 50");
			}
			else {
				System.out.println("nothing in between");
			}
		}

	}

	// start of static block
	static {
		i = 10;
		System.out.println("static block called ");
	}

	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method

	public static void switchStmt() {
		int weather = 2;
		// passing variable to the switch
		switch (weather) {
		// comparing value of variable against each case
		case 0:
			System.out.println("It is Sunny today!");
			break;
		case 1:
			System.out.println("It is Raining today!");
			break;
		case 2:
			System.out.println("It is Cloudy today!");
			break;
		// optional
		default:
			System.out.println("Invalid Input!");
		}
	}

	public static void loopingStmt() {
		for (int x = 2; x <= 4; x++)
			System.out.println("Value of x:" + x);

		int x = 21;
		do {
			// The line will be printed even
			// if the condition is false
			System.out.println("Value of x:" + x);
			x++;
		} while (x < 20);

		int y = 5;

		// infinite loop because update statement
		// is not provided.
		while (y == 5) {
			System.out.println("In the loop");
		}
	}
}
