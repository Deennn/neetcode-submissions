class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                char x = stack.peek();
    
            if (x == '(' && c[i] == ')') {
                stack.pop();
                continue;
            }
             if (x == '[' && c[i] == ']') {
                stack.pop();
                continue;
            }
             if (x == '{' && c[i] == '}') {
                stack.pop();
                continue;
            }
            }
            stack.push(c[i]);
        }
         
        return stack.isEmpty();
    }
}
