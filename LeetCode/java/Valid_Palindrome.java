class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      
        char[] ca = ns.toCharArray();
        int i = 0;
        int j = ca.length - 1;

        while ( i < j ){
            if(ca[i] != ca[j]){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
}

//125. Valid Palindrome