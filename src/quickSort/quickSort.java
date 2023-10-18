package quickSort;
import java.util.* ;
	import java.io.*; 
public class quickSort {
	
	
	    public static int sort(List<Integer> arr,int low,int high){
	        int pivote=arr.get(low);
	        int i=low;
	        int j=high;
	        while(i<j)
	        {
	            while(pivote>=arr.get(i) && i<=high-1){
	                i++;
	            }
	            while(pivote<arr.get(j) && j>=low+1){
	                j--;
	            }
	            if(i<j){
	               Collections.swap(arr,i,j);
	            }
	        }
	                Collections.swap(arr,low,j);
	                return j;

	    }
	    public static void qs(List<Integer> arr,int low,int high){
	        if(low<high){
	            int pivote=sort(arr,low,high);
	            qs(arr,low,pivote-1);
	            qs(arr,pivote+1,high);
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    public static void quickSort1(List<Integer> arr){
	        qs(arr,0,arr.size()-1);
	        
	    }
	
	public static void main(String[] args) {
		
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        for(int x:list) {
        	System.out.print(x+" ");
        }
        quickSort1(list);
        System.out.println("");
        for(int x:list) {
        	System.out.print(x+" ");
        }
	}

}
