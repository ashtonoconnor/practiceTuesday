/**
 * 
 * @author Ashton O'Connor period 3A
 *
 */
public class ArrayTester {
	
	
	public static void main(String[] args) {
		
		
		int[][] square = {{1,2,3},{2,4,1},{3,1,2}};
		
		int[][] arr2D = { {0,1,2}, {3,4,5},  {6,7,8}, {9,5,3} };
		int[] result = ArrayTester.getColumn(arr2D, 1);
		for (int i = 0; i < arr2D.length; i++) {
		System.out.println(result[i]);
		}
		ArrayTester.isLatin(square);
		
		
	}
	/**
	 * +1 for constructing int[] of size arr2D
	 * +1 for arr2D[r][c] -- accessing al items in one column
	 * +1 for assigning result[r] from arr2D
	 * +1 for having all items result array in order
	 * @param arr2D
	 * @param c
	 * @return
	 */
	
	public static int[] getColumn(int[][] arr2D, int c) {
		
		int[] result = new int[arr2D.length];
		for (int r = 0; r < arr2D.length; r++ ) {
			result[r] = arr2D[r][c];
			
		}
		
		return result;
		
	}
	
	
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		//returns true if and only if every value in arr1 appears in arr2
		int j = 0;
		for ( int i = 0; i < arr1.length;) {
			
			if (arr1[i] == arr2[j] || arr1[i]==arr2[j+1] || arr1[i] ==arr2[j+2]) {
				i+= 1;
				
			}else {
				//System.out.println("false");
				return false;
			}

 		}
		//System.out.println("true");
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	public static boolean containsDuplicates(int[] arr) {
		
		// returns true if the given one dimensional array arr contains any duplicate values and false otherwise
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j ++) {
				if (i!= j && arr[i] == arr[j]) {
					//System.out.println(true);
					return true;
				}
			}
		}
		//System.out.println(false);
		return false;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * +1 for calling containsDuplicates
	 * +1 for calling hasAllValues
	 * +1 for applying hasAllValues to all rows
	 * +1 for calling getColumn
	 * +1 for returning true/false when respective conditions are satisfied
	 * @param square
	 * @return
	 */
	
	public static boolean isLatin(int[][] square) {
		
		if (containsDuplicates(square[0]) ) {
			System.out.println("false");
			return false;
		}
		for ( int r = 1; r < square.length; r++) {
			if ( !hasAllValues(square[0], square[r])) {
				System.out.println("false");
				return false;
			}
		}
		for (int c = 0; c < square[0].length; c++) {
		if (!hasAllValues(square[0], getColumn(square, c))) {
			return false;
		}
		}
		System.out.println("true");
		return true;
	}
	

}
