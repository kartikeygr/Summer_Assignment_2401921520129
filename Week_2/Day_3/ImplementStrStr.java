class Solution{
    public int strStr(String haystack, String needle) {
// loop only till positions where complete needle can fit
        for(int i = 0; i <= haystack.length()-needle.length(); i++) { 
            int j;
            // compare needle characters
            for(j = 0; j < needle.length(); j++) {
                if(haystack.charAt(i+j)!=needle.charAt(j)) {
                    break;
                }
            }
            // full match found
            if(j==needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
