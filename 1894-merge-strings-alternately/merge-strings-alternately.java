class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder(); // StringBuilder to store the merged result
        
        int len1 = word1.length(); // Length of word1
        int len2 = word2.length(); // Length of word2
        int minLength = Math.min(len1, len2); // Minimum length of the two strings
        
        // Loop through both strings up to the length of the shorter string
        for (int i = 0; i < minLength; i++) {
            mergedString.append(word1.charAt(i)); // Append character from word1
            mergedString.append(word2.charAt(i)); // Append character from word2
        }
        
        // Append remaining characters from word1 if any
        if (len1 > minLength) {
            mergedString.append(word1.substring(minLength));
        }
        
        // Append remaining characters from word2 if any
        if (len2 > minLength) {
            mergedString.append(word2.substring(minLength));
        }
        
        return mergedString.toString(); // Convert StringBuilder to String and return
    }
}
