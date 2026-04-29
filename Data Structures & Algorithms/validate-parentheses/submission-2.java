class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.addFirst(ch);
                continue;
            }

            if(!stack.isEmpty() && (ch == ')' && stack.getFirst() == '(' || ch == '}' && stack.getFirst() == '{' || ch == ']' && stack.getFirst() == '[')){
                stack.removeFirst();
            }else{
                stack.addFirst(ch);
            }
        }

        return stack.isEmpty();
    }
}
