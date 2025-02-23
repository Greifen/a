package sort;

public class Sort {

	public static int[] selectionsort(int[] sortieren) {
		int min;
		for (int i = 0; i < sortieren.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[min] > sortieren[j]) {
					min = j;
				}
			}
			int temp = sortieren[i];
			sortieren[i] = sortieren[min];
			sortieren[min] = temp;
			printArray(sortieren);
		}

		return sortieren;
	}	
	
	public static void main(String[] args) {

		//int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
		int[] unsortiert = { 5, 12, 27, 3, 4, 7};
		printArray(unsortiert);
		int[] sortiert = selectionsort(unsortiert);
		printArray(sortiert);

	}

	private static void printArray(int[] sortiert) {
		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + ", ");
		}
		System.out.println();
	}
}







