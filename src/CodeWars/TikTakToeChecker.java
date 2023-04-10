package CodeWars;

import java.util.*;
import java.util.Arrays;

@SuppressWarnings("DuplicateCondition")
public class TikTakToeChecker {
    public static int checker(int[][] board) {
        /*
        * Check por fila
        * */
        for (int[] row : board) {
            int one = (int) Arrays.stream(row).filter(num -> num == 1).count();
            int two = (int) Arrays.stream(row).filter(num -> num == 2).count();
            if (one == 3) return 1;
            if (two == 3) return 2;
        }
        //Check Por columna
        for (int col = 0; col < board[0].length; col++) {
            int one = 0;
            int two = 0;
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] == 1) one++;
                if (board[row][col] == 2) two++;
            }

            if (one == 3) return 1;
            if (two == 3) return 2;

        }

        //Check por diagonal de esta forma \
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) return 1;
        if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) return 2;

        //Check por diagonal de esta forma /
        if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) return 1;
        if (board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2) return 2;

        //check espacios vasios
        for (int[] row : board) {
            if ( Arrays.stream(row).filter(num -> num == 0).count() > 0) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(checker(new int[][]{ {1, 2, 1},
                                                {1, 1, 2},
                                                {2, 1, 2}}));
    }
}
