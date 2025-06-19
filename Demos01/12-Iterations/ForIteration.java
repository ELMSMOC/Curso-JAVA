
public class ForIteration {
    
    // public static void main(String[] args) {
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }

    static final int LIMIT = 10;
    static final String[] NAMES = {"Eugenio", "Ernesto", "Sofia", "Aldara", "Julito"};

    static void showInfo(int counter){
        int roundNumb = counter + 1;
        System.out.println("Vuelta nº " + (roundNumb));
    }

    public static void arrayFor (){
        
        for (int i = 0; i < NAMES.length; i++) {
            System.out.println("Hola " + NAMES[i]);
        }
    }

    public static void arrayForEach (){
        for (String item : NAMES) {
            System.out.println("Hola " + item);
        }
    }

    // itera caracteres
    public static void iterateString(){
        String example = "Lo que queramos";
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.charAt(i));
        }
    }


    public static void main(String[] args) {
        // final int LIMIT = 10;
        for (int i = 0; i < LIMIT; i++) {
            showInfo(i);
        };

        arrayFor();

        arrayForEach();

        iterateString();

    }
}
