package board;

public class ChessBoard {

    private Spot[][] spots = new Spot[8][8];

    public ChessBoard() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < spots.length; i++) {
            for(int j = 0; j < spots[0].length; j++) {
                sb.append(spots[i][j].getPiece().toString());
            }
        }

        return sb.toString();
    }
}
