class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1)
            return chars.length;

        int writeIndex = 0;
        int start = 0;
        for (int end = 1; end < chars.length; end++) {
            if (chars[end] != chars[end - 1]) {
                chars[writeIndex++] = chars[start];
                if (end - start > 1) {
                    for (char digit : String.valueOf(end - start).toCharArray()) {
                        chars[writeIndex++] = digit;
                    }
                }
                start = end;
            }
        }

        chars[writeIndex++] = chars[start];
        if (chars.length - start > 1) {
            for (char digit : String.valueOf(chars.length - start).toCharArray()) {
                chars[writeIndex++] = digit;
            }
        }

        return writeIndex;
    }
}
