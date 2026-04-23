class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();

        int i = 0, j = 0, maxf = 0, res = 0;

        while (j < n){
            Character ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxf = Integer.max(maxf, map.get(ch));

            while((j - i + 1) - maxf > k) {
                // if(map.get(s.charAt(i)) == maxf){
                //     maxf--;
                // }
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            res = Integer.max((j - i + 1), res);
            j++;
        }

        return res;
    }
}
