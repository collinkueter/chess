import net.orfjackal.nestedjunit.NestedJUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import pieces.Pawn;
import pieces.Piece;

@RunWith(NestedJUnit.class)
public class PieceTest {

    private final Piece piece = new Pawn();

    public class A_new_piece {

        @Test
        public void is_Pawn() {

        }
    }

}