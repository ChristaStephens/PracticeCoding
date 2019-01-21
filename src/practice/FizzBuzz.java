package practice;

public class FizzBuzz {

	public static void main(String[] args) {
		// Doing fizz buzz. for multiples of 3 write fizz
		// for multiples of 5 write buzz. for multiples of 3
		// and 5 write fizzbuzz

		for (int i = 100; i < 1; i++) {

			if (i % 15 == 0) {
				System.out.println("fizzbuzz");
			}
			else if (i % 5 ==0) {
				System.out.println("buzz");
			}
			else if(i % 3 ==0) {System.out.println("fizz");
			}
			else {System.out.println(i);
			}
			
		}

	}

}
