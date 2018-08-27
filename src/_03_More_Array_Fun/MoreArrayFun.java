package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[6];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = Integer.toString(i+1);
		}
		printAllRandomOrder(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printAll(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printAllInReverseOrder(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[strings.length - i - 1]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printEveryOther(String[] strings) {
		for (int i = 0; 2 * i < strings.length; i++) {
			System.out.println(strings[2 * i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printAllRandomOrder(String[] strings) {

		Random r = new Random();
		int[] ints = new int[strings.length];
		for (int j = 0; j < strings.length; j++) {
			ints[j] = j;
		}
		for (int k = 0; k < strings.length; k++) {
			int rand = r.nextInt(strings.length - k);
			System.out.println(strings[ints[rand]]);
			int m = ints[rand];
			int n = ints[strings.length - k - 1];
			ints[rand] = n;
			ints[strings.length - k - 1] = m;
		}

	}

}
