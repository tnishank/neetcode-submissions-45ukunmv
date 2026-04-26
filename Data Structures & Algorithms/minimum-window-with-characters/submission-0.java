class Solution {
    public String minWindow(String s, String t) {
        //add condition if t > s return ""
        if(t.length() > s.length()) return "";

        Map<Character, Integer> targetMap = new HashMap<>();
        for(char ch: t.toCharArray()) {
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }

        int minLen = Integer.MAX_VALUE, need = targetMap.size(), have = 0;
        Map<Character, Integer> window = new HashMap<>();
        int i = 0;
        int l=0, r=0;
        for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);
            window.put(ch, window.getOrDefault(ch, 0)+1);

            if(targetMap.containsKey(ch) && window.get(ch).equals(targetMap.get(ch))){
                have++;
            }

            while(have == need){
                if(minLen > (j-i+1)){
                    l = i;
                    r = j;
                    minLen = r-l+1;
                }
                

                ch = s.charAt(i);
                window.put(ch, window.get(ch)-1);
                if(targetMap.containsKey(ch) && window.get(ch) < targetMap.get(ch)){
                    have--;
                }
                i++;
            }
        }

        return minLen == Integer.MAX_VALUE? "" : s.substring(l, r+1);
    }
}
