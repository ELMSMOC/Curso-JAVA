public class Out {
    
    public static void main(String[] args){

        String name = "Euge";
        String surname = "Lazaro";
        int age = 33;

        //println
        System.out.println("Hola " + name + " " + surname + ".\nComo estas a tus " + age + " años?");
        // printf
        System.out.printf("Hola %s %s,\nComo estas a tus %s años? \n", name, surname, age );
        // println
        System.out.println("""
                Hola %s %s,
                Como estas a tus %s años? 
                """.formatted(name, surname, age));
    }
}