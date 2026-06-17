import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            // c includes all brackets but we only consider opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else{
                if(stack.isEmpty()) {
                    return false;
            }
                
//when matching opening bracket found as closing then we pop it from stack
                char top = stack.pop();
                //pop removes LAST inserted opening bracket

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
