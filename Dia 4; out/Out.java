public class Out {
    
    public static void main(String[] args){

        String name = "Euge";
        String surname = "Lazaro";
        int age = 33;

        System.out.println("Hola " + name + " " + surname + ".\n Como estas a tus " + age + " años?");
        System.out.printf("Hola %s %s,\n Como estas a tus %i años? ", name, surname, age);
    }
}