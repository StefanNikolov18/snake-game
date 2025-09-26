package game;

import map.*;
import options.*;
import snake.Snake;

public class Game{


    public Game(){
        //CurrentPosHead
        currentPosHead = new Cell(StartPosOpt.STARTING_ROW_SNAKE,StartPosOpt.STARTING_COL_SNAKE);
        currentPosHead.setType(Cell.CellType.SNAKE);

        //Create snake and place it in start Position
        snake = new Snake(currentPosHead);

        //Create board with fixed dimensions
        board = new Board(BoardOpt.MAX_ROWS,BoardOpt.MAX_COLS);

        //Place snake on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_SNAKE, StartPosOpt.STARTING_COL_SNAKE, Cell.CellType.SNAKE);

        //place Apple on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_APPLE, StartPosOpt.STARTING_COL_APPLE, Cell.CellType.APPLE);

        isAlive = true;

    }

    //public
    public boolean goLeft(){
        Cell upcomingCell = new Cell(currentPosHead.getRow() - 1,currentPosHead.getCol());
        if(!board.checkOutside(upcomingCell))
            return false;

        return true;
    }

    public boolean goRight(){
        Cell upcomingCell = new Cell(currentPosHead.getRow() + 1,currentPosHead.getCol());
        if(!board.checkOutside(upcomingCell))
            return false;

        return true;
    }

    public boolean goUp(){
        Cell upcomingCell = new Cell(currentPosHead.getRow(),currentPosHead.getCol() - 1);
        if(!board.checkOutside(upcomingCell))
            return false;

        return true;
    }

     public boolean goDown(){
        Cell upcomingCell = new Cell(currentPosHead.getRow(),currentPosHead.getCol() + 1);
        if(!board.checkOutside(upcomingCell))
            return false;

        return true;
    }


    public void setAppleRandom(){};
    //private



    //data
    private Snake snake;
    private Cell currentPosHead;
    private Board board;
    private boolean isAlive;
}