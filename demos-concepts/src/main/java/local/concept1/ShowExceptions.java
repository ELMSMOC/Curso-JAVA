package local.concept1;
// Runtime Exceptions
// 
// NullPointerExceptions

public class ShowExceptions {
    String name = "Pepe";
    
    void makeIndexOutOfBoundsException(){
        // IndexOutOfBoundsException
        System.out.println(name.charAt(12));

    }

    @SuppressWarnings("null")
    void makeNullPointerException(){
        Square nada = null;
        nada.toString();
        nada = new Square(2);
    }

    void makeClassCastException(){
        Object x = (Integer)4;
        System.out.println((String) x);
    }

    public static void main(String[] args) {
        ShowExceptions se = new ShowExceptions();
        try{
            se.makeIndexOutOfBoundsException();

            se.makeNullPointerException();

            se.makeClassCastException();

        } catch (IndexOutOfBoundsException | NullPointerException | ClassCastException e){
            System.err.println("El indice es erroneo");
            System.err.println(e.getClass().getSimpleName() + e.getMessage());
        }

        se.makeNullPointerException();
        System.out.println("Gracias por su visita");
    }
}
