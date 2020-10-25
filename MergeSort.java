package algorithmsTest;

/**
 * Merge Sort write by java.
 * @author zzg
 * @version 1.01 2018-09-11
 */
public class MergeSort
{	
	public static void main(String[] args)
	{
		double [] a = { 1, 19.1111, 11.222, 6, 233.0, 1024, 666.3333, 55, 666.6, 9999.9 };
		System.out.print("Before sort, double [] a is: ");
		for (double i : a)
			System.out.print(i + ", ");
		System.out.println();
		System.out.print("After sort, double [] a is: ");
		mergeSort(a, 0, a.length-1);
		for (double i : a)
			System.out.print(i + ", ");
	}

	public static void mergeSort(double[] A, int p, int r)
	{
		if (p < r)
		{	
			int q = (int) ((p + r) / 2);
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}

	public static void merge(double[] A, int p, int q, int r)
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		double [] L = new double[n1 + 1];
		double [] R = new double[n2 + 1];

		for (int i = 0; i < n1; i++)
			L[i] = A[p + i];
		for (int j = 0; j < n2; j++)
			R[j] = A[q + j + 1];

		L[n1] = Double.MAX_VALUE;
		R[n2] = Double.MAX_VALUE;
		int i = 0;
		int j = 0;

		for (int k = p; k < r + 1; k++)
		{
			if (L[i] <= R[j])
			{
				A[k] = L[i];
				i += 1;
			}
			else 
			{
				A[k] = R[j];
				j += 1;
			}
		}
	}
} 
