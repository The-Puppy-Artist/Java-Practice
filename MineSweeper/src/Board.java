public class Board {

    //Variables related to the board
    private char[][] board; //Set to array to make it organized
    private boolean[][] uncovered;
    private int width;
    private int height;

    //Board initializer thingie
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        board = new char[height][width];
        uncovered = new boolean[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                board[y][x] = ' ';
                uncovered[y][x] = false;

            }
        }
    }

    //The two important Width and Height Variables
    //-------------------------------------------
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void placePiece(char piece, int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            board[y][x] = piece;
        }
    }
    //-------------------------------------------

    //Main logic found here
    //-------------------------------------------
    public char getShownPiece(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return '@';
        }
        if (uncovered[y][x]) {
            return board[y][x];
        }
        return '@';
    }

    public char getUncoveredPiece(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return ' ';
        }
        return board[y][x];
    }

    public void uncoverPiece(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            uncovered[y][x] = true;
        }
    }

    //-------------------------------------------

}