class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int match = 0;

        for(int i = 0; i < 26; i++){
            if(s1Count[i] == s2Count[i]) {
                match++;
            }
        }

        int i = 0;
        for(int j = s1.length(); j < s2.length(); j++) {
            if(match == 26) return true;

            int index = s2.charAt(j) - 'a';
            s2Count[index]++;

            if(s2Count[index] == s1Count[index]){
                match++;
            }else if(s2Count[index] == s1Count[index]+1){
                match--;
            }

            index = s2.charAt(i) - 'a';
            s2Count[index]--;

            if(s1Count[index] == s2Count[index]){
                match++;
            }else if(s1Count[index]-1 == s2Count[index]){
                match--;
            }
            i++;
        }

        return match == 26;
    }
}
