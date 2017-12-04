package Base;

public class PleoTask {
	
	//constructor
	PleoTask(){}
	
	public void OutputCheck() {
		System.out.println("it works");
	}
	
	public int RainSurface() {
		
		//Vector : [2, 5, 1, 3, 1, 2, 1, 7, 7, 6]
		int arr[] = {2,5,1,3,1,2,1,7,7,6};
		// I need array length to loop
		int n = arr.length;
	
		//need to find tallest on the left
		int left[] = new int[n];
	    //need to find tallest on the right
        int right[] = new int[n];
		
        //returning value
        int waterFields = 0;
        
        // going through left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
           left[i] = Math.max(left[i-1], arr[i]); 
           //System.out.println(left[i]);// 555555777
           								// 1234567890
           //it will go FROM LEFT to left and it will be comparing, and find greatest
        }
        
        // through right array
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
           right[i] = Math.max(right[i+1], arr[i]);
           //System.out.println(right[i]);
           //777777777 - 
           //it will go FROM RIGHT to left, 
        }
        

        // Calculate the number of water fields among 
        for (int i = 0; i < n; i++) {
        	//System.out.println(Math.min(left[i],right[i])); //  2555555776
        	//System.out.println(arr[i]);                     //- 2513121776
        	//											      //  0042434000
           waterFields+=Math.min(left[i],right[i])-arr[i];
    
        }
      
        return waterFields;
	}
	
}