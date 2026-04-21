class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();

        int n = s.length(), i = 0, j = 0;
        int maxLen = 0;

        while(j < n){
            Character ch = s.charAt(j);
            if(set.contains(ch)){
                while(s.charAt(i) != ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            set.add(ch);
            j++;
            maxLen = Integer.max(maxLen, j-i);

        }

        return maxLen;
    }
}
