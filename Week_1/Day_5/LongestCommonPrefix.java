class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }
        String prefix = "";

//by this for loop we take first string as reference to compare with other strings and find common prefix
        for(int j = 0; j < strs[0].length(); j++) {
            char ch = strs[0].charAt(j);

//str.length moves to each word in string like flower,flow,flight and we use i=1 because now we have to compare str[0] i.e. flower with flow then i=2 it goes to flight. 
            for(int i = 1; i < strs.length; i++) {
                if(strs[i].charAt(j) != ch || j >= strs[i].length()) {
                    return prefix;
//example: str[1].charAt[0] gives f of flow which is equal to ch i.e. f of flower so it added to prefix (prefix+=ch).
                }
            }
            prefix += ch;
        }
        return prefix;
    }
}
