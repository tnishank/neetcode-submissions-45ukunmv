class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = Arrays.stream(piles).max().getAsInt();
        int l = 1;
        int r = maxElement;
        int result = r;

        while(l <= r){
            int mid = (l + r)/2;
            int totalHours = 0;

            for(int pile: piles){
                totalHours += Math.ceil((double)pile/mid);
            }

            if(totalHours <= h){
                result = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return result;
    }
}
