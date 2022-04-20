package BaslangicSeviye.BitirmeProjesi;

import java.util.Scanner;

public class MayinTarlasiOyunu {
    public static void main(String[] args) {
        int gameRow;
        int gameColum;

        Scanner input = new Scanner(System.in);

        System.out.println("MineSweeper Game");
        System.out.println("--------------------------");
        System.out.print("Row Number: "); //min değer(2) belirtilmeli
        gameRow = input.nextInt();

        System.out.print("Colum Number: ");//min değer(2) belirtilmeli
        gameColum = input.nextInt();
        System.out.println("--------------------------");

        MineSweeper game = new MineSweeper(gameRow, gameColum);


        game.runMineSweeperGame();
    }
}
