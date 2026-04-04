class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> cols = new HashMap<>();
        HashMap<String, HashSet<Integer>> boxes = new HashMap<>();

        for(int i=0; i < board.length; i++){
            for(int j=0; j <board[0].length; j++){
                if(board[i][j] == '.') continue;

                int val = board[i][j] - '1';
                String box = i/3 + "," + j/3;
                rows.putIfAbsent(i, new HashSet<>());
                cols.putIfAbsent(j, new HashSet<>());
                boxes.putIfAbsent(box, new HashSet<>());

                if(rows.get(i).contains(val) ||
                    cols.get(j).contains(val) ||
                    boxes.get(box).contains(val)
                    ){
                        return false;
                    }

                rows.get(i).add(val);
                cols.get(j).add(val);
                boxes.get(box).add(val);
            }
        }
        return true;
    }
}
