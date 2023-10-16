package SelctionSort;

public class selection {
	 public static int[] section(int[] nums) {
	    	
	    	for(int i=0;i<nums.length-1;i++) 
	    	{
	    
	    		int minIndex=i;
	    		for(int j=i;j<nums.length;j++) 
	    		{
	    			if(nums[minIndex]>nums[j]) 
	    			{
	    		
	    				minIndex=j;
	    			}
	    			
	    		}
	    		    int temp=nums[i];
	    			nums[i]=nums[minIndex];
	    			nums[minIndex]=temp;
	    	}
	    	return nums;
	    }
		public static void main(String[] args) {
			
	        int []a=new int[] {5,4,3,2,1};
	        int []ans=section(a);
	        for(int x:ans) {
	        	System.out.print(x);
	        }
		}
}
