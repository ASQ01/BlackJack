package BlackJack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Card {
    private final String name;
    private final int value;
    
    public Card(String name, int value){
        this.name = name;
        this.value = value;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public static List<Card> makeDeck(){

        List<Card> deck = new ArrayList<>();

        for (int i = 2; i <= 10; i++){
            for (int j = 1; j <= 4; j++){
                deck.add(new Card(Integer.toString(i), i));
            }
        }

        for (int i = 1; i <= 4; i++) {
            deck.add(new Card("A", 1));
        }

        for (int i = 1; i <= 4; i++) {
            deck.add(new Card("J", 10));
        }

        for (int i = 1; i <= 4; i++) {
            deck.add(new Card("Q", 10));
        }

        for (int i = 1; i <= 4; i++) {
            deck.add(new Card("K", 10));
        }
        
        Collections.shuffle(deck);
        
        return deck;
    }
    
    public static int checkCards(List<Card> playerDeck){
        int sum = 0;
        int auxsum = 0;
        boolean acefound = false;
        
        for (Card card : playerDeck) {
            if(card.getName().equals("A") && !acefound){
                sum += 1;
                auxsum += 11;
            }
            
            else{
                sum += card.getValue();
                auxsum += card.getValue();
            }
        }
        
        if (sum == 21 || auxsum == 21){
            return 21;
        }
        
        else if (auxsum > sum && auxsum < 21){
            return auxsum;
        }
        
        else if (auxsum > 21){
            return sum;
        }
        
        return sum;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
}
