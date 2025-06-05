public class Main {
    public static void main(String[] args){
        Character character1 = new Character("Elrond" , 'A');

        Character character2 = new Character("Juanito", 'C');

        System.out.println(character1.name);
        System.out.println(character2.name);
        System.out.println(character1.isZombie);
        System.out.println(character2.isZombie);
    }
}