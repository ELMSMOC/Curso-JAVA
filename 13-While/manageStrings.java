public class manageStrings {

    // Reverse text

    static String reverseString(String value){
        String result = "";
        for (int i = 0; i < value.length(); i++) {
                result = value.charAt(i) + result;
            }

        return result;
    }

    // Reverse text 2 (countdown)
    
    static String reverseString2(String value){
        String result = "";
        for (int i = value.length()-1; i >= 0; i--) {
                result = value.charAt(i) + result;
            }

        return result;
    }

    // Remove first and last letter
    static String removeFirstLast(String value){
        String result = "";
        for (int i = 1; i < value.length() - 1; i++) {
                result += value.charAt(i);
            }

        return result;
    }

    // Remove white spaces
    static String removeSpaces(String value){
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) != ' '){
                continue;
            }
            result += value.charAt(i);
         }

        return result;
    }

}