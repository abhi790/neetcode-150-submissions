class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; 
        int j = s.length() - 1;
        while(i < j){
            // 
           if(s.charAt(i) == s.charAt(j)){
 
            i++; j--;
           }         

            // first mismatch
           else {
            return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
           }

        }
        
    return true;
    }
    public boolean isPalindrome(String s1, int i, int j){

        while(i < j){

            if(s1.charAt(i) !=
                s1.charAt(j)){
                return false;
            }            
            i++; j--;
        }
        return true;
    }
}