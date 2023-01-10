package array;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;


        int left = 0;
        int right = nums.length-1;
        int middle = 0;

        while(left<=right){
            middle = (left + right)/2;
            if(target>nums[middle]){
                left = middle + 1;
            }else if(target < nums[middle]){
                right = middle -1;
            }else {
                return middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int search = new BinarySearch().search(new int[]{9,12}, 12);

        System.out.println(search);
    }
}
