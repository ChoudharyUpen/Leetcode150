class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int majority=0;

        for(int n:nums){
            //phela number ko majority bana do 
            if(majority ==0 ){

                ans=n;

            }
            //agar majority element same element hai jo humna assume kiya hai toh +1 kar do warna -1 kar do 
            majority +=n ==ans? 1:-1;
        }
        return ans;
    }
}

this code uses Boyer-Moore Voting Algorithm to find the majority element 
Pratice this question more understand this 
search if this question can also be done with hashmap
