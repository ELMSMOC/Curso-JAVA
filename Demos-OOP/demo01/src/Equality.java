import base.Square;

public class Equality {

    public static void primitives (){
        System.out.println("valores primitivos");
        byte num1 = 5;
        byte num2 = 5;
        System.out.println(num1 == num2); //true
        short num3 = 5;
        System.out.println(num1 == num3); //true 
        int num4 = 5;
        System.out.println(num4 == num2); //true
        float num5 = 5.0f;
        System.out.println(num5 == num2); //true
        char char1 = 'a';
        char char2 = 'b';
        byte valueA = 97;
        System.out.println(char1 == char2); //false
        System.out.println(char1 == valueA); // True por que los char son short en realidad
    
        // boolean bool = true;
        // byte likeBool = 1;
        // System.out.println(bool == likeBool); // no se puede por que no compara el true como un 1 ni el false como un 0
    
        
    }
    
    public static void wrappers(){
        System.out.println("Wrappers de valores primitivos");
        Byte num1 = new Byte("5");
        Byte num2 = new Byte("5");
        
        System.out.println(num1 == num2); //false debido a ser objetos, se comparan sus referencias no valores internos que estan en la memoria
    
        // Integer num3 = new Integer(5); 
        Integer num3 = 5;
        // Integer num4 = new Integer(5);
        Integer num4 = 5;
        System.out.println(num3 == num4); //True por que usa la misma referencia al mismo valor 
        System.out.println(num3 + num4); // Maneja los objetos Integer como valores operables

        System.out.println(num1.toString());
    }
    
    public static void casting (){
        System.out.println("Castings y cohercion de valores primitivos");
        int num1 = 23;
        byte num2 = 20;
        byte result = (byte) (num1 + num2);
        String text = "Result: ";
        System.out.println(text + (num1 + num2));
        
        // double num3 = 3.5;
        // System.out.println(num3*(result));
    }

    public static void compareStrings (){
        System.out.println("Strings and equality");
        String str1 = "Hola mundo";
        String str2 = new String("Hola mundo");
        String str3 = "Hola mundo";
        System.out.println(str1 == str2); //false 
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str3); //true
        String str4 = str2;
        System.out.println(str2 == str4); //true

        str1.toString();
        str1.charAt(2);

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        for (char item : str1.toCharArray()) {
            System.out.println(item);            
        }

        System.out.println("_________________________________________");
        System.out.println(str1.charAt(4));
       
        System.out.println( str1.codePointAt(5)); // numero de codigo de la letra M(109)
        str1.split(" "); // Separa las palabra de un string y devuelve un array con las palabras como elementos
        str1.split(""); // devuelve un array con cada caracter como elemento del array
    }

    public static void compareObjects(){
        System.out.println("Objexts and Equality");
        Square sq1 = new Square(10);
        Square sq2 = new Square(10);
        Square sq3 = sq1;
        System.out.println(sq1 == sq2); //false
        System.out.println(sq1 == sq3); //true
        System.out.println(sq1);
        System.out.println(sq3);
        System.out.println(sq2);
        System.out.println(sq1.equals(sq2)); //false antes por que no estaba sobreescrito el metodo equals
        System.out.println(sq1.equals(sq2)); //True debidoa que sobreescribimos el metodo equals en Square.java
    }
  
    public static void main(String[] args) {
        System.out.println("Metodo contains, igualdad en Java");
        primitives();
        System.out.println("-------------------------------------");
        wrappers();
        System.out.println("-------------------------------------");
        casting();
        System.out.println("-------------------------------------");
        compareStrings();
        System.out.println("-------------------------------------");
        compareObjects();
    }
}
