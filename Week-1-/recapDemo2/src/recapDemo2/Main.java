package recapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double sum = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			System.out.println(number);
			sum = sum + number;

		}
		System.out.println("Sum of all numbers is " + sum);
		System.out.println("Biggest number is " + max);

	}

}
