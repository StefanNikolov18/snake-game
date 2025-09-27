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

    }


    public boolean goLeft(){
        Cell upcomingCell = new Cell(currentPosHead.getRow() - 1,currentPosHead.getCol());
        if(board.isOutside(upcomingCell)) //check is outside of border
            return false;
        else if(!snake.isSafe(upcomingCell)) //looks is snake
            return false;

        //v isSafeToMove    
        move(upcomingCell);

        return true;
    }

    public boolean goRight(){
        Cell upcomingCell = new Cell(currentPosHead.getRow() + 1,currentPosHead.getCol());
        if(!board.isOutside(upcomingCell))
            return false;
        else if(!snake.isSafe(upcomingCell))
            return false;

         move(upcomingCell);    

        return true;
    }

    public boolean goUp(){
        Cell upcomingCell = new Cell(currentPosHead.getRow(),currentPosHead.getCol() - 1);
        if(!board.isOutside(upcomingCell))
            return false;
        else if(!snake.isSafe(upcomingCell))
            return false;    
            
         move(upcomingCell);    

        return true;
    }

     public boolean goDown(){
        Cell upcomingCell = new Cell(currentPosHead.getRow(),currentPosHead.getCol() + 1);
        if(!board.isOutside(upcomingCell))
            return false;
        else if(!snake.isSafe(upcomingCell))
            return false;

         move(upcomingCell);    

        return true;
    }


    public void setAppleRandom(){};
    //private
    private void move(Cell newC){
        board.updateSnakeCell(newC);//update cell Snake
        board.updateTailCell(snake.getTail()); //update cell in Tail Empty
        snake.move(newC); //move snake
        

        currentPosHead = newC; //?
    }


    //data
    private Snake snake;
    private Cell currentPosHead;
    private Board board;
}