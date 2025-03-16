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

this code uses Boyer-Moore Voting Algorithm to find the majority element 
Pratice this question more understand this 
search if this question can also be done with hashmap
