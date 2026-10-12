class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == '{') {
                stack.push(c);
            } else if (c == '[') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else if (c == '}') {
                stack.pop();
            } else if (c == ']'){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
