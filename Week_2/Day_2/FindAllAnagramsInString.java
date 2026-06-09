import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
            // in this if p string length is higher then required sliding window size will also be more as compared to number of element in s string therefore it will provide empty array.
        }
        int []freq=new int[26];
        int []window=new int[26];
        //frequency of p
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;
        }

        //first window
        if(Arrays.equals(freq,window)){
            ans.add(0);
        }

        //sliding  window
        for(int i=p.length();i<s.length();i++){
            //add new character
            window[s.charAt(i)-'a']++;
            //remove old character
            window[s.charAt(i-p.length())-'a']--;

            //compare
            if(Arrays.equals(freq,window)){
                ans.add(i-p.length()+1);
            }


        }
        return ans;
    }
}
