class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> boxes = new HashMap<>();
        
        for(int i = 0; i < board.length; i++){
        	for(int j = 0; j < board[0].length; j++){
        		if(board[i][j] == '.'){
                    continue;
                } 
        		
        		rows.putIfAbsent(i, new HashSet<>());
        		cols.putIfAbsent(j, new HashSet<>());
        		String box = i/3 + "," + j/3;
        		boxes.putIfAbsent(box, new HashSet<>());
        		
        		char val = board[i][j];
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
