class Solution {
    public int singleNumber(int[] nums) {
    //using xor 
    //property : (a ^ a = a) & (0 ^ a = a)
    int xor = 0;
    for(int i = 0; i<nums.length; i++){
        xor = xor ^ nums[i];
    }
    return xor;
    }
}