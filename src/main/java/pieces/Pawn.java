package pieces;

import pieces.Piece;

/**
 * Created by collinkueter on 4/29/16.
 */
public class Pawn extends Piece {

    @Override
    public boolean isValidMove() {
        return false;
    }

    @Override
    public String toString() {
        return "Pawn";
    }
}
