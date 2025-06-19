package game;
public class Character {
    private String name;
    private char specie;
    private int life;
    private String role;
    private boolean isZombie;
    
    public Character (String name, char specie, int life, String role, boolean isZombie){
        this.name = name;
        this.specie = specie;
        this.life = life;
        this.role = role;
        this.isZombie = isZombie;

        System.out.printf("Nombre: %s\n
        Especie: %s\n
        Vida: %s\n
        Rol: %s\n
        Es zombie? %s", name, specie, life, role, isZombie);
    }
    

}