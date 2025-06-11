public class Operators2 {

    // Lógicos

    // && -> AND
    // || -> OR


    static boolean checkAge(int age) {
        System.out.println("Chequeando la edad " + age);
        return age < 25 ? true : false;
    }
    
    public static void main(String[] args){
        int number = 20;
        // number =  number + 3;
        number += 3;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
        
        String job = "Developer";
        int age = 20;

        if (job == "Developer" && checkAge(age) ) {
            System.out.println("Bienvenido a la Hackaton juvenil");
        } else {
            System.out.println("No puedes participar en la Hackaton juvenil");
        }
    }
}