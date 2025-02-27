package DSA;

public class LinearSearch {

	public static void main (String[] args){
		
		int nums[]={2,4,7,8,5};
		int target=8;
		
		//int result=linearSearch(nums,target);
		int result= binarySearch(nums,target,0, nums.length-1);
		if(result >0){
			System.out.println("index element is"+ result);
		}
		else
			System.out.println("no element index found");
		
	}

	public static int binarySearch(int[] nums, int target,int start, int end) {
		// TODO Auto-generated method stub		
		if(start <= end){
			int mid = (start+end)/2;
			if(nums[mid]==target){
				return mid;
			}
			
			if(nums[mid]< target){
				return binarySearch(nums,target,mid+1,end);
			
			}
			else{
				return binarySearch(nums,target,start,mid-1);
			}
		
		}	
		return -1;
	}

	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	
	public static int linearSearch(int nums[], int target) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<nums.length-1;i++){
			if(nums[i] == target){
				return i;
			}
		}
		
			return -1;
		
	}
	
}
