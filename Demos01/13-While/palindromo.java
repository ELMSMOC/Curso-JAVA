public class palindromo {

    public static boolean isPalindrome (String text){
        String initialText = text.toLowerCase();
        String noSpacesText = manageStrings.removeSpaces(initialText);
        String reverseText = manageStrings.reverseString(noSpacesText);
        return noSpacesText.equals(reverseText);
    }

    static void showPalindrome(String text){
        String message = isPalindrome(text)
        ? "Es palindromo"
        : "No es palindromo";
        message = "\"" + text + "\"" + message;
        System.out.println(message);
    }

    public static void main(String[] args) {
        String goodString = "Luz azul";
        showPalindrome(goodString);
    }
}