class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        //we use list string to store the new string in which same word sre grouped together as list.
        for(int i =0;i<strs.length;i++){
            char[] arr= strs[i].toCharArray();
            //charArray is to change string into array of character.
            Arrays.sort(arr);
            String key = new String(arr);
            // if group or word already exists, add word into existing list
            if(map.containsKey(key)){
             map.get(key).add(strs[i]);
            }
                // if that word is not exist in list so we create new group then it will add to new list or  it stores in hashmap
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
            
        }
        return new ArrayList<>(map.values());
    }
}
