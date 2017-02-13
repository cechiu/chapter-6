public class NimClass
{
    //Declare varaiables
    public int [] _board;

    
    public NimClass()
    {
        //Determing # of stones in each pile at the beginning.
        _board = new int [3];
        _board[0] = 3;
        _board[1] = 5;
        _board[2] = 7;

        System.out.println("Welcome to the Game of Nim\n" +
                           "You'll need to first pick a pile\n" +
                           "Then select how many stones you wish to remove\n");
    }


   //Display the game board
    public void displayBoard()
    {
        for(int row = 0; row < 3; row++)
        {
            if(_board[row] == 0)
                System.out.print("    0    ");
            else
                System.out.print("     " + _board[row] + "   ");
        }
        //Print out the piles
        System.out.println("\n  Pile 1   Pile 2   Pile 3\n");

    }

    //Determine the player's moves
    public boolean playerMove (int pile, int stones)
    {
        if ((pile < 1) || (pile > _board.length))
       {
          return false;
       }

        if (_board[pile - 1] >= stones)
        {
          _board[pile - 1] -= stones;
          return true;
        }
       else
        {
          return false;
        }
    }


    //Determine the winner of the game
    public void determineWinner(int player)
    {
        if(player == 1)
        {
            //Display the results of player 1 winning.
            System.out.println("Player 2 Wins!");
        }

        if(player == 2)
        {
            //Display the results of player 2 winning.
            System.out.println("Player 1 Wins!");
        }
    }
}
