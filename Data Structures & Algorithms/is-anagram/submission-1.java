class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(Character ch: s.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }else{
                mp.put(ch, 1);
            }
        }

        for(Character ch: t.toCharArray()){
            if(!mp.containsKey(ch)){
                return false;
            }

            if(mp.get(ch) == 1){
                mp.remove(ch);
            }else{
                mp.put(ch, mp.get(ch)-1);
            }
        }

        return mp.size() == 0? true: false;
    }
}
