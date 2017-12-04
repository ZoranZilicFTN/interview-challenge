package PleoSeconSolution;

public class TrapedRain {
	//constructor
	TrapedRain(){}
	
	public int RainSurface() {
		
		//Vector : [2, 5, 1, 3, 1, 2, 1, 7, 7, 6]
		int arr[]    = {2,5,1,3,1,2,1,7,7,6};
		int n	     = arr.length-1;
		int newArr[] = {5,5,5,5,5,5,5,5,5,5,};
		
		int firstBig  = 0;
		int secondBig = 0;
		
		
		// #1 chopping the left part (every element that's smaller than first biggest will be equal to the biggest
		for (int i=1; i<=n; i++) {	
			
			if(arr[0]<arr[1]) {
				firstBig=arr[1];
			}
			
			if(arr[i-1]<arr[i] && arr[i]>=firstBig && arr[i]!=7) {
				arr[i-1]=arr[i];
			}else {
				arr[i-1]=arr[i-1];
			}
			
			if(arr[i]==7) {
				secondBig=i-1;
			}
		}
		
		
		// #2 Chopping the right part
		for (int i=secondBig; i<=n; i++) {	
			arr[i]=firstBig;
		}
		int result = 0;
		
		for (int i=0; i<n; i++) {
			int sub = newArr[i]-arr[i];
			result += sub;
		}
		
		return result;
	}
}