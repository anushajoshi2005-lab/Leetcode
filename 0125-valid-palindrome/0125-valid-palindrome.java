class Solution {
     public boolean isAlphaNumeric(char c){
      return ( c>='a' && c<='z')
       || (c>='A' && c<='Z') ||
        (c>='0' && c<='9') ;
      //return true ;
     }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int h = n-1;
        int l = 0;
        while(l<h){
            char c1 = s.charAt(l);
            char c2 = s.charAt(h);
        
        if(!isAlphaNumeric(c1)){
            l++ ;
            continue;
        }

        if(!isAlphaNumeric(c2)){
            h-- ;
            continue;
        }

         if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)) return false;
            l++;
            h--;
        }
        return true;
    }
}