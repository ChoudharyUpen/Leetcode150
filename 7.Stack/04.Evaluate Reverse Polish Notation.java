polish --- prefix
reverse polish notation --- postfix
(all code done by myself in first attempt some little mistakes were there)

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int num3 = 0;

                if (token.equals("+")) {
                    num3 = num2 + num1;
                } else if (token.equals("-")) {
                    num3 = num2 - num1;
                } else if (token.equals("*")) {
                    num3 = num2 * num1;
                } else if (token.equals("/")) {
                    num3 = num2 / num1;
                }
                
                stack.push(num3);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
