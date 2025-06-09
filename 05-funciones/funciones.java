public class funciones {

    /* Funcion: codigo ejecutable
      */
    static int add(int num1, int num2){
        int result = num1 + num2;
        System.out.println("El resultado es " + result);
        return result;
    }
    
    public static void main(String[] args){
      int firstResult = add(5, 7); 
      add(firstResult, 98_600); 
    }
}