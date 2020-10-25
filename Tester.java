import java.util.Arrays;

public class Tester {
	public static void main(String[] Args){
		int[] Array1 = {3,5,3,2,4,1,4};
		int[] Array2 = {3,1,5,7,3,2};
		int[][] Matrix1 = {{2,5,7},{3,5,2},{4,7,9}};
		System.out.println(ArrayOps.sum(Array1));
		System.out.println(ArrayOps.largest(Array1));

		System.out.println(ArrayOps.sum(Array2));
		System.out.println(ArrayOps.largest(Array2));
		
		System.out.println(Arrays.toString(ArrayOps.sumRows(Matrix1)));
	}
}
