🔥 Bas itna hi logic hai:
1.Peeche se chalo
2.Spaces skip karo
3.Word milte hi count karo
4.Phir space mile to return karo



    
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
