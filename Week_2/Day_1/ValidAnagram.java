class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String sorted = new String(a);
        String sort = new String(b);
        if(sorted.equals(sort)){
            return true;
        }
        return false;

    }
}
