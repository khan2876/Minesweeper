public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        Minesweeper game = new Minesweeper(rows, columns, 4);
        game.printBoard();

        System.out.println();

        // This tests your numMinesAdjacent method.
        for (int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                System.out.print(game.numMinesAdjacent(r, c) + " ");
            }
            System.out.println();
        }

    }
}
