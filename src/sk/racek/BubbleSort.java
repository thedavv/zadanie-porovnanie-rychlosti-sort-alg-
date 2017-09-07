package sk.racek;

public class BubbleSort implements SortingAlgorythm {

	public int[] sortWithWhile(int[] array) {
		int[] sorted = array.clone();
		int j = sorted.length - 2, temp;
		boolean swapped = true;

		// kontroluj ci je pole zotriedene
		while (swapped) {
			swapped = false;
			// prebublanie najtazsieho prvku
			for (int i = 0; i <= j; i++) {
				if (sorted[i] > sorted[i + 1]) {
					temp = sorted[i];
					sorted[i] = sorted[i + 1];
					sorted[i + 1] = temp;
					swapped = true;
				}
			}
			// nekontroluj prebublane prvky
			j--;
		}

		return sorted;
	}

	// test pre bubblesort s for
	@Override
	public int[] sort(int[] array) {
		int[] sorted = array.clone();
		int temp;
		boolean swapped = false;

		for (int i = sorted.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (sorted[j] > sorted[j + 1]) {
					temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			} else {
				swapped = false;
			}
		}

		return sorted;
	}
}
