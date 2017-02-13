import java.util.Scanner;

public class NimGame
{
    public static void main(String[] args)
    {

        //Declare variables
        int player = 1;
        int pile = 0;
        int stones = 0;
        int counter = 0;
        int move;

        Scanner input = new Scanner(System.in);

        NimClass game = new NimClass();
        game.displayBoard();

        while(counter == 0)
        {
            pile = 0;
            stones = 0;
            
            //players chooses the row they are taking from
            System.out.print("Player " + player + ", which pile are you taking" +
                         " from?(1, 2, or 3): ");
            pile = input.nextInt();
            game.playerMove(pile, stones);

            //player chooses how many pearls they take
            System.out.print("Player " + player + ", how many stones do you want to" +
                          " get rid of: ");
            stones = input.nextInt();
            game.playerMove(pile, stones);

            //switches players
            if (player == 1)
                player = 2;
            else
                player = 1;

            //displays the board
            game.displayBoard();
            
            if (game._board [0] == 1 && game._board [1] == 0 && game._board [2] == 0)
                counter = 1;
            else if (game._board [0] == 0 && game._board [1] == 1 && game._board [2] == 0)
                counter = 1;
            else if (game._board [0] == 0 && game._board [1] == 0 && game._board [2] == 1)
                counter = 1;
        }

        game.determineWinner(player);
    }
}
