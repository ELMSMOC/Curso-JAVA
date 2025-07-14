package local.collections.exercises.Ex05_Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Construya mediante una List<String> una lista que represente una baraja (deck) americana,
// con 4 palos (suits):
// corazones (hearts)
// picas (spades)
// diamantes (diamonds)
// tréboles (clubs)
// 12 cartas cada uno (as (ace), 2, 3,…10, paje (J), reina (Q), rey (K)). 
// Construya el array con dos bucles anidados. 
// Barajela con el método shuffle de Collections. 
// Construya una función repartir que dada una baraja devuelva una mano de “n” cartas, 
// empezando por el final del array (¡la baraja está boca abajo!), 
// use sublistas (subList) y 
// que suprime las cartas de la baraja (método clear), 
// para evitar poder dar dos veces la misma carta. 
// Emplee esta función para repartir “n” cartas a “m” jugadores, 
// recibiendo tanto n como m a través de los argumentos del programa. 
// Previamente debe barajar las cartas,
// para asegurarse que nadie sabe que cartas se repartirán a cada uno.

public class CardsApp {
    
    List<String> deckList = new LinkedList<String>();

    int numPlayers;
    int numHandCards;
    List<List<String>> playerHands =  new LinkedList<>();

    public CardsApp(int numPlayers, int numCards) {
        this.numPlayers = numPlayers;
        this.numHandCards = numCards;
        
        dealCards();
    }

    CardsApp(){
        createDeck();
        Collections.shuffle(deckList);
        // distributeCards(5);
        // distributeCardsAlt(6);
        // distributeCardsAlt(5);
        // distributeCardsAlt(25);
        // System.out.println(deckList);
    }
    
    private void createDeck(){
        for (Suits suit : Suits.values()) {
            for (int j = 2; j <= 10; j++) {
                deckList.add( j + " de " + suit.translation);
            }
            deckList.add("As de " + suit.translation);
            deckList.add("J de " + suit.translation);
            deckList.add("Q de " + suit.translation);
            deckList.add("K de " + suit.translation);
        }
    }

    private void distributeCards(){
        List<String> hand = deckList.subList(deckList.size() - numHandCards, deckList.size());
        System.out.println(hand);
        hand.clear();
    }

    private void distributeCardsAlt(int n){
        List<String> hand = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String card = deckList.removeLast();
            hand.add(card);
        }
        System.out.println(hand);
    }

    private void dealCards(){
        for (int i = 0; i < numPlayers; i++) {
           distributeCards();
        }
    }
    
    public static void main(String[] args) {
        CardsApp c = new CardsApp();
    }
}
