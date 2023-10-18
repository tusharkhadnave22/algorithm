package MergeSort;

import java.util.ArrayList;
import java.util.List;

public class mergeSort {
    
	public static void mergeSort(int [] nums, int low, int high) 
	{
		if(low>=high) {
			return;
		}
		int mid=(low+high)/2;
		mergeSort(nums,low,mid);
		mergeSort(nums,mid+1,high);
		merge(nums,low,high,mid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void merge(int[] nums, int low,int high,int mid) {
	 int left=low;
	 int right=mid+1;
	 List<Integer> temp=new ArrayList<>();
	 while(left<=mid && right<=high) 
	 {
		 if(nums[left]<=nums[right]) 
		 {
			 temp.add(nums[left]);
			 left++;
		 }
		 else 
		 {
			 temp.add(nums[right]);
			 right++;
		 }
	 }
	 while(left<=mid) {
		 temp.add(nums[left]);
		 left++;
	 }
	 while(right<=high) {
		 temp.add(nums[right]);
		 right++;
	 }
	 for(int i=low;i<=high;i++) {
		 nums[i]=temp.get(i-low);
	 }
	 
	}
	
	public static void main(String[] args) {
		int []nums=new int[] {5,3,2,1,4};
		for(int X:nums) {
			System.out.print(X+" ");
		}
		System.out.println();
		mergeSort(nums,0,4);
		for(int X:nums) {
			System.out.print(X+" ");
		}

	}

}
