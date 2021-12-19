import java.lang.reflect.Array;
import java.util.Arrays;

public class codingChallenge {

	public static void main(String[] args) {
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		
		int arrayLength = ages.length;
		int difference = Math.abs(ages[arrayLength - arrayLength] - ages[arrayLength -1]);//needed to add absolute value so the number would be positive
		System.out.println("The difference in age is: " + difference);
		
		
		double sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / ages.length;
		
		System.out.println("Average of ages is: " + average);
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double numberOfLetters = 0;
		for (String name : names) {
			numberOfLetters += name.length();
		}
		double averageLetters = numberOfLetters / names.length;
		
		System.out.println("The average number of letters is: " + averageLetters);
		
		String allNames = "";
		for (int i =0; i < names.length; i ++) {
			allNames += names[i] + " ";
		}
		
		System.out.println("All of the names in the array in order: " + allNames);
		
		System.out.println("This is how you acces the last element of an array: names[names.lenth-1]");
		System.out.println("For example: " + names[names.length-1]);
		
		System.out.println("This is how you acces the first element of an array: names[0]");
		System.out.println("For example: " + names[0]);
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
		System.out.println(repeatWord ("Hello", 3));	
		
		System.out.println(fullName ("Gordon" , "Freeman"));
		
		System.out.println(sumGreaterThan100(ages));
		
		double[] arrayOfDoubles = {1.25, 3.95, 36.7, 104.3};
		
		System.out.println(calculateAverage(arrayOfDoubles));
		
		double[] flockOfSeagulls = {3.67, 21.36, 45.96, 182.34};
		
		System.out.println(isFirstLarger(arrayOfDoubles, flockOfSeagulls));
		
		System.out.println(willBuyDrink (true, 11.0));
		
		System.out.println(doesArrayContainString(names, "Beau"));
		
		
		
		
	}
	
	public static String repeatWord(String word, int n) {
		String repeatWord = "";
		for (int i = 0; i < n; i++) {
			repeatWord += word;
		}
		return repeatWord;
		
	}
	
	private static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	private static Boolean sumGreaterThan100(int[] array) {
		int sum = Array.getLength(array);
		if (sum < 100) {
			return true;
		}
		return false;
		
	}
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum /array.length;
	}
	
	public static Boolean isFirstLarger(double[] firstArray, double[] secondArray) {
		return calculateAverage(firstArray) > calculateAverage(secondArray);
	}
	
	public static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
}
