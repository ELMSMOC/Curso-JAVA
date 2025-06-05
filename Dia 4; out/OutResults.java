// guardar string con contenido dinamico en variable

public class OutResults {
    
    public static void main(String[] args){

        String name = "Euge";
        String surname = "Lazaro";
        int age = 33;

        String phrase = "Hola " + name + " " + surname + ".\nComo estas a tus " + age + " años?";
        System.out.println(phrase);

        phrase = "Hola %s %s,\nComo estas a tus %s años? \n";
        System.out.printf(phrase, name, surname, age );

        phrase= """
                Hola %s %s,
                Como estas a tus %s años? 
                """;
        System.out.println(phrase.formatted(name, surname, age));
    }
}