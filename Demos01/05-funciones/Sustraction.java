public class Sustraction {


    static int sustraction (int num1, int num2){
        int result = num1 - num2;
        return result;
        // return num1 - num2;
    }

    static void showResult(int result){
        System.out.println("El resultado es " + result);
    }

    public static void main(String[] args){
        showResult(sustraction(30_400, 28_333));
    }
}