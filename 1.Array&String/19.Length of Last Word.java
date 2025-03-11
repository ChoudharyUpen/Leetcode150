class Solution {
    public int lengthOfLastWord(String s) {
        int y = s.length();
        int a = 0;
        while(y > 0) {
            y--;
            if(s.charAt(y) != ' ') {
                a++;
            } else if(a > 0) {
                return a;
            }
        }
        return a;
    }
}
