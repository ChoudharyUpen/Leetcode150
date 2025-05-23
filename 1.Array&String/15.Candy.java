class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n, i = 1;
        while(i < n){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }
            
            //For increasing slope
            int peak = 0;
            while(ratings[i] > ratings[i-1]){
                peak++;
                candy += peak;
                i++;
                if(i == n) return candy;
            }
            
            //For decreasing slope
            int valley = 0;
            while(i<n && ratings[i] < ratings[i-1]){
                valley++;
                candy += valley;
                i++;
            }
            candy -= Math.min(peak, valley); //Keep only the higher peak
        }
        return candy;
    }
}
