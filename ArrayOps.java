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
		for (int i = 0; i<arr.length; i++){
			max = arr[i] > max ? arr[i] : max;
		}
		return max;
	}
}
