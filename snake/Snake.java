package snake;

import java.util.LinkedList;
import map.Cell;

public class Snake{

    public Snake(){
        body = new LinkedList<>();
    }

    public LinkedList<Cell> getBody() {
        return body;
    }

    public void addCellToBody(Cell cell){
        if(cell.getType() != Cell.CellType.APPLE){
             throw new IllegalArgumentException
             ("Cell must be of type APPLE to be added to the snake's body.");
        }
           
        body.addFirst(cell);
    }

    public boolean isCellInBody(Cell cell){
        return body.contains(cell);
    }

    //data
    private LinkedList<Cell> body;
}