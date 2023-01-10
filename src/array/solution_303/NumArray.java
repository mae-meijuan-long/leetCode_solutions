package array.solution_303;

public class NumArray {

    private int[] preSum;
    public NumArray(int[] nums) {
        preSum = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            preSum[i+1] = preSum[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return preSum[right] - preSum[left];
    }


}
