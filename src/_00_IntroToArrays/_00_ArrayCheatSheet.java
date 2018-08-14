package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		strings[0]= "one";
		strings[1]= "two";
		strings[2]= "three";
		strings[3]= "four";
		strings[4]= "five";
		//2. print the third element in the array
		System.out.println("___________");
		System.out.println(strings[2]);
		System.out.println("___________");
		//3. set the third element to a different value
		strings[2] = "three'";
		//4. print the third element again
		System.out.println(strings[2]);
		System.out.println("___________");
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0; i<strings.length; i++) {
			strings[i] = "new";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		System.out.println("___________");
		//7. make an array of 50 integers
		int[]  integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		int limit = 50;
		for(int i=0; i<integers.length; i++) {
			integers[i] = r.nextInt(limit);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = integers[0];
		for(int i = 0; i < integers.length; i++) {
			if(integers[i] < smallest) {
				smallest = integers[i];
			}
		}
		System.out.println(smallest);
		System.out.println("___________");
		//10 print the entire array to see if step 8 was correct
		for(int i=0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
		System.out.println("___________");
		//11. print the largest number in the array.
		int largest = integers[0];
		for(int i = 0; i < integers.length; i++) {
			if(integers[i] > largest) {
				largest = integers[i];
			}
		}
		System.out.println(largest);
		System.out.println("___________");
		//12. print only the last element in the array
		System.out.println(integers[integers.length-1]);
		System.out.println("___________");
	}
}

