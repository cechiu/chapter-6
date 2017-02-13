import java.util.*;
public class MagicSquaring {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner keyboard = new Scanner (System.in);

        int [] [] square = new int [3][3];
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
                System.out.println("Input value for row " + (row+1) + " column " + (col+1));
                square[row][col] = keyboard.nextInt();
            }
        }

        int [] sumRow = new int [3];
        int [] sumCol = new int [3];

        int sum = 0;

        for (int row = 0; row < 3; row ++)
        {
            for (int col = 0; col < 3; col ++)
            {
                sum = sum + square[row][col];
                sumRow[row] = sum;
            }
            System.out.println("sum row " + row + "\n" + sumRow[row]);
            sum = 0;
        }

        sum = 0;

        for (int col = 0; col < 3; col ++)
        {
            for (int row = 0; row < 3; row ++)
            {
                sum = sum + square[row][col];
                sumCol[col] = sum;
            }
            System.out.println("sum columns " + col + "\n" + sumCol[col]);
            sum = 0;
        }

        int [] sumDiag = new int [3];
        sum = 0;

        for (int row = 0; row < 3; row++)
        {
            for (int col = 2; col > -1; col--)
            {
                sum = sum + square [row][col];
                sumDiag[row] = sum;
            }
            System.out.println("sum diagonal " + row + "\n" + sumDiag[row]);
            sum = 0;
        }

        int [] sumDiag2 = new int [3];
        sum = 0; 

        for (int col = 0; col < 3; col ++)
        {
            for (int row = 2; row > -1; row --)
            {
                sum = sum + square[row][col];
                sumDiag2[col] = sum;
            }
            System.out.println("sum diagonal 2 " + col + "\n" + sumDiag2[col]);
        }

        boolean bool = false;

        int k = 0; int j = 1; 
        do
        {
            if (sumRow[k] == sumRow[j])
            {
                k = j;
                j += 1;
                bool = true;
            }
            else
            {
                bool = false;
                System.out.println("Not a magic square");
                break;
            }
        } while ((k < 3) && (j >- 1));

        k = 0; j = 1;
        do
        {
            if (sumCol[k] == sumRow[j])
            {
                k = j;
                j += 1;
                bool = true;
            }
            else 
            {
                bool = false;
                System.out.println("Not a magic square");
                break;
            }
        } while ((k < 3) && (j >= -1));



        String TorF = "";
        if (bool = true)
        {
            TorF = "is";
        }
        else if (bool = false)
        {
            TorF = "is not";
        }

        System.out.println("This " + TorF + " a magic square.");

    }

}