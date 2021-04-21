package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array declaration
		int arr[] = new int[10];

		// taking of elements in array from user
		System.out.println("Enter elements in array");
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < (arr.length); i++) {

			arr[i] = s.nextInt();
		}

		// print array
		System.out.println("Origanal Array: ");
		for (int i : arr) {

			System.out.println(i);
		}

		// use of copyArray method
		System.out.println("Copied Array: ");
		int arr1[] = Arrays.copyOf(arr, 15);

		System.out.println("enter next values in copied array:");
		for (int i = (arr.length); i < arr1.length; i++) {

			arr1[i] = s.nextInt();
		}
		
		System.out.println("elements of coped array");
		for (int i : arr1) {

			System.out.println(i);
		}
		
		//sorting of array
		Arrays.sort(arr1);
		System.out.println("sorted copied array:");
		for(int i : arr1){
			System.out.println(i);
		}
		
		s.close();

	}
}
