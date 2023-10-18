package bubbleSort;

public class bRecursive {
     static void bubble(int []arr, int n) {
    	
    	if(n==1) {
    		return;
    	}
    	for(int i=0;i<=n-2;i++) {
    		if(arr[i]>arr[i+1]) {
    			int temp=arr[i+1];
    			arr[i+1]=arr[i];
    			arr[i]=temp;
    		}
    	}
    	bubble(arr,n-1);
    }
     
	public static void main(String[]args) {
		int []nums=new int[] {5,3,2,1,4};
		for(int X:nums) {
			System.out.print(X+" ");
		}
		System.out.println();
		bubble(nums,5);
		for(int X:nums) {
			System.out.print(X+" ");
		}
	}
}
