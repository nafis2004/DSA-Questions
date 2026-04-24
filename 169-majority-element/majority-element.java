class Solution {
    public int majorityElement(int[] nums) {
   //Optimal Approach : Moore's Voting Algorith

   int el = 0 ;
   int count = 0;

   //step 1 : find candidate
   for(int i = 0; i<nums.length; i++){
       if(count == 0){
        count = 1;
        el = nums[i];
       }else if(nums[i] == el){
          count++;
       }else{
        count--;
       }
   }

   //step 2 : verify candidate
   int count1 = 0;
   for(int num: nums){
    if(num == el){
        count1++;
    }
   }
   if(count1 > nums.length/2){
    return el;
   }
 return -1;
    }
}