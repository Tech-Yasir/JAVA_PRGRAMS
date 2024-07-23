package TaskQuestion;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
	
		int arr[] = { 50, 100, 30, 80 };
		//   Arrays.stream(arr).sorted().forEach(System.out::println);
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}

		/*                                          without for loop
		 * Arrays.sort(arr); Szystem.out.println(Arrays.toString(arr));java8 single line sort
		 */
	}
} 
