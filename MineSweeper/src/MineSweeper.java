public class MineSweeper {
    public static void drawLine(int width){
        for(int x=0; x<width; x++)
            System.out.printf("+-");
        System.out.println("+");
    }
    public static void drawCoveredBoard(Board board){
        drawLine(board.getWidth());
        for(int y=0; y<board.getHeight(); y++){
            for(int x=0; x<board.getWidth(); x++){
                System.out.printf("|%c", board.getShownPiece(x, y));
            }
            System.out.println("|");
            drawLine(board.getWidth());
        }
    }
    public static void drawUncoveredBoard(Board board){
        drawLine(board.getWidth());
        for(int y=0; y<board.getHeight(); y++){
            for(int x=0; x<board.getWidth(); x++)
                System.out.printf("|%c", board.getUncoveredPiece(x, y));
            System.out.println("|");
            drawLine(board.getWidth());
        }
    }
    public static void main(String[] args) {
        Board board = new Board(8,5);
        board.placePiece('X', 0, 0); board.placePiece('1', 1, 0);
        board.placePiece('1', 0, 1); board.placePiece('1', 1, 1);
        board.placePiece('X', 4, 4); board.placePiece('X', 5, 4);
        board.placePiece('1', 3, 3); board.placePiece('1', 3, 4);
        board.placePiece('1', 6, 3); board.placePiece('1', 6, 4);
        board.placePiece('2', 4, 3); board.placePiece('2', 5, 3);
        board.uncoverPiece(0, 1); board.uncoverPiece(1, 1);
        board.uncoverPiece(4, 3); board.uncoverPiece(2, 3);
        board.uncoverPiece(7, 4); board.uncoverPiece(7, 3);
        board.uncoverPiece(6, 4);

    // This code cases errors due to out of bounds
    // comment this while testing.
        board.placePiece('X', 7, 5);
        board.placePiece('X', 8, 2);
        board.uncoverPiece(-1, 2);
        System.out.println("Covered");
        drawCoveredBoard(board);
        System.out.println("\nUncovered");
        drawUncoveredBoard(board);
        System.out.println("\nGet specific spaces");
        System.out.println("Map (0,0): |"+board.getShownPiece(0, 0)+"|");
        System.out.println("Map (7,2): |"+board.getShownPiece(7, 2)+"|");
        System.out.println("Map (7,3): |"+board.getShownPiece(7, 3)+"|");
        System.out.println("Map (0,1): |"+board.getShownPiece(0, 1)+"|");
        System.out.println("Unc (0,0): |"+board.getUncoveredPiece(0, 0)+"|");
        System.out.println("Unc (7,2): |"+board.getUncoveredPiece(7, 2)+"|");
        System.out.println("Unc (7,3): |"+board.getUncoveredPiece(7, 3)+"|");
        System.out.println("Unc (0,1): |"+board.getUncoveredPiece(0, 1)+"|");
    }
}