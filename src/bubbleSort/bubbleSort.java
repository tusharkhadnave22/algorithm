package bubbleSort;

public class bubbleSort {
    public static int[] bubble(int [] nums) {
    	int n=nums.length;
    	for(int i=n-2;i>=0;i--) {
    		for(int j=0;j<=i;j++) {
    			if(nums[j]>nums[j+1]) {
    				int temp=nums[j];
    				nums[j]=nums[j+1];
    				nums[j+1]=temp;
    			}
    		}
    	}
    	return nums;
    }
	public static void main(String[] args) {
		
        int []a=new int[] {5,4,10,78,4,3,2,1};
        int []ans=bubble(a);
        for(int x:ans) {
        	System.out.print(x);
        }
	

}
}
