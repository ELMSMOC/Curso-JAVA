package game;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class Character {

    private static List<Character> nameList = new ArrayList<Character>();
    
    public static void showList (){
        for (Character name : nameList) {
            System.out.println(name);
        }
    }

    private static boolean isRepeated(String name){
        for (Character nameList : nameList) {
            if (nameList.name.equals(name)){
                return false;    
            }
        }

        return true;
    }

    private UUID id;
    private String name;
    
    private Species species;
    private int life;
    private Role role;
    private boolean isZombie;

    public void printCharacter(){

        String message = """
                Nombre: %s
                Id: %s
                Especie: %s
                Vida: %s
                Rol: %s
                Es zombie? %s
                """;
        System.out.println(message.formatted(name, id, species, life, role, isZombie));
    }
 
    
    public void renameInvalidCharacters(String name) {
        if (nameList.contains(this)){
            return;    
        }
        this.name = name;
        nameList.add(this);
    }

    public Character (String name, Species species, int life, Role role, boolean isZombie){
        this.id = UUID.randomUUID();
        this.name = name;
        this.species = species;
        this.life = life;
        this.role = role;
        this.isZombie = isZombie;

        
        if(isRepeated(this.name)){
            System.out.println("Ya existe tu nombre");
            return;
        } else {
            nameList.add(this);
        };
    }
    

}