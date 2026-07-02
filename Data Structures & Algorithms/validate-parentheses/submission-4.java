class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();

        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.addFirst(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char oc = stack.removeFirst();

                if (oc == '(' && c != ')') {
                    return false;
                } else if (oc == '{' && c != '}') {
                    return false;
                } else if (oc == '[' && c != ']') {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
