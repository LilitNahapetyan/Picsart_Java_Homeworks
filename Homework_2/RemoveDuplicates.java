/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. Then return the number of unique elements in nums. */

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        System.out.print("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int length = RemoveDuplicates.removeDuplicates(nums);

        System.out.print("Modified Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Modified Array Length: " + length);
    }
}
