class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(String str: strs){
            char[] chrs = str.toCharArray();
            int[] hashTable = new int[26]; 
            for(char ch: chrs){
                hashTable[ch-'a'] += 1;
            }
            String key = Arrays.toString(hashTable);
            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(str);
        }

        return new ArrayList<>(mp.values());
    }
}
