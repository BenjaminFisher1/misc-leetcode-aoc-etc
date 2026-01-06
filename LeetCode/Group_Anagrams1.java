import java.util.*;

//This solution uses sorting to create keys for anagrams.

class Group_Anagrams1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] strCharray = str.toCharArray();
            Arrays.sort(strCharray);
            String key = new String(strCharray);

            if(!hm.containsKey(key)){
               hm.put(key, new ArrayList<>());     
            }
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}