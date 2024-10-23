public class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int end = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                end = i; 
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() > 0) {
                    reversed.append(' '); 
                }
                reversed.append(s.substring(i, end)); 
            }
        }
        return reversed.toString();
    }
}
