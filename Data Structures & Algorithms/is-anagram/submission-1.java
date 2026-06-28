class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (!hmS.containsKey(s.charAt(i))) {
                hmS.put(s.charAt(i), 1);
            } else {
                hmS.put(s.charAt(i), hmS.get(s.charAt(i)) + 1);
            }

            if (!hmT.containsKey(t.charAt(i))) {
                hmT.put(t.charAt(i), 1);
            } else {
                hmT.put(t.charAt(i), hmT.get(t.charAt(i)) + 1);
            }
        }

        if (hmS.equals(hmT)) {
            return true;
        } else {
            return false;
        }
    }
}