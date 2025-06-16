public class revertString {

    static String reverseString(String value){
        String result = "";
        for (int i = 0; i < value.length(); i++) {
                result = value.charAt(i) + result;
            }

        return result;
    }

    // static void countDown(String value){
    //     String result = "";
    //     for (int i = value.length() - 1; i > 0; i = 0; i--) {
    //             result = result + value.charAt(i);
    //         }

    //     return result;
    // }

    // static String removeFirstLast(String value){
    //     String result = "";
    //     for (int i = 1; i < value.length() - 1; i = 0; i++) {
    //             result = value.charAt(i) + result;
    //         }

    //     return result;
    // }

    public static void main(String[] args) {
        String message = "Este es un mensaje para todos";
        String reverse = reverseString(message);
        System.out.println(reverse);
    }
}
