class Solution {
    public int search(int[] nums, int target) {
       int l = 0 , m = 0 , h = nums.length-1;
       while(l<=h){
         m = (l+h)/2; 
        if(nums[m] == target){
            return m;
        }
        //left sorted array(or to check where middle is present)
        else if(nums[l] <= nums[m]){
            //set range to find target in left array
         if(nums[l] <= target  && target < nums[m]){
            h = m-1;
         }else{
            l = m+1;
         }
        }
        else{
            if(target <= nums[h] && nums[m] < target){
                l = m+1;
            }else{
                h = m-1;
            }
        }
       } 
       return -1;
    }
}