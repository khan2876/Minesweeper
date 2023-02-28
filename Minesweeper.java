public class Minesweeper {
    private boolean[][] board;
    private int rows;
    private int columns;
    
    /**
     * This constructor initializes a new minesweeper board with randomly placed mines
     * 
     * DO NOT CHANGE THIS 
     * 
     * @param rows  The number of rows for the board
     * @param columns The number of columns for the board
     * @param numMines The number of mines to be placed on the board
     */
    public Minesweeper(int rows, int columns, int numMines) {
        this.rows = rows;
        this.columns = columns;

        board = new boolean[rows][columns];

        int count = 0;
        while(count < numMines) {
            int r = (int)(Math.random()*rows);
            int c = (int)(Math.random()*columns);
            if (board[r][c] == false) {
                board[r][c] = true;
                count++;
            }
        }
    }

    /**
     * This method checks for surrounding mines.  
     * It will return a count of mines next to the specified location.
     * 
     * If there is a mine at the location, return -1
     * If the row or column are off the board, return -1
     * 
     * This method should make use of the isMine method
     * 
     * Be careful about checking bounds for surrounding locations
     * 
     * @param r row of the location to be checked
     * @param c column of the location to be checked
     * @return The number of mines adjacent
     */
    public int numMinesAdjacent(int r, int c) {
        // TODO: Complete this method
        return 0;
    }

    /**
     * Tells if a space is a mine
     * 
     * @param r row to be checked
     * @param c column to be checked
     * @return whether or not this space is a mine
     */
    public boolean isMine(int r, int c) {
        // TODO: Complete this method too
        return false;
    }

    /**
     * Prints the layout of the mines in this board
     * 
     * DO NOT CHANGE THIS 
     */
    public void printBoard() {
        for (int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                if (board[r][c]) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");                    
                }
            }
            System.out.println();
        }
    }
}