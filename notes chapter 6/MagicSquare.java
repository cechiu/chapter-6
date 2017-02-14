//claire chiu
//feb 13 2017
//magic square

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquare{
    static int rowSum1;
	static int rowSum2;
	static int rowSum3;
	static int rowSum4;

	static int columnSum1;
	static int columnSum2;
	static int columnSum3;
	static int columnSum4;
	
	static int diagonalSum1;
	static int diagonalSum2;
	
	int [][] square = { {16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}  };
                        
    public static void main(String [] args)
    {
        // make a 2d array with an iniitalizer list.
        //If you test this and its not Magic you're waving your wand wrong

        int [][] square = { {16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}  };

                        // magic square or not a magic square, that is the question
        int [][] square1 = { {5,9,1},
                         {7,2,6},
                         {3,4,8}  };

        // Do you belive in magic?
        int [][] square2 = {{11,24, 7,20, 3},
                        { 4,12,25, 8,16},
                        {17, 5,13,21, 9},
                        {10,18, 1,14,22},
                        {23, 6,19, 2,15}  };
        
        System.out.println(square.toString());
    }   
    
    private static boolean checkSums(int[][] square)
    {
        // checks rows
        // get each row's total
		for (int i =0; i < 4;i++){ //top row's total
			rowSum1 += square[0][i];
		}
		
		for (int i =0; i < 4;i++){ //next row's total
			rowSum2 += square[1][i];
		}
		
		for (int i =0; i < 4;i++){ //next row's total
			rowSum3 += square[2][i];
		}
		
		for (int i =0; i < 4;i++){ //bottom row's total
			rowSum4 += square[3][i];
		}
		
		// get each columns totals
		for (int i =0; i < 4;i++){ //first column's total
			columnSum1 += square[i][0];
		}
		
		for (int i =0; i < 4;i++){ //next column's total
			columnSum2 += square[i][1];
		}
		
		for (int i =0; i < 4;i++){ //next column's total
			columnSum3 += square[i][2];
		}
		
		for (int i =0; i < 4;i++){ //last column's total
			columnSum4 += square[i][3];
		}
		
		//get each diagonal's totals
		for (int i =0; i < 4;i++){
			diagonalSum1+= square[i][i]; //this is to get the diagonal that looks like this: \
		}
		
		for (int i = 0; i < 4;i++){
		    diagonalSum2+=square[i][3-i]; //this is to get the diagonal that looks like this: /
		}

		if ((rowSum1 == rowSum2) && (rowSum1 == rowSum3) && (rowSum1 == rowSum4) && (rowSum1 == columnSum1)
				&& (rowSum1 == columnSum2) && (rowSum1 == columnSum3) && (rowSum1 == columnSum4) && (rowSum1 == diagonalSum1)&&(rowSum1 == diagonalSum2)){
			return true;
		} else {
			return false;
		}
    }
    
    public String toString()
    {
        if (checkSums(square))
            return "You have a magic square. The magic number is " +rowSum1+".";
        else
            return "Not a magic square- you're a muggle!";
    }
}