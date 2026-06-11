class Solution {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int num = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if digit
            if(Character.isDigit(ch)) {

                num = num * 10 + (ch - '0');
            }

            // opening bracket
            else if(ch == '[') {

                countStack.push(num);
                stringStack.push(curr);

                num = 0;
                curr = "";
            }

            // closing bracket
            else if(ch == ']') {

                int repeat = countStack.pop();
                String prev = stringStack.pop();

                String temp = "";

                // repeat current string
                for(int j = 0; j < repeat; j++) {
                    temp += curr;
                }

                curr = prev + temp;
            }

            // normal character
            else {

                curr += ch;
            }
        }

        return curr;
    }
}
