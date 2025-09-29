package game;

import java.util.Random;
import map.*;
import options.*;
import snake.Snake;

public class Game{


    public Game(){
        //CurrentPosHead
        currentPosHead = setCurrentPosHead();

        //Create snake and place it in start Position
        snake = new Snake(currentPosHead);

        //Create board with fixed dimensions
        board = new Board(BoardOpt.MAX_ROWS,BoardOpt.MAX_COLS);

         //Place snake on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_SNAKE, StartPosOpt.STARTING_COL_SNAKE, Cell.CellType.SNAKE);

        //place apple on board
        board.setCellType
        (StartPosOpt.STARTING_ROW_APPLE, StartPosOpt.STARTING_COL_APPLE, Cell.CellType.APPLE);

        score = 0;
        rand = new Random();
    }

    //public method for moving the snake on the board
    public boolean goLeft(){return moveInDirection(-1,0);}
    public boolean goRight(){return moveInDirection(1,0);}
    public boolean goUp(){return moveInDirection(0, -1);}
    public boolean goDown(){return moveInDirection(0,1);}

    
    private boolean moveInDirection(int dx, int dy){
         Cell upcomingCell = new Cell(
            currentPosHead.getRow() + dx,
            currentPosHead.getCol() + dy
        );
        
        //checkins
        if(board.isOutside(upcomingCell)) //check is outside
            return false;
        else if(!snake.isSafe(upcomingCell)) //issnake
            return false;

        //moving
        if(upcomingCell.getType() == Cell.CellType.APPLE){
            //next isApple
            eatApple(upcomingCell);
        }
        else{ //is safe to move 
            move(upcomingCell);
        } 
       
        //update currentPosHead
        currentPosHead = upcomingCell;

        return true;
    }

    //private helping methods for moveInDirection(dx,dy)
    private void move(Cell newC){
        board.updateSnakeCell(newC);//update cell Snake in board
        board.updateTailCell(snake.getTail()); //update cell in Tail Empty in board
        snake.move(newC); //move snake
    }

    private void eatApple(Cell newC){
        board.updateSnakeCell(newC);
        snake.eatApple(newC);
        score++;
        if(score < (BoardOpt.MAX_ROWS * BoardOpt.MAX_COLS))
            setAppleRandom();
    }

    private void setAppleRandom(){
        
        int row,col = 0;
        do{
             //20x20 board , index = {0,..,399}
            int index = 
            rand.nextInt(BoardOpt.MAX_ROWS * BoardOpt.MAX_COLS);
        
            row = index / BoardOpt.MAX_COLS; 
            col = index % BoardOpt.MAX_COLS;

        }while(board.getCell(row,col).getType() 
                != Cell.CellType.EMPTY);

        board.getCell(row, col).setType(Cell.CellType.APPLE);
    }

    //restart game
    public void restartGame(){
        board.reset();//Set empty cells,places snake and apple
        currentPosHead = setCurrentPosHead();
        snake.reset(currentPosHead); //reset data
        score = 0;
    }

    private Cell setCurrentPosHead(){
        return new Cell(
            StartPosOpt.STARTING_ROW_SNAKE,
            StartPosOpt.STARTING_COL_SNAKE,
            Cell.CellType.SNAKE
        );
    }

    //data
    private final Snake snake;
    private Cell currentPosHead;
    private final Board board;
    private int score;
    private final Random rand;
}