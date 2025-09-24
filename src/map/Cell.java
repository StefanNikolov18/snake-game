package map;

public class Cell{
    public enum CellType{
        EMPTY,
        SNAKE,
        APPLE
    }

   //constructors
    public Cell(){
        this(0,0,CellType.EMPTY);
    }

    public Cell(int row, int col, CellType type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    public Cell(int row, int col) {
        this(row,col,CellType.EMPTY);
    }

    //getters
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellType getType() {
        return type;
    }
    
    //setter
    public void setType(final CellType type) {
        this.type = type;
    }

    //data
    private final int row,col;
    private CellType type;
}