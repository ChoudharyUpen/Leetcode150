class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int majority=0;

        for(int n:nums){
            if(majority ==0 ){

                ans=n;

            }
            majority +=n ==ans? 1:-1;
        }
        return ans;
    }
}
