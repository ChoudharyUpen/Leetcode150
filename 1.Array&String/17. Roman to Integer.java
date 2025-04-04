class Solution {
    public int romanToInt(String s) {
        int ans = 0; // final answer yahan store hoga
        int num = 0; // current letter ki value yahan aayegi
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            //chhoti value ke baad badi value thi → subtract karna hai
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    } 
}
