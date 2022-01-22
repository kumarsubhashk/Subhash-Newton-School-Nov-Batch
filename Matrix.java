/*
TC: O(N*logN)
SC: O(N*M)
Author: @devangs
*/
import java.util.*; // contains Collections framework
class Matrix 
{
    static int first(int arr[], int low, int high)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
 
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;
 
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);
                 
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }
 
    static int rowWithMax1s(int mat[][], int m , int n)
    {
        int max_row_index = 0, max = -1;
        int i, index;
        for (i = 0; i < m; i++) {
            index = first(mat[i], 0, n - 1);
            if (index != -1 && n - index > max) {
                max = n - index;
                max_row_index = i;
            }
        }
             return max_row_index;
    }
 
       
	public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
		int m = in.nextInt();
        int n = in.nextInt();
		int i,j;
            
        int mat[][] = new int[m][n];
  		for (i = 0; i < m; i++)
        {
        for (j = 0; j < n; j++)
            {
            mat[i][j] = in.nextInt();
            }
        }
        System.out.println(rowWithMax1s(mat,m,n));
	}
}
