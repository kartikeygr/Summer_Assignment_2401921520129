import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] freq=new int[26];
        int[] window = new int[26];
        //frequency of s1
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch - 'a']++;
        }
        //first window of s1 length
        for(int i=0;i<s1.length();i++){
            char ch= s2.charAt(i);
            window[ch-'a']++;
        }
        //checking first window does it equal with s1 or not
        if(Arrays.equals(freq, window)){
            return true;
        }
//sliding window for remaining s2, so we start with index 2 because s1 length is 2 and it already done in first window i.e. ei from eidbaooo(example1).
        for(int i =s1.length(); i<s2.length(); i++) {
            //add new character
        char end = s2.charAt(i);
        window[end-'a']++;
        //remove old character
        char start= s2.charAt(i-s1.length());
        window[start-'a']--;
        //compare arrays
        if(Arrays.equals(freq,window)){
            return true;
        }
    }
        return false;
    }
}
