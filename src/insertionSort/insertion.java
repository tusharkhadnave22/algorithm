package insertionSort;

public class insertion {
    public static int[] insertion(int[] nums) {
    	for(int i=0;i<nums.length;i++) {
    		int j=i;
    		while(j>0) {
    			if(nums[j]<nums[j-1] ){
    				int temp=nums[j];
    				nums[j]=nums[j-1];
    				nums[j-1]=temp;
    				j--;
    			}
    			else {
    				break;
    			}
    		}
    	}
    	return nums;
    }
	public static void main(String[] args) {
		 int []a=new int[] {5,4,10,78,4,3,2,1};
	        int []ans=insertion(a);
	        for(int x:ans) {
	        	System.out.print(x);
	        }
	}

}
