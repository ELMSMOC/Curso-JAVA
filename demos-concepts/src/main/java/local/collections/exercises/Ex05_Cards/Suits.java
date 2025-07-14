package local.collections.exercises.Ex05_Cards;

public enum Suits {
    HEARTS ("Corazones"),
    SPADES("Picas"),
    DIAMONDS("Diamantes"),
    CLUBS("Tréboles");

    String translation;

    Suits(String translation){
        this.translation = translation;
    }
}
