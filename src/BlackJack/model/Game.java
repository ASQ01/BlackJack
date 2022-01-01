package BlackJack.model;

public class Game {
    
    /*
    
    SIMULATECARDS():
    
    Esta función está creada para simular una situación de partida para los
    jugadores que no son el crupier. Realmente no es necesaria ya que en una
    situación real pasaremos por parámetro las cartas que cada jugador haya
    escogido con su propia estrategia.
    
    En resumen: esta función es para hacer pruebas de diferentes situaciones que
    se pudieran dar en el juego según qué cartas le toquen a los jugadores que
    no sean el crupier
    
    */
    
    public static void simulateCards(Player player1, Player player2, Player player3, CardMachine deck){
        
        int cardspicked = 1;
        
        while (cardspicked != 0){
            
            cardspicked = 0;
            
            if (Card.checkCards(player1.playerCards()) < 17){
                player1.takeCard(deck.giveCard());
                cardspicked++;
            }
            
            if (Card.checkCards(player2.playerCards()) < 17){
                player2.takeCard(deck.giveCard());
                cardspicked++;
            }
            
            if (Card.checkCards(player3.playerCards()) < 17){
                player3.takeCard(deck.giveCard());
                cardspicked++;
            }
        }
    }
    
    public static void lastRound(Player crupier, CardMachine deck){
        while(Card.checkCards(crupier.playerCards()) < 17){
            crupier.takeCard(deck.giveCard());
        }
    }
    
}
