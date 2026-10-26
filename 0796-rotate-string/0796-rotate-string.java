class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false ;
        String d = goal+goal;
        return d.contains(s);
      //  if (s.length() != goal.length()) return false ;
    }
}