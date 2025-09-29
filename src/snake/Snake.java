package snake;

import java.util.HashMap;
import java.util.LinkedList;
import map.Cell;

public class Snake{

    public Snake(){
        snake = new LinkedList<>();
        snakeMap = new HashMap<>();
    }

    public Snake(Cell startCell){
        this();
        snake.addFirst(startCell);
        snakeMap.put(startCell,true);
    }

    //getters
    public Cell getHead(){
        return snake.getFirst();
    }
    public Cell getTail(){
        return snake.getLast();
    }

    //looks next Cell
    public boolean isSafe(Cell c){
        return !snakeMap.containsKey(c); // 0(1)
    }

    //added to snake, snakeMap and doesnt remove tail
    public void eatApple(Cell c){ // 0(1)
        snake.addFirst(c);
        snakeMap.put(c,true);
    }

    // snake moves
    public void move(Cell c){   // 0(1)
        snake.addFirst(c); 
        snakeMap.put(c,true);
        removeTail(); 
    }

    //helper for move(Cell)
    private void removeTail(){ // 0(1)
        snakeMap.remove(this.getTail());
        snake.removeLast();
    }

    public void reset(Cell startCell){
        //reset data structures
        snake.clear(); 
        snakeMap.clear();

        //add first cell
        snake.addFirst(startCell);
        snakeMap.put(startCell,true);

    }

    //data
    private LinkedList<Cell> snake;
    private HashMap<Cell,Boolean> snakeMap;
}