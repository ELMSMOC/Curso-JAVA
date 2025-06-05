public class Character {
    String name;
    int life = 100;
    char type;
    boolean isZombie = false;

    Character(String name, char type){
        this.name = name;
        this.type = type;
    }
}