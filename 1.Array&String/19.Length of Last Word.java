🔥 Bas itna hi logic hai:
1.Peeche se chalo
2.Spaces skip karo
3.Word milte hi count karo
4.Phir space mile to return karo



    
class Solution {
    public int lengthOfLastWord(String s) {
          int y = s.length();  // y = 13 (total characters including spaces)
          int a = 0;           // a = 0 (hum last word ka length yahan count karenge)

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
