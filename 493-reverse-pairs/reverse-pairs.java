class Solution{
        void merge(int nums[] , int low , int mid , int high){

            ArrayList<Integer> temp = new ArrayList<>();

            int left = low , right = mid+1;

            while(left <= mid && right <= high){
                if(nums[left] <= nums[right]){
                    temp.add(nums[left]);
                    left++;
                }else{
                    temp.add(nums[right]);
                    right++;
                }
            }
                //copy remaining elements from left half
                while(left <= mid){
                    temp.add(nums[left]);
                    left++;
                }
                //copy remaining elements from right half

                while(right <= high){
                    temp.add(nums[right]);
                    right++;
                }
               //copy sorted elements to original array
               for(int i = low; i<=high; i++){
                nums[i] = temp.get(i-low);
               }

        }
        int countPairs(int nums[] , int low , int mid , int high){
            int right = mid+1;
            int count = 0;
              for(int i= low ; i<=mid; i++){
                 while(right <= high && nums[i] > 2L * nums[right]){
                        right++;
                 }
                        count += right - (mid+1);
              }
              return count;
        }
       int mergesort(int nums[] , int low , int high){ 
           int count = 0;
           if(low >= high){
            return count;
           }
           int mid = (low + high)/2;
            //recursively sort left half
           count += mergesort(nums , low,mid);
             //recursively sort left half
           count += mergesort(nums , mid+1 , high);
           //merge two sorted halves
           count += countPairs(nums , low , mid , high);
           merge(nums , low , mid , high);
           return count;
       }
       public int reversePairs(int[] nums) {
         int n = nums.length;
        return mergesort(nums , 0 , n-1);
        
    }
}