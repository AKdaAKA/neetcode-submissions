class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
            {
                stack.push('(');
            }
            if (s.charAt(i) == '[')
            {
                stack.push('[');
            }
            if (s.charAt(i) == '{')
            {
                stack.push('{');
            }
            
            if (s.charAt(i) == ')')
            {
                if (!stack.empty()) {
                if (stack.peek() == '(')
                {
                    stack.pop();
                }
                else {
                    return false;
                }
                }
                else {
                    return false;
                }
                
            }
            if (s.charAt(i) == ']')
            {
                if (!stack.empty()) {
                if (stack.peek() == '[')
                {
                    stack.pop();
                }
                else {
                    return false;
                }
                }
else {
                    return false;
                }
                
            }
            if (s.charAt(i) == '}')
            {
                if (!stack.empty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                }
                else {
                    return false;
                }
                }
                else {
                    return false;
                }
            }
        }
        if (stack.empty())
        {
            return true;
        }
        return false;
    }
}
