package assignments;

public class LongestIncreasingSubsequence {

	static int incre_subseq(int arr[], int size){
	      int seq_arr[] = new int[size];
	      int i, j, max = 0;
	      
	      for (i = 0; i < size; i++)
	         seq_arr[i] = 1;
	      for (i = 1; i < size; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] > arr[j] && seq_arr[i] < seq_arr[j] + 1)
	    	  seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < size; i++)
	    	  if (max < seq_arr[i])
	    		  max = seq_arr[i];
	      	  return max;
	   }
	public static void main(String[] args) {
		
		int arr[] = { 10, 78, 45, 50, 78, 23, 60, 87, 90, 52, 99};
	      int size = arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(arr, size));
	}

}
