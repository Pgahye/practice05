package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		// 시간복잡도 n제곱

		for (int i = 0; i < count; i++) {

			for (int j = i + 1; j < count; j++) {

				if (array[i] < array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}