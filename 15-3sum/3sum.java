class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
            Set<Integer> st = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
                int third = -(nums[i] + nums[j]); 
                if(st.contains(third)){
                List<Integer> list= new ArrayList<>();
                  list.add(nums[i]);
                  list.add(nums[j]);
                  list.add(third);
                  Collections.sort(list);
                  set.add(list);
                }
                st.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> list : set){
            ans.add(list);
        }
        return ans;
    }
}