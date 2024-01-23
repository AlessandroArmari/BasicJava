package methods;

import java.util.Arrays;

public class Methods {

	public static void reverseString(String string) {

		String newString = "";

		for (int i = string.length() - 1; i >= 0; i--) {

			char charAt = string.charAt(i);

			newString += charAt;

		}

		System.out.println(newString);

	}

	public static void sumRange(int[] array) {

		int sum = 0;

		for (int i = array[0]; i <= array[1]; i++) {

			sum += i;
		}

		System.out.println(sum);
	}

	public static void reverseArray(String[] array) {

		for (int i = 0; i <= array.length - 1 - i / 2; i++) {

			String container = "";

			container = array[i];

			array[i] = array[array.length - 1 - i];

			array[array.length - 1 - i] = container;

		}

		System.out.println(Arrays.toString(array));

	}

	public static boolean checkIfPal(String string) {

		for (int i = 0; i <= string.length() - 1; i++) {

			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkIfVowels(String string) {
		String[] vowels = { "a", "e", "i", "o", "u" };

		for (int i = 0; i <= string.length() - 1; i++) {
			for (int j = 0; j <= vowels.length - 1; j++) {
				if (vowels[j].equals(Character.toString(string.charAt(i)))) {
					return true;
				}
			}
		}

		return false;
	}
	
	
	public static void checkIfNumberAreEven(int[] array) {
		
		boolean[] result = new boolean[array.length]; 
		
		for (int i = 0; i <= array.length - 1; i++) {
			if(array[i] %2 != 0 ) result[i] = false;
			else result[i] = true;
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	
	public static void quadratoOfEachNumber(int[] array) {
		
		int[] newArray = new int[array.length];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i] * array[i];
		}
		
		System.out.println(Arrays.toString(newArray));
	}
}
