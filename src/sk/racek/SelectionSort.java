package sk.racek;

public class SelectionSort implements SortingAlgorythm {

	@Override
	public int[] sort(int[] array) {
		int[] sorted = array.clone();
		int minIndex;
		int temp;
		for (int i = 0; i < (sorted.length - 1); i++) {
			minIndex = sorted.length - 1;
			// najdi min
			for (int j = i; j < (sorted.length - 1); j++)
				if (sorted[minIndex] > sorted[j]) {
					minIndex = j;
				}
			// swap
			temp = sorted[minIndex];
			sorted[minIndex] = sorted[i];
			sorted[i] = temp;
		}
		return sorted;
	}
}
