import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
        if(m.containsKey(ch)) {
          //if character already exist then m.get(ch) provide the frequency of that character and we increase it frequency by 1.
            m.put(ch,m.get(ch) + 1);
        }else{
            m.put(ch, 1);
        }
    }
    //finding first unique character now
     for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(m.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }
}
