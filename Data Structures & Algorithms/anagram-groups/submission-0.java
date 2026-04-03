class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(String str: strs){
            char[] chrs = str.toCharArray();
            Arrays.sort(chrs);
            String newStr = new String(chrs);
            mp.putIfAbsent(newStr, new ArrayList<>());
            mp.get(newStr).add(str);
        }

        return new ArrayList<>(mp.values());
    }
}
