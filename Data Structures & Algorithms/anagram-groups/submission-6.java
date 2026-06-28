class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> op = new ArrayList<>();

        HashMap<HashMap<Character, Integer>, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> stringHm = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (!stringHm.containsKey(strs[i].charAt(j))) {
                    stringHm.put(strs[i].charAt(j), 1);
                } else {
                    stringHm.put(strs[i].charAt(j), stringHm.get(strs[i].charAt(j)) + 1);
                }
            }
            if (!hm.containsKey(stringHm)) {
                hm.put(stringHm, new ArrayList<String>());
            }
            hm.get(stringHm).add(strs[i]);
        }

        for (List<String> l : hm.values()) {
            op.add(l);
        }
        return op;
    }
}