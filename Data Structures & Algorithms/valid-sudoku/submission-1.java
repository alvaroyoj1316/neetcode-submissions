class Solution {
    public int findQuadrant(int r, int c) {
        //top : zone 1, mid: zone 2, bottom: zone 3
        int hZone = r / 3;
        int vZone = c / 3;

        return hZone * 3 + vZone;

    }
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> quadrantMap = new HashMap<>();
        Map<Integer, Set<Character>> rowSetMap = new HashMap<>();
        Map<Integer, Set<Character>> columnSetMap = new HashMap<>();

        
        for (int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++)  {
                if (!Character.isLetterOrDigit(board[i][j])) {
                    continue;
                }
                columnSetMap.putIfAbsent(i, new HashSet<Character>());
                if (!columnSetMap.get(i).add(board[i][j])) {
                    return false;
                }
                rowSetMap.putIfAbsent(j, new HashSet<Character>());
                if (!rowSetMap.get(j).add(board[i][j])) {
                    return false;
                }
                int q = findQuadrant(j, i);
                quadrantMap.putIfAbsent(q, new HashSet<Character>());
                if (!quadrantMap.get(q).add(board[i][j])) {
                    return false;
                }

            }

        }
        return true;
        
    }
}
