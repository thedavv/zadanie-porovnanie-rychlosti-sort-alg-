package sk.racek;

public interface SortingAlgorythm {
	int[] sort(int[] array);
	
	static void printArray(int[] array){
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
