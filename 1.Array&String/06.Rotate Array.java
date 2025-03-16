class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
        k=k%n;
        if(k==0 ||n<=1){
            return;
        }
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}


this is good question to pratice again and again
