class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            for (String str : strs) {
                if (str.length() == 0 || i == str.length()) {
                    return result;
                }
                if (str.charAt(i) != first.charAt(i)) {
                    return result;
                }
            }

            result += first.charAt(i);
        }

        return result;
    }
}