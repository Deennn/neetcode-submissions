class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] c = s.toCharArray();
        int len  = s.length()/2;
        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty()) {
                char x = stack.peek();
    
            if (x == '(' && c[i] == ')') {
                stack.pop();
            }
             if (x == '[' && c[i] == ']') {
                stack.pop();
            }
             if (x == '{' && c[i] == '}') {
                stack.pop();
            }
            }
            stack.push(c[i]);
        }
         for (int i = len; i < s.length(); i++) {
            char x = stack.peek();
    
            if (x == '(' && c[i] == ')') {
                stack.pop();
            }
             if (x == '[' && c[i] == ']') {
                stack.pop();
            }
             if (x == '{' && c[i] == '}') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
