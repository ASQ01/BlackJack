package BlackJack.control;

import BlackJack.model.Card;
import BlackJack.model.CardMachine;
import BlackJack.model.Game;
import BlackJack.model.Player;
import BlackJack.view.BlackJackGUI;

public class BlackJack {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player crupier = new Player();
        CardMachine deck = new CardMachine(Card.makeDeck());
        
        Game.simulateCards(player1, player2, player3, deck);
        Game.lastRound(crupier, deck);
        
        BlackJackGUI resultGUI = new BlackJackGUI();
        resultGUI.getWinners(player1.playerCards(), player2.playerCards(), player3.playerCards(), crupier.playerCards(), deck.remaining());
        
        resultGUI.setVisible(true);
        
        System.exit(0);
    }
}
