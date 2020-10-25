public class ArrayOps {
	public static int sum(int[] arr){
		int result = 0;
		for (int i = 0; i < arr.length; i++){
			result += arr[i];
		}
		return result;
	}

	public static int largest(int[] arr){
		int max = 0;
		for (int i = 0; i < arr.length; i++){
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}
	
	public static int[] sumRows(int[][] matrix){
		int[] sumArray = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++){
			sumArray[i] = sum(matrix[i]);
		}
		return sumArray;	
	}

	public static int[] largestInRows(int[][] matrix){
		int[] largestArray = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++){
			largestArray[i] = largest(matrix[i]);
		}
		return largestArray;
	}
	
	public static int sum(int[][] arr){
		int result = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				result += arr[i][j];
			}
		}
		return result;
	}

	public static boolean isRowMagic(int[][] matrix){
		boolean magic = true;

		if (matrix.length == 0)	return magic;

		for (int i = 0; magic == true && i < matrix.length - 1;  i++){
			if (!(sum(matrix[i]) == sum(matrix[i+1]))){
				magic = false;
			}
		}
		return magic;
	}

	public static int[][] matrixRotate(int[][] matrix){
		int [][] rotated = new int[matrix[0].length][];
		
		for (int i = 0; i < matrix[0].length; i++){
			rotated[i] = new int [matrix.length];
			for (int j = 0; j < matrix.length; j++){
				rotated[i][j] = matrix[j][i];
			}
		}
		return rotated;
	}

	public static boolean isColMagic(int[][] matrix){
		if (matrix.length == 0) return true;
		
		return isRowMagic(matrixRotate(matrix));
	}
}
