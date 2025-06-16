public class palindromo {

    static String removeSpaces(String value){
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            result = value.charAt(i) + result; 
        }

        return result;
    }

    public static void main(String[] args) {
        String message = "Luz azul";
        removeSpaces(message);
        System.out.println(message);
    }
}