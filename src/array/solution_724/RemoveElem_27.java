package array.solution_724;

public class RemoveElem_27 {
    public int removeElement(int[] nums, int val) {
       if(nums.length<1){
           return -1;
       }

       int left = -1;
       int right = -1;
      for(int i = 0;i<nums.length;i++){
          if(left ==-1){
              if(nums[i]==val){
                  left = i;
                  right = i;
              }
          }
      }

      if(left==-1 && right == -1) return 0;
      while(right<nums.length-1){
          right ++;
          if(nums[right]!=val){
              int tmp = nums[left];
              nums[left] = nums[right];
              nums[right] = tmp;
              left ++;
          }
      }
      return left + 1;
    }
}
