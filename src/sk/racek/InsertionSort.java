package sk.racek;

public class InsertionSort implements SortingAlgorythm {

	@Override
	public int[] sort(int[] array) {
		int[] sorted = array.clone();
		int newNumber, index;
		for (int i = 1; i < sorted.length; i++) {
			// nove cislo
			newNumber = sorted[i];
			index = i;
			// pole je zotriedene bez noveho prvku
			// prejdi pole od zadu
			while (index > 0 && newNumber < sorted[index - 1]) {
				// prepis posledny prvok predchadzajucim prvkom
				// ak je mensi
				sorted[index] = sorted[index - 1];
				index--;
			}
			// zapis najmensi prvok na jeho miesto
			sorted[index] = newNumber;
		}
		return sorted;
	}
}
