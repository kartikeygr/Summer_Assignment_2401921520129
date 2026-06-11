class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        //using split we split sentence into word
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            // now reverse current word
            ans.append(sb.reverse());
            
            //add space except the last word
            if(i!=arr.length-1){
                ans.append(" ");
            }

        }
        return ans.toString();  
    }
}
