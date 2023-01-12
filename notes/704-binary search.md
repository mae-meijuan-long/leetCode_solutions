# 704-binary search

When we define the range.
There is two different ranges

***One is [left,right]***

**another is [left,right)**

*when I loop the array,I didn't control the boundary very well,then caused many issues when submit these.*

*There is the solution of two range types;*



### [left,right]



<font color='red'>when I wrote this,I didn't give the correct initial right index value when first loop ,Then all of then didn't passed</font>

```java
class Solution {
    public int search(int[] nums, int target) {
    	if(nums.length==0) return -1;
		int leftIndex = 0;
		int rightIndex = nums.length-1;
		int middleIndex = 0;
		while(leftIndex<=rightIndex){
			middleIndex = (leftIndex + rightIndex) /2 ;
			if(nums[middleIndex] < target){
				//because we already know the nums[middleIndex] != target,
				//it is not neccesary to put it in the new loop range again
				leftIndex = middleIndex + 1;
			}else if(nums[middleIndex] > target){
				rightIndex = middleIndex - 1;
			}else{
				return middleIndex;
			}
		}
    	return -1; 
    }
}
```

### [left,right)

<font color = 'red'> In here I made mistake in 		`rightIndex = middleIndex;`
I wrote it as `rightIndex = middleIndex-1;` I didn't noticed that the range already changed to [left,right)
</font>

```java
class Solution {
    public int search(int[] nums, int target) {
    	if(nums.length==0) return -1;
    	int leftIndex = 0;
    	int rightIndex = nums.length ;
    	int middleIndex = 0;
    	while(leftIndex < rightIndex){
    		middleIndex = (leftIndex + rightIndex) /2 ;
    		if(nums[middleIndex]>target){
    			rightIndex = middleIndex;
    		}else if(nums[middleIndex]<target){
    			leftIndex = middleIndex + 1;
    		}else{
    			return middleIndex;
    		}
    	}
    	return -1;
    	
    }
}
```



