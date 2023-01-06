package array.solution_724;

public class PivotIndex {


    public int pivotIndex(int[] nums) {

        if(nums.length==0) return -1;


        int preIndex = -1;
        int nowIndex = preIndex+1;
        int[] leftRightSum = new int[2];

        //initial left sum
        leftRightSum[0] = 0;

        //initial right sum
        for(int i = 1;i<nums.length;i++){
            leftRightSum[1] += nums[i];
        }


        while(leftRightSum[1] != leftRightSum[0] && nowIndex<nums.length-1){
            preIndex++;
            nowIndex ++;
            leftRightSum[0] += nums[preIndex];
            leftRightSum[1] -= nums[nowIndex];

        }

        if(leftRightSum[1] == leftRightSum[0]){
            return nowIndex;
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(new PivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(new PivotIndex().pivotIndex(new int[]{1, 2, 3}));
        System.out.println(new PivotIndex().pivotIndex(new int[]{2, 1, -1}));
    }
}
