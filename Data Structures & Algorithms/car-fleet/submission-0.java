class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] ps = new int[position.length][2];

        for(int i = 0; i < position.length; i++){
            ps[i][0] = position[i];
            ps[i][1] = speed[i];
        }

        Arrays.sort(ps, (ps1, ps2) -> ps2[0] - ps1[0] );

        Stack<Double> stack = new Stack<>();

        for(int i = 0; i < ps.length; i++){

            stack.push((double) (target - ps[i][0])/ps[i][1]);

            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                stack.pop();
            }
        }

        return stack.size();
    }
}
