package pieces;

import config.PieceColor;
import meta.PiecePosition;

public class Rook extends Piece {

    public Rook(PieceColor color, int row, int col) throws Exception {

        super(color, "R", row, col);
        this.power  = 5;
        this.id     = 2;
    }

    @Override
    public boolean isMoveValid(PiecePosition externalPosition) {

        int moveRowCoefficient = this.getCurrentPosition().getRowCoefficient(externalPosition);
        int moveColCoefficient = this.getCurrentPosition().getColCoefficient(externalPosition);

        return  (moveColCoefficient == 0  && moveRowCoefficient > 0) ||
                (moveRowCoefficient == 0 && moveColCoefficient > 0);
    }

    public void attack(int row, int col) {

    }
}
