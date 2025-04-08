//(Spaces hatake, words ko reverse order me likhna hai)

🧠 Super Simple Recap:
1.Words split karo (spaces hata ke)
2.Reverse order me words add karo
3.Beech me space daalo
4.Final string return karo (extra spaces hata ke)


class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }
}
