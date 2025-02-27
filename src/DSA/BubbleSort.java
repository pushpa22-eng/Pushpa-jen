package DSA;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums={4,56,7,3,2};
		int[]sorted= bubbleSort(nums);
		for(int j : sorted ) 
   System.out.println( j);
		
	}

	public static int[] bubbleSort(int[] nums) {
 int temp=0;
for(int i=nums.length-1; i>=0; i--){
	for(int j=0;j < nums.length-i-1;j++){
		if(nums[j] > nums[j+1]){
			temp=nums[j];
			nums[j]=nums[j+1];
			nums[j+1]=temp;
		}
	}
	
  }
return nums;
}
		

}

