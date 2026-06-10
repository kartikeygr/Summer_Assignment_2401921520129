class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length=s.length();
        //try all possible substring lengths
        //we use length/2 because substring repeat after half so it will be easy to compare.
        for(int i=1;i<=length/2;i++){

            // substring length must divide whole string.
            if(length % i==0){
                String sub=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                int times=length/i;

                //repeat substring
                for(int j=0;j<times;j++){
                    sb.append(sub);
                }

                //compare with original string
                if(sb.toString().equals(s)){
                    return true;
                }

            }
        }
        return false;
    }
}
