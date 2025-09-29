package map;

import options.StartPosOpt;

public class Board{

    public Board(int rows,int cols){
       
        board = new Cell[rows][cols];
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

    public void updateSnakeCell(Cell newC){
        board[newC.getRow()][newC.getCol()].
        setType(Cell.CellType.SNAKE);
    }

    public void updateTailCell(Cell newC){
         board[newC.getRow()][newC.getCol()].
        setType(Cell.CellType.EMPTY);
    }

    public boolean isOutside(Cell c){
        return c.getRow() < 0 || c.getCol() < 0 
            || c.getRow() > board.length
            || c.getCol() > board[0].length;
        
    }

    public void reset(){

        for(int i = 0;i < board.length;++i){
            for(int j = 0;j < board[i].length;++j){
                board[i][j].setType(Cell.CellType.EMPTY);
            }
        }

        this.setCellType
        (StartPosOpt.STARTING_ROW_SNAKE, StartPosOpt.STARTING_COL_SNAKE, Cell.CellType.SNAKE);

        //place apple on board
        this.setCellType
        (StartPosOpt.STARTING_ROW_APPLE, StartPosOpt.STARTING_COL_APPLE, Cell.CellType.APPLE);
    }


    private final Cell[][] board;
}