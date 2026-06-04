class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
// n%2==1 check if there is any centre element or not because centre is only exist in odd matrix i.e. 3*3 matrix, and there is no centre with 4*4 .
//centre will gets add twice time so we subtract the extra time it cames i.e. more then one time.
// matrix length is 3*3 then n=3 therefore 3%2 will be 1 so it means there is centre and for n=4 , 4%2=0 so there is mo centre.
        if(n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}
