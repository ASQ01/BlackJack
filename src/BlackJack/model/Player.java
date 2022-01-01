package BlackJack.model;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private List<Card> playerdeck;
    
    public Player(){
        this.playerdeck = new ArrayList<>();
    }
    
    public void takeCard(Card card){
        this.playerdeck.add(card);
    }
    
    public List<Card> playerCards(){
        return this.playerdeck;
    }
    
}
