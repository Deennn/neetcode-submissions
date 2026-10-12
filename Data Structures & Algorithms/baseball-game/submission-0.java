class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (String ops: operations) {
            if (ops.equals("+")) {
                int last = stack.peek();
                int secondLast = stack.get(stack.size() - 2);
                stack.push(last + secondLast);
            } else if (ops.equals("D")) {
                stack.push(stack.peek() *2);
            } else if (ops.equals("C")) {
                stack.pop();
            } else{
                stack.push(Integer.valueOf(ops));
            }
        }

        for (int i : stack) {
            res += i;
        }
        return res;
    }
}