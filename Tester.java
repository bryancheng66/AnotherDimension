import java.util.Arrays;

public class Tester {
	public static void main(String[] Args){
		int[] Array1 = {3,5,3,2,4,1,4};
		int[] Array2 = {3,1,5,7,3,2};
		int[][] Matrix1 = {{2,5,7},{3,5,2},{4,7,9}};
		int[][]  A = { {  1,  0, 12, -1 },
                	{  7, -2,  2,  1 },
                	{ -5, -2,  2, -9 }
               };
		int[]  B  =   {  1, 3, 5 };

		int[][]  Matrix2 = { 
			{  1,  2, 3, 4 },
   			{  2, 3,  4,  1 },
   			{ 3, 4,  1, 2 } 
		};

		int[][] Matrix3 = {};
		System.out.println(ArrayOps.sum(Array1));
		System.out.println(ArrayOps.largest(Array1));

		System.out.println(ArrayOps.sum(Array2));
		System.out.println(ArrayOps.largest(Array2));
		
		System.out.println(Arrays.toString(ArrayOps.sumRows(Matrix1)));
		System.out.println(Arrays.toString(ArrayOps.largestInRows(Matrix1)));
		
		System.out.println( Arrays.toString(ArrayOps.sumRows(A)));
		//expected output:
		//[12, 8, -14]

		System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
		//xpected output:
		//12, 7, 2]

		System.out.println( ArrayOps.sum(B)); 
		//expected output:
		//9

		System.out.println( ArrayOps.sum(A));   //this calls the overloaded 2d array version!
		//expected output:
		//6
		
		System.out.println(ArrayOps.isRowMagic(Matrix2));
		System.out.println(ArrayOps.isRowMagic(Matrix3));

	}
}
