🔍 Problem samajho:
Input: Ek string path jisme / se separated folders hote hain.
Rules:
1    . ka matlab hota hai current folder → ignore karo.
2    .. ka matlab hota hai peeche waala folder → ek folder peeche jao.
3     // ka koi matlab nahi → ignore karo.





class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();

        for (String comp : components) {
            if (comp.equals("") || comp.equals(".")) {
                continue;
            }

            if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(comp);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();        
    }
}
