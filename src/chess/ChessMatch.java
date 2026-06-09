package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;

public class ChessMatch {
    private Board board;

    public ChessMatch () {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int r=0; r < board.getRows(); ++r) {
            for (int c=0; c < board.getColumns(); ++c) {
                mat[r][c] = (ChessPiece) board.piece(r, c);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new King(board, Color.WHITE), new Position(2, 1));
    }
}


