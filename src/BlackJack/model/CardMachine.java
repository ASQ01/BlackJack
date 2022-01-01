package BlackJack.model;

import java.util.ArrayList;
import java.util.List;


public class CardMachine {
    private List<Card> gameDeck;
    
    public CardMachine(List<Card> deck){
        this.gameDeck = deck;
    }
    
    public Card giveCard(){
        if(this.gameDeck.isEmpty()){
            return null;
        }
        
        else{
            Card card = this.gameDeck.get(this.gameDeck.size()-1);
            this.gameDeck.remove(this.gameDeck.size()-1);
            return card;
        }
    }
    
    public List<Card> remaining(){
        return new ArrayList<Card>(this.gameDeck);
    }
    
}
