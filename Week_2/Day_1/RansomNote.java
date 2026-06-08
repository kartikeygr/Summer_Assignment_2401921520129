import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // If ransomNote is bigger, impossible
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        HashMap<Character, Integer> m = new HashMap<>();
        // Store frequency of magazine characters
        for(int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if(m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }
        // Check ransomNote characters
        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            // character not available
            if(!m.containsKey(ch) || m.get(ch) == 0) {
                return false;
            }
            // use one character
            m.put(ch, m.get(ch) - 1);
        }
        return true;
    }
}
