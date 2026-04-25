class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
      ArrayList<Integer> pos = new ArrayList<>();
      ArrayList<Integer> neg = new ArrayList<>();
      
      for(int i = 0; i<n; i++){
        if(nums[i] > 0){
            pos.add(nums[i]);
        }else if(nums[i] < 0){
            neg.add(nums[i]);
        }
      }

      for(int i = 0; i<pos.size(); i++){
         nums[2*i] = pos.get(i);
      }
      for(int i = 0; i<neg.size(); i++){
         nums[2*i+1] = neg.get(i);

      }
return nums;
    }
}