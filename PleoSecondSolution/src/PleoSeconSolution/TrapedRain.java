package PleoSeconSolution;

import java.util.Arrays;

public class TrapedRain {
	//constructor
	TrapedRain(){}
	
	public int RainSurface() {
		
		//Vector : [2, 5, 1, 3, 1, 2, 1, 7, 7, 6]
		int arr[]    = {2,5,1,3,1,2,1,7,7,6};
		int n	     = arr.length-1;
		int newArr[] = new int[arr.length];
		
		//biggest value, and first biggest on the left
		int firstBig  = 0;
		int secondBig = 0;
		
		//pulling out the Biggest value #1 I sorted, #2 I took last element
		int sortArray[] = arr.clone();
	    Arrays.sort(sortArray);
	    secondBig = sortArray[n];
		
		// #1 chopping the left part (every element that's smaller than first biggest will be equal to the biggest
		for (int i=1; i<=n; i++) {	
			
			if(arr[0]<arr[1]) {
				firstBig=arr[1];
			}
			
			if(arr[i-1]<arr[i] && arr[i]>=firstBig && arr[i]!=secondBig) {
				arr[i-1]=arr[i];
			}else {
				arr[i-1]=arr[i-1];
			}
			
		}
		
		// #2 Chopping the right part
		for (int i=secondBig; i<=n; i++) {	
			arr[i]=firstBig;
		}
		int result = 0;
		
		//array of 10 elements all equal to firstBig
		for	(int i=0; i<=n; i++) {
			newArr[i]=firstBig;
		}
		
		for (int i=0; i<n; i++) {
			int sub = newArr[i]-arr[i];
			result += sub;
		}
		
		return result;
	}
}