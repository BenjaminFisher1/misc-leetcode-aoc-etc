import java.util.*;

//This solution uses frequency counts to create keys for anagrams.

class Group_Anagrams2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String str : strs){
            int[] freq = new int[26];
            char[] strCharray = str.toCharArray();

            for(char c : strCharray){
                freq[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int count : freq){
                sb.append(count).append('#');
            }

            String key = sb.toString();
            
            if(!hm.containsKey(key)){
               hm.put(key, new ArrayList<>());     
            }
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}