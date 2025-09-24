package map;

import options.BoardOpt;

public class Board{

    public Board(){
        BoardOpt opt = new BoardOpt();
        board = new Cell[opt.MAX_ROWS][opt.MAX_COLS];
        for(int i = 0;i < board.length;++i){
            for(int j = 0;j < board[i].length;++j){
                board[i][j] = new Cell(i,j); //Empty cell
            }
        }
    }

    public Cell[][] getBoard() {
        return board;
    }

    public Cell getCell(int row, int col){
        return board[row][col];
    }

    public void setCellType(int row, int col, Cell.CellType type){
        board[row][col].setType(type);
    }


    private final Cell[][] board;
}