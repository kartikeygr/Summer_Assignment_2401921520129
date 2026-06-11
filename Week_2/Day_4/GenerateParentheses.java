class Solution {

    List<String> ans = new ArrayList<>();

    public void solve(int open, int close, int n, String s) {

        // base case
        if(s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        // add opening bracket
        if(open < n) {
            solve(open + 1, close, n, s + "(");
        }

        // add closing bracket
        if(close < open) {
            solve(open, close + 1, n, s + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        solve(0, 0, n, "");
        return ans;
    }
}
