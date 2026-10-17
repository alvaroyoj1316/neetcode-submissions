class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (Character c: s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                    continue;
                }
                else {
                    return false;
                }
            }
            stack.push(c);
        }
        return stack.isEmpty();


    }
}
