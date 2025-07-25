package base;

public class Square implements Cloneable {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    // OVERLOAD del constructor
    public Square(Square sq) {
        this(sq.side);
    }

    @Override
    public Object clone() throws CloneNotSupportedException (){
        return (Square) super.clone();
    }

    @Override
    public String toString() {
        return 
        super.toString() + "\n" + "Square {side: %s}".formatted(side);
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Square
             && this.side == ((Square)obj).side){
            return true;
        }
        return false;
    }
}
