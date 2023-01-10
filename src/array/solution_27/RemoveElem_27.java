package array.solution_27;

public class RemoveElem_27 {
    /***
     * @param nums [0,1,2,2,3,0,4,2]
     * @param val 2
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if(nums.length<1){
            return 0;
        }

        int left = 0;
        int right = 0;

        while(right<nums.length-1){
            right ++;
            if(nums[left] != val){
                left ++;
            }
            if(nums[right] != val && nums[left] == val ){
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left ++;
            }
        }

        System.out.println(left+"right"+right);
        if(left> right) return nums.length;
        if(left == right && nums[left] == val) return left;
        if(left == right && nums[left] != val) return nums.length;
        return left;

    }

    public static void main(String[] args) {
//        int i = new RemoveElem_27().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        int i = new RemoveElem_27().removeElement(new int[]{3}, 3);

        System.out.println(i);
    }
}
