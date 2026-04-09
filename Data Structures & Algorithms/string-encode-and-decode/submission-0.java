class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length()).append("#").append(str);
        }
        System.out.println("encode: " + sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j+1; 
            j = j+length+1;
            String item = str.substring(i, j);
            System.out.println(item);
            result.add(item);
            i = j;
        }
        System.out.println(result);
        return result;
    }
}
