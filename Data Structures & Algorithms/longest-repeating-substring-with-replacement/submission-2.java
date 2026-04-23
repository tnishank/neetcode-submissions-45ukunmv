class maxItem{
    Character ch;
    int count;
}

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        maxItem item = new maxItem();

        int n = s.length();

        int i = 0, j = 0, maxf = 0, res = 0;

        while (j < n){
            Character ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            item.count = map.get(ch) > item.count ? map.get(ch) : item.count;

            while((j - i + 1) - item.count > k) {
                if(map.get(s.charAt(i)) == item.count && item.ch == ch){
                    item.count--;
                }
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            res = Integer.max((j - i + 1), res);
            j++;
        }

        return res;
    }
}
