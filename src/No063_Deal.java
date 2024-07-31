public class No063_Deal {
    public static void main(String[] args){
        int CARDS_PER_PLAYER = 5;

        // number of players
        int PLAYERS = Integer.parseInt(args[0]);

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        //Length of deck
        int n = SUITS.length * RANKS.length;

        //Set deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++){
            for (int j = 0; j < SUITS.length; j++){
                deck[i*SUITS.length + j] = RANKS[i] + " " + SUITS[j];
            }
        }

        //Shuffle
        for (int i = 0; i < n; i ++){
            int random = i + (int) (Math.random() * (n-i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        //Give the player
        for (int i = 0; i < PLAYERS; i++){
            for (int j = 0; j < CARDS_PER_PLAYER; j++){

            }
        }

    }
}
