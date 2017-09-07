package sk.racek;

public class MergeSort implements SortingAlgorythm {

	@Override
	public int[] sort(int[] array) {
		if (array.length == 1) {
			return array;
		}
		int midIndex = array.length / 2;
		int maxIndex = array.length;
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[maxIndex - midIndex];

		for (int i = 0; i < array.length; i++) {
			if (i < midIndex) {
				leftArray[i] = array[i];
			} else {
				rightArray[i - midIndex] = array[i];
			}
		}

		leftArray = sort(leftArray);
		rightArray = sort(rightArray);

		return merge(leftArray, rightArray);
	}

	private int[] merge(int[] leftArray, int[] rightArray) {
		int[] mergedArray = new int[leftArray.length + rightArray.length];

		int a = 0, b = 0;

		for (int i = 0; i < mergedArray.length; i++) {
			if (a == leftArray.length) {
				mergedArray[i] = rightArray[b];
				b++;
			} else if (b == rightArray.length) {
				mergedArray[i] = leftArray[a];
				a++;
			} else if (leftArray[a] > rightArray[b]) {
				mergedArray[i] = rightArray[b];
				b++;
			} else {
				mergedArray[i] = leftArray[a];
				a++;
			}
		}

		return mergedArray;
	}

}
