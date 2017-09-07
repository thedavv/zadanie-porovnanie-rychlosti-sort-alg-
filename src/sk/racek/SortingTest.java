package sk.racek;

import java.util.Random;

public class SortingTest {

	public static void main(String[] args) {
		int[] testArray;
		int[] testArraySorted;
		int[] sortedArray;
		long startTime;
		long endTime;

		// test for sorted array
		testArraySorted = createArray(100_000);
		// testArray = shuffleArray(testArraySorted, new Random());
		testArray = createRandomArray(100_000, new Random());

		BubbleSort bubble = new BubbleSort();
		SortingAlgorythm selection = new SelectionSort();
		SortingAlgorythm insertion = new InsertionSort();

		System.out.println("Unsorted Array: ");
		SortingAlgorythm.printArray(testArray);

		System.out.println("\n selection sort: ");
		startTime = System.currentTimeMillis();
		sortedArray = selection.sort(testArray);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("insertion sort: ");
		startTime = System.currentTimeMillis();
		sortedArray = insertion.sort(testArray);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("Bubble sort for: ");
		startTime = System.currentTimeMillis();
		sortedArray = bubble.sort(testArray);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("Bubble sort while: ");
		startTime = System.currentTimeMillis();
		sortedArray = bubble.sortWithWhile(testArray);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		// *******************************sorted*********************************
		System.out.println("Sorted Array: ");
		SortingAlgorythm.printArray(testArraySorted);

		System.out.println("\n selection sort: ");
		startTime = System.currentTimeMillis();
		sortedArray = selection.sort(testArraySorted);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("insertion sort: ");
		startTime = System.currentTimeMillis();
		sortedArray = insertion.sort(testArraySorted);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("Bubble sort for: ");
		startTime = System.currentTimeMillis();
		sortedArray = bubble.sort(testArraySorted);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);

		System.out.println("Bubble sort while: ");
		startTime = System.currentTimeMillis();
		sortedArray = bubble.sortWithWhile(testArraySorted);
		endTime = System.currentTimeMillis();
		SortingAlgorythm.printArray(sortedArray);
		printRunTime(startTime, endTime);
	}

	@Deprecated
	private static int[] shuffleArray(int[] array, Random rand) {
		int randomIndex;
		int temp;
		for (int i = 0; i < array.length; i++) {
			randomIndex = rand.nextInt(array.length);
			temp = array[i];
			array[i] = array[randomIndex];
			array[randomIndex] = temp;
		}

		return array;
	}

	@Deprecated
	private static int[] createArray(int arrayLenght) {
		int[] temp = new int[arrayLenght];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
		}

		return temp;
	}

	private static int[] createRandomArray(int arrayLenght, Random rand) {
		int[] temp = new int[arrayLenght];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = rand.nextInt(Integer.MAX_VALUE);
		}

		return temp;
	}

	private static void printRunTime(long startTime, long endTime) {
		System.out.println("Run Time was: " + (endTime - startTime) + " ms \n");
	}
}
