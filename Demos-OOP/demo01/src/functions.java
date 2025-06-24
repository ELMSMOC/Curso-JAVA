import base.Square;

public class functions {
    public static Square foo(Square sqFoo){
        Square newSq = new Square(sqFoo.side);
        newSq.side *= 2;
        // sqFoo.side *= 2; // No debemos hacer esto por que cambia el valor del param
        return newSq;
    }

    public static void main(String[] args) {
        Square sq1 = new Square(10);
        Square dsp = foo(sq1);
        System.out.println(sq1); //20
        System.out.println(dsp); //20
    }
}
