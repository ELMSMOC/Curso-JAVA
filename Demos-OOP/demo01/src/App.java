import java.util.Scanner;

import Countability.Data;
import Countability.Invoice;
import Countability.Product;
import base.Person;
import game.Character;
import game.Role;
import game.Species;

public class App {

    // public static void prepareGame(){
    //     Character charac1 = new Character( "Benito", Species.ELFO, 20, Role.CABALLERO, true);
    //     charac1.printCharacter();
    //     Character charac2 = new Character( "Benito", Species.TRASGO, 80, Role.HECHICERO, true);
    //     charac2.printCharacter();
    //     Character.showList();

    //     charac2.renameInvalidCharacters("Manolo");
    //     charac2.printCharacter();
    //     Character.showList();
    // }




      static public void index (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que producto necesita?");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains(answer)) {
   
        };
    }

    public static void main(String[] args) {
        // TESTING INVOICE
        index();
        // ------------------------------------


        // Person person1 = new Person("Jose", 22);
        // Person.counter++;
        // person1.age = 22;
        // person1.name = "Jose";
        // person1.greetings();
        // person1.setAge(26);
        // person1.greetings();
        
        // Person person2 = new Person("Laila",34);
        // Person.counter++;
        // person2.age = 42;
        // person2.name = "Pablo";
        // person2.greetings();

        // System.out.println(Person.counter);

        // prepareGame();

        // CustomData client = new CustomData(false, "Eugenio Lazaro", "C/ General Ricardos 48", "13537648s", "6548789456");

        
    }
}
