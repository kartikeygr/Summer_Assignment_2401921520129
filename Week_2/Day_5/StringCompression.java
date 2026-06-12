class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char current = chars[i];
            int count =0;
            //count same characters
            while(i<chars.length && chars[i]==current){
                count++;
                i++;
                
            }
            // write characters before count
            chars[index]=current;
            index++;
            // write count if Greater than 1
            if(count>1){
                String str= String.valueOf(count);
                for(int j=0;j<str.length();j++){
                    chars[index]=str.charAt(j);
                    index++;
                }
            }
        
        }
        return index;
    }
}
