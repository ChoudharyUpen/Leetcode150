🪄 Super Simple Summary:
1.Citations ko sort karo.
2.Check karo har paper ke liye:
3.Kya citation[i] >= bache hue papers (n - i)?
4.Agar haan, to n - i hi answer.
5.Agar koi bhi na mila toh return 0.


class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }

        return 0; 
    }
}
