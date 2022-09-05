package arrays;

public class EightInts {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,8};
		int index;
		System.out.println("First to Last: ");
		for(index=0;index<nums.length;index++) {
			System.out.print(nums[index]+" ");
		}
		System.out.println();
		System.out.println("Last to First: ");
		for(index=nums.length-1;index>=0;index--) {
			System.out.print(nums[index]+" ");
		}
		System.out.println();
	}

}
